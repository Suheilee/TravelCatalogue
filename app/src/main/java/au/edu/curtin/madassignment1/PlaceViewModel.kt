package au.edu.curtin.madassignment1

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PlaceViewModel: ViewModel() {
    private val _places = MutableLiveData<List<Place>>().apply {
        value = PlaceData.samplePlaces
    }

    val place: LiveData<List<Place>> = _places

    fun toggleFavourite(place: Place) {
        val currentPlaces = _places.value?.toMutableList() ?: return
        val index = currentPlaces.indexOfFirst { it.name == place.name }
        if (index != -1) {
            currentPlaces[index] = currentPlaces[index].copy(isFavourite = !currentPlaces[index].isFavourite)
            _places.value = currentPlaces
        }
    }
}