package au.edu.curtin.madassignment1

import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText

object SearchHelper {

    fun setupSearch(editText: EditText, viewModel: PlaceViewModel) {
        editText.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                viewModel.setSearchQuery(s.toString())
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
        })
    }
}
