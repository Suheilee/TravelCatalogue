package au.edu.curtin.madassignment1

object PlaceManager {
    fun getPlaceByName(name: String): Place? {
        return PlaceData.samplePlaces.find { it.name == name }
    }

    fun toggleFavorite(placeName: String): Boolean {
        val placeIndex = PlaceData.samplePlaces.indexOfFirst { it.name == placeName }
        return if (placeIndex != -1) {
            val currentPlace = PlaceData.samplePlaces[placeIndex]
            PlaceData.samplePlaces[placeIndex] = currentPlace.copy(isFavourite = !currentPlace.isFavourite)
            PlaceData.samplePlaces[placeIndex].isFavourite
        } else {
            false
        }
    }

    fun updateRating(placeName: String, newRating: Float): Boolean {
        val placeIndex = PlaceData.samplePlaces.indexOfFirst { it.name == placeName }
        return if (placeIndex != -1) {
            val currentPlace = PlaceData.samplePlaces[placeIndex]
            PlaceData.samplePlaces[placeIndex] = currentPlace.copy(rating = newRating)
            true
        } else {
            false
        }
    }
}