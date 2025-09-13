package au.edu.curtin.madassignment1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    private lateinit var placeViewModel: PlaceViewModel

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

        //Live search
        SearchHelper.setupSearch(searchBar, placeViewModel)

        // Filter by Favourites
        filterButton.setOnClickListener {
            FilterDialogFragment().show(supportFragmentManager, "FilterDialog")
        }
    }

    override fun onResume() {
        super.onResume()
        placeViewModel.refreshData()
    }
}