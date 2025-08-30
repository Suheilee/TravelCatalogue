package au.edu.curtin.madassignment1

import java.io.Serializable

data class Place(
    val name: String,
    val shortDescription: String,
    val longDescription: String,
    val rating: Float,
    val image: String, // Could be a URL or a drawable resource name
    var isFavourite: Boolean = false
): Serializable

