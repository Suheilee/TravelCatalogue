package au.edu.curtin.madassignment1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class DetailFragment : Fragment() {

    private lateinit var placeViewModel: PlaceViewModel
    private var currentPlace: Place? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        currentPlace = arguments?.getSerializable("place") as? Place
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        placeViewModel = ViewModelProvider(requireActivity())[PlaceViewModel::class.java]

        val backButton = view.findViewById<ImageButton>(R.id.btnBack)

        val placeNameTextView = view.findViewById<TextView>(R.id.textViewPlaceName)
        val placeImageView = view.findViewById<ImageView>(R.id.imageViewPlace)
        val longDescriptionTextView = view.findViewById<TextView>(R.id.textLongDescription)
        val ratingBar = view.findViewById<RatingBar>(R.id.ratingBar)

        currentPlace?.let { place ->
            placeNameTextView.text = place.name
            placeImageView.setImageResource(place.image)
            longDescriptionTextView.text = place.longDescription
            ratingBar.rating = place.rating
        }

        // Go back to the main activity
        backButton.setOnClickListener {
            requireActivity().finish()
        }
    }
}