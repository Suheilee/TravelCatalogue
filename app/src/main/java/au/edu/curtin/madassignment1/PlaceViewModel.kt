package au.edu.curtin.madassignment1

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PlaceViewModel: ViewModel() {
    private val _places = MutableLiveData<List<Place>>().apply {
        value = listOf(
            Place(
                name = "Wildflower",
                shortDescription = "Fine dining with seasonal Australian cuisine.",
                longDescription = "An elegant fine dining restaurant offering seasonal, produce-driven dishes inspired by the indigenous ethos of 'the native Australian landscape'.",
                rating = 4.9f,
                image = "https://www.agfg.com.au/restaurant/wildflower-53820",
                isFavourite = true
            ),
            Place(
                name = "Lulu La Delizia",
                shortDescription = "Handmade pasta in a cozy setting.",
                longDescription = "A bustling eatery known for its handmade pasta and Northern Italian cuisine, consistently praised for its authenticity and flavor.",
                rating = 4.8f,
                image = "https://westcoastcafes.com.au/lulu-la-delizia/",
                isFavourite = true
            ),
            Place(
                name = "Madalena’s Bar",
                shortDescription = "Fresh seafood and cocktails in Fremantle.",
                longDescription = "A vibrant spot offering fresh seafood and cocktails, perfect for enjoying the Fremantle Doctor breeze.",
                rating = 4.7f,
                image = "https://www.madalenasbar.com.au/",
                isFavourite = false
            ),
            Place(
                name = "James Parker Sushi & Sake",
                shortDescription = "Modern Japanese dining in Northbridge.",
                longDescription = "A modern Japanese restaurant renowned for its sushi and extensive sake selection.",
                rating = 4.6f,
                image = "https://www.theurbanlist.com/perth/directory/james-parker-sushi-sake",
                isFavourite = false
            ),
            Place(
                name = "La Lune",
                shortDescription = "Classic French bistro with a contemporary twist.",
                longDescription = "A French bistro offering classic dishes with a contemporary twist, set in a cozy atmosphere.",
                rating = 4.5f,
                image = "https://thespaces.com/la-lune-perth/",
                isFavourite = false
            ),
            Place(
                name = "Vin Populi",
                shortDescription = "Relaxed wine bar with seasonal menu.",
                longDescription = "A wine bar and restaurant known for its curated wine list and seasonal menu.",
                rating = 4.5f,
                image = "https://www.broadsheet.com.au/perth/food-and-drink/article/now-open-vin-populi-relaxed-wine-bar-pair-industry-veterans-opens-historic-fremantle-spot",
                isFavourite = false
            ),
            Place(
                name = "The Standard",
                shortDescription = "Rooftop bar with modern Australian cuisine.",
                longDescription = "A rooftop bar and restaurant offering modern Australian cuisine with a laid-back vibe.",
                rating = 4.4f,
                image = "https://www.theurbanlist.com/perth/a-list/best-perth-bars",
                isFavourite = false
            ),
            Place(
                name = "Long Chim",
                shortDescription = "Authentic Thai street food in the city.",
                longDescription = "A Thai restaurant by renowned chef David Thompson, serving bold and flavorful dishes.",
                rating = 4.3f,
                image = "https://www.opentable.com.au/r/long-chim-perth",
                isFavourite = false
            ),
            Place(
                name = "The Heritage",
                shortDescription = "Refined dining experience with local ingredients.",
                longDescription = "A romantic restaurant offering a refined dining experience with a focus on local ingredients.",
                rating = 4.2f,
                image = "https://www.theurbanlist.com/perth/a-list/long-lunch-perth",
                isFavourite = false
            ),
            Place(
                name = "Casa 399",
                shortDescription = "Italian-style bar and restaurant in Mount Hawthorn.",
                longDescription = "An Italian-style bar and restaurant known for its vibrant atmosphere and delicious food.",
                rating = 4.1f,
                image = "https://www.timeout.com/perth/restaurants/casa-399",
                isFavourite = false
            )
        )
    }

    val place: LiveData<List<Place>> = _places
}