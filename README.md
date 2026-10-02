# 📍 Catalog App

A mobile catalog application developed for Android, allowing users to browse, search, filter, favourite, and rate catalog items. The application provides a two-level navigation structure with a main catalog view and a detailed item view.

## ✨ Features

* 🔎 **Real-Time Search** — Search the catalog by item name and dynamically update the displayed results.
* 🔍 **Multi-Category Filtering** — Filter items by one or more categories using checkboxes.
* ❤️ **Favourites** — Add or remove items from a personal favourites list.
* ⭐ **Adjustable Ratings** — Manually adjust an item's rating using an interactive star control.
* 🔄 **Reset** — Clear all active filters and search queries and return to the default catalog view.
* 📖 **Detail View** — View an item's image, description, rating, and favourite status.
* ⚡ **Dynamic Content** — The catalog updates immediately as users search, filter, or modify favourites and ratings.

## 🏗️ App Structure

The application uses two Activities and two Fragments to separate major areas of functionality:

```text
MainActivity
│
├── ListFragment
│   └── RecyclerView
│       └── PlaceAdapter
│
└── FilterDialogFragment
        └── Category & Favourite Filters

DetailActivity
├── Item Image
├── Description
├── Adjustable Rating
└── Favourite Toggle
```

### Main Screen

The main screen contains the catalog list, search functionality, filter controls, and reset functionality.

The **Filter** button opens a `FilterDialogFragment`, where users can select multiple categories and optionally filter by favourites. Selecting **Apply** updates the catalog using the selected criteria, while **Cancel** closes the dialog without changing the currently applied filters.

The **Reset** button clears both filters and search queries, returning the catalog to its default state.

### Detail Screen

Selecting an item opens `DetailActivity`, providing a more detailed view including:

* Enlarged item image
* Detailed description
* Interactive star rating
* Favourite toggle

The rating control allows users to override the default rating according to their own preferences.

## 🧩 Architecture & Components

### Activities

* `MainActivity` — Manages the main catalog screen and its lifecycle.
* `DetailActivity` — Manages the detailed item view and its lifecycle.

### Fragments

* `ListFragment` — Contains the `RecyclerView` used to display catalog items.
* `FilterDialogFragment` — Provides the filtering interface as a popup without navigating away from the main screen.

### RecyclerView & Adapter

A `RecyclerView` with `PlaceAdapter` is used to efficiently display and dynamically update catalog items.

The adapter handles:

* Binding item data
* Item selection
* Favourite interactions
* Dynamic updates

This structure supports real-time searching and filtering while keeping the list scalable and efficient.

## 🎨 User Experience

The application was designed around a simple and responsive navigation flow. The main catalog remains visible while filtering through a popup dialog, allowing users to adjust their selections without leaving the current screen.

Interactive elements such as the favourite heart and adjustable star rating provide immediate visual feedback and make common actions easily accessible.

## 🛠️ Technologies & Concepts

* **Kotlin**
* **Android Studio**
* **Android Activities**
* **Fragments**
* **RecyclerView**
* **RecyclerView Adapter**
* **DialogFragment**
* **Dynamic Search**
* **Multi-Criteria Filtering**
* **UI State Management**

## 🎓 Project Context

**Project:** Android Catalog Application
**Platform:** Android
**Language:** Kotlin
**Development Environment:** Android Studio

This project demonstrates the use of Android's Activity and Fragment architecture to create a modular catalog application with dynamic search, filtering, favourites, and interactive item ratings.
