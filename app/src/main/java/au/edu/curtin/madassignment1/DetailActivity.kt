package au.edu.curtin.madassignment1

import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModelProvider

class DetailActivity : AppCompatActivity() {
    private lateinit var placeViewModel: PlaceViewModel
    private var currentPlace: Place? = null

    private lateinit var favoriteButton: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        placeViewModel = ViewModelProvider(this)[PlaceViewModel::class.java]

        val placeName = intent.getStringExtra("place_name")
        if (placeName != null) {
            currentPlace = placeViewModel.getPlaceByName(placeName)
        }

        val backButton = findViewById<ImageButton>(R.id.btnBack)
        val placeNameTextView = findViewById<TextView>(R.id.textViewPlaceName)
        val placeImageView = findViewById<ImageView>(R.id.imageViewPlace)
        val longDescriptionTextView = findViewById<TextView>(R.id.textLongDescription)
        val ratingBar = findViewById<RatingBar>(R.id.ratingBar)
        favoriteButton = findViewById(R.id.btnFavourite)

        currentPlace?.let { place ->
            placeNameTextView.text = place.name
            placeImageView.setImageResource(place.image)
            longDescriptionTextView.text = place.longDescription
            ratingBar.rating = place.rating
            updateFavoriteButton(place.isFavourite)
        }

        favoriteButton.setOnClickListener {
            currentPlace?.let { place ->
                placeViewModel.toggleFavourite(place.name)
                // Get updated place state
                val updatedPlace = placeViewModel.getPlaceByName(place.name)
                updatedPlace?.let {
                    currentPlace = it
                    updateFavoriteButton(it.isFavourite)
                }
            }
        }

        backButton.setOnClickListener {
            finish()
        }

        ratingBar.setOnRatingBarChangeListener { _, rating, fromUser ->
            if (fromUser) {
                currentPlace?.let { place ->
                    placeViewModel.updateRating(place.name, rating)
                    val updatedPlace = placeViewModel.getPlaceByName(place.name)
                    updatedPlace?.let {
                        currentPlace = it
                    }
                }
            }
        }
    }

    private fun updateFavoriteButton(isFavorite: Boolean) {
        if (isFavorite) {
            favoriteButton.setImageResource(R.drawable.heart_solid)
        } else {
            favoriteButton.setImageResource(R.drawable.heart)
        }
    }
}