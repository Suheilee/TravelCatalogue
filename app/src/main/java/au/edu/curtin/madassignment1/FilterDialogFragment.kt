package au.edu.curtin.madassignment1

import android.app.Dialog
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.CheckBox
import android.widget.ListView
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment
import androidx.lifecycle.ViewModelProvider


class FilterDialogFragment : DialogFragment() {

    private lateinit var placeViewModel: PlaceViewModel

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        placeViewModel = ViewModelProvider(requireActivity())[PlaceViewModel::class.java]

        val placesList = PlaceData.samplePlaces
        val allCategories = placesList.flatMap { it.categories }.distinct().toTypedArray()

        val dialogView = requireActivity().layoutInflater.inflate(R.layout.fragment_filter_dialog, null)
        val favouritesCheckbox = dialogView.findViewById<CheckBox>(R.id.favouritesCheckbox)
        val categoryList = dialogView.findViewById<ListView>(R.id.categoryList)

        // Pre-check favourites
        favouritesCheckbox.isChecked = placeViewModel.isFavouritesOnly()

        // Populate category list
        categoryList.adapter = ArrayAdapter(
            requireContext(),
            android.R.layout.simple_list_item_multiple_choice,
            allCategories
        )

        // Restore previous category selections
        val selectedCategories = placeViewModel.getSelectedCategories()
        for (i in allCategories.indices) {
            if (selectedCategories.contains(allCategories[i])) {
                categoryList.setItemChecked(i, true)
            }
        }

        return AlertDialog.Builder(requireContext())
            .setTitle("Select Filters")
            .setView(dialogView)
            .setPositiveButton("Apply") { _, _ ->
                val chosenCategories = mutableListOf<String>()
                for (i in 0 until categoryList.count) {
                    if (categoryList.isItemChecked(i)) {
                        chosenCategories.add(allCategories[i])
                    }
                }
                placeViewModel.setCategories(chosenCategories)
                placeViewModel.setFavouritesOnly(favouritesCheckbox.isChecked)
            }
            .setNegativeButton("Cancel", null)
            .create()
    }
}
