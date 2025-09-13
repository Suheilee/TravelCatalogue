package au.edu.curtin.madassignment1

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.appcompat.app.AlertDialog
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    private var placesList = PlaceData.samplePlaces
    private lateinit var placeViewModel: PlaceViewModel
    private var allPlaces: List<Place> = emptyList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        placeViewModel = ViewModelProvider(this)[PlaceViewModel::class.java]

        if(savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.list_container, ListFragment())
                .commit()
        }


        val searchBar = findViewById<EditText>(R.id.searchBar)
        val filterButton = findViewById<Button>(R.id.filterButton)

        // Live Search
        searchBar.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                placeViewModel.setSearchQuery(s.toString())
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
        })

        fun showCategoryFilterDialog() {
            // Extract all unique categories from your places list
            val allCategories = placesList.flatMap { it.categories }.distinct().toTypedArray()
            val selectedItems = BooleanArray(allCategories.size) { index ->
                placeViewModel.getSelectedCategories().contains(allCategories[index])
            }

            // Show multi-choice dialog
            AlertDialog.Builder(this)
                .setTitle("Select Categories")
                .setMultiChoiceItems(allCategories, selectedItems) { _, which, isChecked ->
                    selectedItems[which] = isChecked
                }
                .setPositiveButton("Apply") { _, _ ->
                    // Get the categories user selected
                    val chosenCategories = allCategories.filterIndexed { index, _ -> selectedItems[index] }
                    placeViewModel.setCategories(chosenCategories)
                }
                .setNegativeButton("Cancel", null)
                .show()
        }

        // Filter by Favourites
        filterButton.setOnClickListener {
            showCategoryFilterDialog()
        }
    }

    override fun onResume() {
        super.onResume()
        placeViewModel.refreshData()
    }
}