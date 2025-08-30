package au.edu.curtin.madassignment1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PlaceAdapter(
    private val places: List<PlaceData>
): RecyclerView.Adapter<PlaceAdapter.PlaceViewHolder>()  {
    class PlaceViewHolder(view: View): RecyclerView.ViewHolder(view){
        val imageViewPlace = view.findViewById<ImageView>(R.id.imageViewPlace)
        val textViewPlaceName = view.findViewById<TextView>(R.id.textViewPlaceName)
        val textViewRating = view.findViewById<TextView>(R.id.textViewRating)
        val imageViewRatingStar = view.findViewById<ImageView>(R.id.imageViewRatingStar)
        val textViewShortDescription = view.findViewById<TextView>(R.id.textViewShortDescription)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlaceViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.fragment_place, parent, false)
        return PlaceViewHolder(view)
    }
}