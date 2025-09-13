package au.edu.curtin.madassignment1

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PlaceAdapter(
    private var places: List<Place> ,
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

    override fun onBindViewHolder(holder: PlaceViewHolder, position: Int) {
        val place = places[position]

        holder.textViewPlaceName.text = place.name
        holder.textViewRating.text = place.rating.toString()
        holder.textViewShortDescription.text = place.shortDescription
        holder.imageViewPlace.setImageResource(place.image)

        if (place.isFavourite) {
            holder.imageViewRatingStar.setImageResource(R.drawable.heart_solid)
            holder.imageViewRatingStar.visibility = View.VISIBLE
        } else {
            holder.imageViewRatingStar.visibility = View.GONE
        }

        holder.itemView.setOnClickListener {
            val context = holder.itemView.context
            val intent = Intent(context, DetailActivity::class.java).apply {
                putExtra("place_name", place.name)
            }
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int = places.size

    fun updateList(newPlaces: List<Place>) {
        places = newPlaces
        notifyDataSetChanged()
    }
}