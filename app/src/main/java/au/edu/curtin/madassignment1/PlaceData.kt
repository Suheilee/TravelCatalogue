package au.edu.curtin.madassignment1

object PlaceData {
    val samplePlaces = mutableListOf(
        Place(
            name = "Wildflower",
            shortDescription = "Fine dining with seasonal Australian cuisine.",
            longDescription = "Nestled in the heart of Perth's cultural precinct, Wildflower represents the pinnacle of contemporary Australian dining. " +
                    "Chef Jed Gerrard crafts an ever-evolving menu that celebrates Western Australia's incredible native ingredients, " +
                    "from coastal herbs to unique indigenous spices. The restaurant's floor-to-ceiling windows offer breathtaking views of the Swan River, " +
                    "while the sophisticated interior design creates an intimate atmosphere perfect for special occasions. Each dish tells a story of the land, " +
                    "featuring locally sourced produce from small-scale farmers and fishermen. The wine list exclusively showcases premium Western Australian vintages, " +
                    "carefully selected to complement the seasonal offerings. Service is impeccable, with knowledgeable staff who can guide you through both the culinary " +
                    "journey and the extensive wine selection.",
            rating = 4.9f,
            image = R.drawable.wildflower,
            categories = listOf("Perth City", "Fine Dining", "Australian", "Romantic", "Expensive", "Outdoor Seating"),
            isFavourite = true
        ),
        Place(
            name = "Lulu La Delizia",
            shortDescription = "Handmade pasta in a cozy setting.",
            longDescription = "Step into Lulu La Delizia and you'll feel like you've been transported to a bustling trattoria in Northern Italy. This beloved Perth " +
                    "institution has been serving authentic handmade pasta for over two decades, with recipes passed down through generations of Italian families. " +
                    "Watch through the open kitchen as skilled pasta makers roll, cut, and shape fresh dough throughout the day. The menu changes seasonally, " +
                    "featuring classics like osso buco with saffron risotto in winter, and lighter seafood linguine with local prawns in summer. The wine cellar boasts " +
                    "over 200 Italian labels, from bold Barolos to crisp Pinot Grigios. The atmosphere is warm and convivial, with checkered tablecloths, dim lighting, " +
                    "and the constant hum of happy diners. Reservations are essential, especially on weekends when locals and tourists alike queue for a taste of " +
                    "authentic Italian hospitality.",
            rating = 4.8f,
            image = R.drawable.lulu_la_delizia,
            categories = listOf("Perth City", "Italian", "Casual Dining", "Moderate", "Family Friendly"),
            isFavourite = true
        ),
        Place(
            name = "Madalena’s Bar",
            shortDescription = "Fresh seafood and cocktails in Fremantle.",
            longDescription = "Perched on the edge of Fremantle's historic fishing boat harbour, Madalena's Bar captures the essence of coastal dining with its " +
                    "spectacular waterfront location and commitment to ultra-fresh seafood. The daily menu depends entirely on what the local fishing boats bring in " +
                    "each morning - from succulent blue swimmer crabs and Western Rock lobsters to delicate dhufish and pink snapper. The bar's talented mixologists " +
                    "create innovative cocktails using native Australian botanicals, while the outdoor terrace offers uninterrupted views of bobbing yachts and working " +
                    "fishing vessels. As the sun sets over the Indian Ocean, the atmosphere transforms from casual daytime dining to romantic evening entertainment. " +
                    "Live acoustic music on Friday nights adds to the maritime charm, while the raw bar serves the freshest oysters in Perth. The industrial-chic interior, " +
                    "with exposed brick walls and nautical touches, perfectly complements the relaxed Fremantle vibe.",
            rating = 4.7f,
            image = R.drawable.madalenas_bar,
            categories = listOf("Fremantle", "Seafood", "Bar", "Casual Dining", "Outdoor Seating"),
            isFavourite = false
        ),
        Place(
            name = "James Parker Sushi & Sake",
            shortDescription = "Modern Japanese dining in Northbridge.",
            longDescription = "Hidden away in a converted warehouse in trendy Northbridge, James Parker Sushi & Sake offers an authentic Japanese experience that rivals " +
                    "the best establishments in Tokyo. Head chef Takeshi Yamamoto, trained in traditional Edomae techniques, sources the finest local and imported " +
                    "ingredients to create both classic and innovative sushi. The omakase experience takes diners on a journey through seasonal Japanese flavors, while " +
                    "the extensive sake collection features rare bottles from small-batch producers across Japan. The minimalist interior design, featuring natural wood, " +
                    "stone, and soft lighting, creates a zen-like atmosphere perfect for appreciating the artistry of each dish. Watch the master sushi chefs at work " +
                    "from the cypress wood counter, where each piece is carefully crafted and presented with ceremony. Beyond sushi, the menu includes modern " +
                    "interpretations of Japanese classics like miso-glazed kingfish and wagyu beef tataki. The knowledgeable sake sommelier can guide you through " +
                    "perfect pairings for every course.",
            rating = 4.6f,
            image = R.drawable.james_parker_sushi_and_sake,
            categories = listOf("Northbridge", "Japanese", "Casual Dining", "Moderate", "Bar"),
            isFavourite = false
        ),
        Place(
            name = "La Lune",
            shortDescription = "Classic French bistro with a contemporary twist.",
            longDescription = "La Lune transports diners to the romantic bistros of Paris with its authentic French cuisine and intimate atmosphere. Chef Philippe " +
                    "Dubois, trained in Lyon's legendary kitchens, brings traditional techniques to bear on both classic dishes and modern interpretations. The menu " +
                    "changes with the seasons, featuring rich winter fare like coq au vin and beef bourguignon, while summer brings lighter options such as " +
                    "bouillabaisse and ratatouille niçoise. The carefully curated French wine list includes both prestigious Bordeaux and Burgundy alongside hidden " +
                    "gems from lesser-known regions. The interior design evokes a Parisian brasserie with its banquette seating, art nouveau mirrors, and vintage " +
                    "French posters, while candlelit tables create an undeniably romantic atmosphere. Service follows the French tradition of knowledgeable, " +
                    "professional waitstaff who take pride in guiding guests through the culinary experience. The adjoining wine bar offers an extensive selection of " +
                    "French cheeses and charcuterie, perfect for a pre-dinner aperitif or casual evening with friends.",
            rating = 4.5f,
            image = R.drawable.la_lune,
            categories = listOf("Perth City", "French", "Fine Dining", "Romantic", "Moderate"),
            isFavourite = false
        ),
        Place(
            name = "Vin Populi",
            shortDescription = "Relaxed wine bar with seasonal menu.",
            longDescription = "Vin Populi epitomizes the relaxed sophistication of modern Australian wine culture, offering an ever-changing selection of natural and " +
                    "organic wines from boutique producers across the country. The knowledgeable team are passionate about discovering emerging winemakers and " +
                    "unusual varietals, creating a wine list that's both educational and exciting. The seasonal menu, designed specifically to complement the wine " +
                    "selection, features shared plates that highlight local produce at its peak. Think house-made charcuterie, artisanal cheeses, and inventive " +
                    "vegetable dishes that change weekly based on what's available from local farms. The industrial-chic space, with its exposed beams, concrete floors, " +
                    "and living green wall, creates a contemporary yet comfortable atmosphere. The outdoor courtyard, strung with fairy lights and surrounded by herb " +
                    "gardens, is perfect for long summer evenings. Regular wine education events, including tastings with visiting winemakers and food pairing dinners, " +
                    "make this a destination for serious wine enthusiasts and casual drinkers alike.",
            rating = 4.5f,
            image = R.drawable.vin_populi,
            categories = listOf("Fremantle", "Wine Bar", "Casual Dining", "Moderate", "Outdoor Seating"),
            isFavourite = false
        ),
        Place(
            name = "The Standard",
            shortDescription = "Rooftop bar with modern Australian cuisine.",
            longDescription = "Perched seven stories above Perth's bustling Northbridge district, The Standard offers one of the city's most spectacular dining " +
                    "experiences with panoramic views stretching from the Swan River to the distant hills. The modern Australian menu showcases the best of local " +
                    "ingredients with an international twist - think Rottnest Island scallops with XO sauce, Margaret River wagyu with native pepper, and Fremantle " +
                    "sardines with finger lime. The rooftop setting is enhanced by a stunning glass-walled dining room that opens completely to the elements, while " +
                    "the outdoor terrace features comfortable lounge areas and a striking infinity edge that seems to blend with the city skyline. The cocktail program " +
                    "is equally impressive, featuring house-distilled spirits and native botanicals in creative combinations. As day turns to night, the space " +
                    "transforms with ambient lighting and occasional DJ sets that create a sophisticated party atmosphere. The sunset views alone are worth the " +
                    "visit, but the exceptional food and service make The Standard a complete sensory experience that captures the energy and beauty of contemporary " +
                    "Perth.",
            rating = 4.4f,
            image = R.drawable.the_standard,
            categories = listOf("Perth City", "Modern Australian", "Rooftop", "Casual Dining", "Moderate"),
            isFavourite = false
        ),
        Place(
            name = "Long Chim",
            shortDescription = "Authentic Thai street food in the city.",
            longDescription = "Long Chim brings the vibrant energy and bold flavors of Bangkok's street food scene to the heart of Perth, under the expert guidance " +
                    "of renowned chef David Thompson, one of the world's leading authorities on Thai cuisine. The menu reads like a love letter to Thailand's hawker " +
                    "culture, featuring intensely flavored dishes that balance sweet, sour, salty, and spicy elements in perfect harmony. Signature dishes include " +
                    "the famous som tam (green papaya salad) with its fiery heat and fresh herbs, tender beef massaman curry slow-cooked with aromatic spices, and " +
                    "stir-fried morning glory that captures the essence of Thai street-side cooking. The industrial-style interior, with its concrete floors, exposed " +
                    "ductwork, and communal tables, recreates the casual atmosphere of a Bangkok food market. The open kitchen allows diners to watch as chefs work " +
                    "over roaring wok burners, filling the space with intoxicating aromas. An extensive Thai beverage menu includes traditional drinking vinegars, " +
                    "fresh coconut water, and Thai-style cocktails made with local spirits and imported ingredients like galangal and lemongrass.",
            rating = 4.3f,
            image = R.drawable.long_chim,
            categories = listOf("Perth City", "Thai", "Casual Dining", "Moderate", "Spicy"),
            isFavourite = false
        ),
        Place(
            name = "The Heritage",
            shortDescription = "Refined dining experience with local ingredients.",
            longDescription = "The Heritage occupies a beautifully restored 1920s heritage building in Perth's cultural quarter, where history meets contemporary " +
                    "culinary excellence. Executive Chef Sarah Chen has created a menu that pays homage to both the building's past and Western Australia's " +
                    "incredible natural bounty. Each dish tells a story of the region, from Shark Bay prawns and Esperance lamb to Perth Hills truffles and " +
                    "Pemberton marron. The tasting menu changes seasonally, always featuring the finest local ingredients prepared with classical techniques and " +
                    "modern creativity. The wine program focuses exclusively on Western Australian producers, with an impressive collection of aged bottles from " +
                    "legendary vineyards alongside exciting discoveries from emerging winemakers. The dining room, with its original pressed tin ceilings, leadlight " +
                    "windows, and polished jarrah floors, exudes old-world elegance while maintaining an intimate, romantic atmosphere. Service is attentive but " +
                    "unobtrusive, with staff who can share the fascinating history of both the building and the ingredients on your plate. The Heritage offers " +
                    "multiple dining experiences, from the formal dining room to a more casual wine bar area, all maintaining the same commitment to excellence.",
            rating = 4.2f,
            image = R.drawable.the_heritage,
            categories = listOf("Perth City", "Modern Australian", "Fine Dining", "Romantic", "Expensive"),
            isFavourite = false
        ),
        Place(
            name = "Casa 399",
            shortDescription = "Italian-style bar and restaurant in Mount Hawthorn.",
            longDescription = "Casa 399 captures the spirited essence of Italian aperitivo culture in the trendy Mount Hawthorn neighborhood, where locals gather " +
                    "for excellent food, great wine, and lively conversation. The menu spans the length of Italy, from Sicilian arancini and Calabrian 'nduja to " +
                    "Northern Italian risottos and Venetian cicchetti. The pasta is made fresh daily using traditional methods, while the pizza emerges from a " +
                    "custom-built wood-fired oven that dominates the open kitchen. The extensive Italian wine list features both well-known labels and exciting " +
                    "natural wines from small family producers, served by the glass or bottle in a relaxed, convivial atmosphere. The interior design celebrates " +
                    "Italian craftsmanship with handmade tiles, vintage Vespa memorabilia, and warm lighting that makes everyone look good. The covered outdoor " +
                    "area, with its retractable roof and heaters, extends the dining season year-round and creates the perfect setting for long, leisurely meals " +
                    "with friends. Regular events include wine tastings, cooking classes, and live music that transforms the space into a true Italian social hub. " +
                    "The staff's genuine enthusiasm for Italian culture and cuisine makes every visit feel like a mini-vacation to the Mediterranean.",
            rating = 4.1f,
            image = R.drawable.casa_399,
            categories = listOf("Mount Hawthorn", "Italian", "Bar", "Casual Dining", "Moderate"),
            isFavourite = false
        )
    )
}
