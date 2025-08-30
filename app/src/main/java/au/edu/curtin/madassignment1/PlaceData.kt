package au.edu.curtin.madassignment1

object PlaceData {
    val samplePlaces = listOf(
        Place(
            name = "Wildflower",
            shortDescription = "Fine dining with seasonal Australian cuisine.",
            longDescription = "Elegant restaurant offering seasonal, produce-driven dishes inspired by Australian native ingredients.",
            rating = 4.9f,
            image = R.drawable.wildflower,
            categories = listOf("Perth City", "Fine Dining", "Australian", "Romantic", "Expensive", "Outdoor Seating"),
            isFavourite = true
        ),
        Place(
            name = "Lulu La Delizia",
            shortDescription = "Handmade pasta in a cozy setting.",
            longDescription = "Bustling eatery known for its handmade pasta and Northern Italian cuisine, praised for authenticity and flavor.",
            rating = 4.8f,
            image = android.R.drawable.ic_menu_gallery,
            categories = listOf("Perth City", "Italian", "Casual Dining", "Moderate", "Family Friendly"),
            isFavourite = true
        ),
        Place(
            name = "Madalena’s Bar",
            shortDescription = "Fresh seafood and cocktails in Fremantle.",
            longDescription = "Vibrant spot offering fresh seafood and cocktails, perfect for enjoying the Fremantle atmosphere.",
            rating = 4.7f,
            image = android.R.drawable.ic_menu_gallery,
            categories = listOf("Fremantle", "Seafood", "Bar", "Casual Dining", "Outdoor Seating"),
            isFavourite = false
        ),
        Place(
            name = "James Parker Sushi & Sake",
            shortDescription = "Modern Japanese dining in Northbridge.",
            longDescription = "Modern Japanese restaurant renowned for its sushi and extensive sake selection.",
            rating = 4.6f,
            image = android.R.drawable.ic_menu_gallery,
            categories = listOf("Northbridge", "Japanese", "Casual Dining", "Moderate", "Bar"),
            isFavourite = false
        ),
        Place(
            name = "La Lune",
            shortDescription = "Classic French bistro with a contemporary twist.",
            longDescription = "French bistro offering classic dishes with a contemporary twist, set in a cozy atmosphere.",
            rating = 4.5f,
            image = android.R.drawable.ic_menu_gallery,
            categories = listOf("Perth City", "French", "Fine Dining", "Romantic", "Moderate"),
            isFavourite = false
        ),
        Place(
            name = "Vin Populi",
            shortDescription = "Relaxed wine bar with seasonal menu.",
            longDescription = "Wine bar and restaurant known for its curated wine list and seasonal menu.",
            rating = 4.5f,
            image = android.R.drawable.ic_menu_gallery,
            categories = listOf("Fremantle", "Wine Bar", "Casual Dining", "Moderate", "Outdoor Seating"),
            isFavourite = false
        ),
        Place(
            name = "The Standard",
            shortDescription = "Rooftop bar with modern Australian cuisine.",
            longDescription = "Rooftop bar and restaurant offering modern Australian cuisine with a laid-back vibe.",
            rating = 4.4f,
            image = android.R.drawable.ic_menu_gallery,
            categories = listOf("Perth City", "Modern Australian", "Rooftop", "Casual Dining", "Moderate"),
            isFavourite = false
        ),
        Place(
            name = "Long Chim",
            shortDescription = "Authentic Thai street food in the city.",
            longDescription = "Thai restaurant by renowned chef David Thompson, serving bold and flavorful dishes.",
            rating = 4.3f,
            image = android.R.drawable.ic_menu_gallery,
            categories = listOf("Perth City", "Thai", "Casual Dining", "Moderate", "Spicy"),
            isFavourite = false
        ),
        Place(
            name = "The Heritage",
            shortDescription = "Refined dining experience with local ingredients.",
            longDescription = "Romantic restaurant offering a refined dining experience with a focus on local ingredients.",
            rating = 4.2f,
            image = android.R.drawable.ic_menu_gallery,
            categories = listOf("Perth City", "Modern Australian", "Fine Dining", "Romantic", "Expensive"),
            isFavourite = false
        ),
        Place(
            name = "Casa 399",
            shortDescription = "Italian-style bar and restaurant in Mount Hawthorn.",
            longDescription = "Italian-style bar and restaurant known for its vibrant atmosphere and delicious food.",
            rating = 4.1f,
            image = android.R.drawable.ic_menu_gallery,
            categories = listOf("Mount Hawthorn", "Italian", "Bar", "Casual Dining", "Moderate"),
            isFavourite = false
        )
    )
}
