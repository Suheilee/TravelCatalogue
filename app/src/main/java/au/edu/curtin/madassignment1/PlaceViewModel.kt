package au.edu.curtin.madassignment1

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PlaceViewModel: ViewModel() {
    private val allPlaces = PlaceData.samplePlaces
    private val _places = MutableLiveData<List<Place>>().apply {
        value = PlaceData.samplePlaces
    }

    val place: LiveData<List<Place>> = _places

    private var searchQuery: String = ""
    private var selectedCategories: List<String> = emptyList()

    fun toggleFavourite(place: String) {
        PlaceManager.toggleFavorite(place)
        // Keep filters applied after toggle
        applyFilters()
    }

    fun getPlaceByName(place: String): Place? {
        return PlaceManager.getPlaceByName(place)
    }

    fun setSearchQuery(query: String) {
        searchQuery = query
        applyFilters()
    }

    fun setCategories(categories: List<String>) {
        selectedCategories = categories
        applyFilters()
    }

    private fun applyFilters() {
        _places.value = allPlaces.filter { place ->
            // Search filter
            (searchQuery.isBlank() ||
                    place.name.contains(searchQuery, ignoreCase = true) ||
                    place.shortDescription.contains(searchQuery, ignoreCase = true)) &&
                    // Category filter
                    (selectedCategories.isEmpty() ||
                            place.categories.any { it in selectedCategories })
        }
    }

    fun refreshData() {
        applyFilters()
    }
}