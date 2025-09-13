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

    fun toggleFavourite(place: Place) {
        val currentPlaces = _places.value?.toMutableList() ?: return
        val index = currentPlaces.indexOfFirst { it.name == place.name }
        if (index != -1) {
            currentPlaces[index] = currentPlaces[index].copy(isFavourite = !currentPlaces[index].isFavourite)
            _places.value = currentPlaces
        }
        // Keep filters applied after toggle
        applyFilters()
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



}