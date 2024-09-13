package com.rehan.apprehan.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.rehan.apprehan.Model.ModelBuku
import com.rehan.apprehan.R
import com.rehan.apprehan.RecycleView

class BukuAdapter(private val buku: List<ModelBuku>):
    RecyclerView.Adapter<BukuAdapter.BukuAdapterHolder>(){
    class BukuAdapterHolder(view: View): RecyclerView.ViewHolder(view){
        val txtJudul:TextView = view.findViewById(R.id.txtJudul)
        val txtPenerbit:TextView = view.findViewById(R.id.txtPenerbit)
    }

    // untuk membuat layout list item sebagai item dari recycle view
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BukuAdapterHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item_view, parent, false)
        return BukuAdapterHolder(view)
    }


    override fun onBindViewHolder(holder: BukuAdapterHolder, position: Int) {
        holder.txtJudul.text =buku[position].judul
        holder.txtPenerbit.text =buku[position].penerbit
    }

    override fun getItemCount(): Int {
        return buku.size
    }
}