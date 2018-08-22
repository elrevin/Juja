package me.elrevin.juja

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class ProductsListAdapter (val items : ArrayList<Product>, val context: Context) : RecyclerView.Adapter<ProductsListViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductsListViewHolder {
        return ProductsListViewHolder(LayoutInflater.from(context).inflate(R.layout.product_list_item_layout, parent, false))
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ProductsListViewHolder, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}

class ProductsListViewHolder(view: View) : RecyclerView.ViewHolder(view) {

}