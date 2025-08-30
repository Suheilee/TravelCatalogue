package au.edu.curtin.madassignment1

import java.io.Serializable

data class Place(
    val name: String,
    val shortDescription: String,
    val longDescription: String,
    val rating: Float,
    val image: String, // image URL
    val categories: List<String> = emptyList(),
    var isFavourite: Boolean = false
): Serializable

