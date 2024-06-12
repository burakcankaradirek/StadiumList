package com.example.quiz5

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class StadiumAdapter(val context: Context, val dataset: ArrayList<StadiumModel>)
    : RecyclerView.Adapter<StadiumAdapter.ViewHolder> () {

    class ViewHolder(val context: Context, val itemView: View)
        : RecyclerView.ViewHolder(itemView) {

        val imageView: ImageView = itemView.findViewById(R.id.imageView)
        val textStadiumName: TextView = itemView.findViewById(R.id.textStadiumName)
        val textLocation: TextView = itemView.findViewById(R.id.textLocation)
        val textCapacity: TextView = itemView.findViewById(R.id.textCapacity)
        val btnLike: ImageButton = itemView.findViewById(R.id.btnLike)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.stadium_card, parent, false)
        return ViewHolder(context, view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = dataset[position]

        holder.imageView.setImageResource(currentItem.imageResId)
        holder.textStadiumName.text = currentItem.name
        holder.textLocation.text = currentItem.location
        holder.textCapacity.text = currentItem.capacity

        holder.btnLike.setOnClickListener {
            Toast.makeText(holder.btnLike.context, "${currentItem.name} Stadyumunu beğendiniz. Sizi orada görmek isteriz.", Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
        return dataset.size
    }
}