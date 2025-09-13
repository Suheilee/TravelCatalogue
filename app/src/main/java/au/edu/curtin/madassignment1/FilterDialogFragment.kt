package au.edu.curtin.madassignment1

import android.app.Dialog
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import androidx.fragment.app.DialogFragment
import androidx.lifecycle.ViewModelProvider


/**
 * A simple [Fragment] subclass.
 * Use the [FilterDialogFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FilterDialogFragment : DialogFragment() {

    private lateinit var placeViewModel: PlaceViewModel

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        placeViewModel = ViewModelProvider(requireActivity())[PlaceViewModel::class.java]

        val placesList = PlaceData.samplePlaces
        val allCategories = placesList.flatMap { it.categories }.distinct().toTypedArray()
        val selectedItems = BooleanArray(allCategories.size) { index ->
            placeViewModel.getSelectedCategories().contains(allCategories[index])
        }

        return AlertDialog.Builder(requireContext())
            .setTitle("Select Categories")
            .setMultiChoiceItems(allCategories, selectedItems) { _, which, isChecked ->
                selectedItems[which] = isChecked
            }
            .setPositiveButton("Apply") { _, _ ->
                val chosenCategories = allCategories.filterIndexed { index, _ -> selectedItems[index] }
                placeViewModel.setCategories(chosenCategories)
            }
            .setNegativeButton("Cancel", null)
            .create()
    }
}