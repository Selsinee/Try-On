package com.binus.tryon.adapter

import ai.deepar.deepar_example.databinding.ItemCardBinding
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil.calculateDiff
import androidx.recyclerview.widget.RecyclerView
import com.binus.tryon.entities.Product
import com.binus.tryon.utilities.DiffHelper

class ProductListAdapter(
    private var listProduct: ArrayList<Product>,
    private val context: Context,
    private val isBrands: Boolean, //list of brands
    private val isBrandProduct: Boolean, //list of products of a particular brand
) :
    RecyclerView.Adapter<ProductListAdapter.ViewHolder>() {

    private lateinit var callback: Callback

    class ViewHolder(var binding: ItemCardBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding: ItemCardBinding = ItemCardBinding
            .inflate(LayoutInflater.from(context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item: Product = listProduct[position]
        holder.binding.let {
            it.productBrand.text = item.brand
            it.productName.text = item.name

            if (isBrands) it.productName.visibility = View.GONE
            else if (isBrandProduct) it.productBrand.visibility = View.GONE

            it.productItem.setOnClickListener {
                callback.onItemClicked(item)
            }

            it.productImage.setImageResource(item.image)
        }

    }

    override fun getItemCount() = listProduct.size

    fun setCallback(callback: Callback) {
        this.callback = callback
    }

    fun setListUsers(listUsers: List<Product>) {
        val diffCallback = DiffHelper(this.listProduct, listUsers)
        val diffResult = calculateDiff(diffCallback)
        this.listProduct.clear()
        this.listProduct.addAll(listUsers)
        diffResult.dispatchUpdatesTo(this)
    }

    interface Callback {
        fun onItemClicked(data: Product)
    }

}
