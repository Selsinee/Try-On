package com.binus.tryon.utilities

import androidx.recyclerview.widget.DiffUtil
import com.binus.tryon.entities.Product

class DiffHelper(
    private val oldList: List<Product>,
    private val newList: List<Product>
) : DiffUtil.Callback() {

    override fun getOldListSize(): Int = oldList.size

    override fun getNewListSize(): Int = newList.size

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean =
        oldList[oldItemPosition].id == newList[newItemPosition].id

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        val oldItem = oldList[oldItemPosition]
        val newItem = newList[newItemPosition]
        return compareContent(oldItem, newItem)
    }

    private fun compareContent(oldItem: Product, newItem: Product): Boolean {
        return (oldItem.id == newItem.id)
                && (oldItem.name == newItem.name)
                && (oldItem.brand == newItem.brand)
                && (oldItem.price == newItem.price)
                && (oldItem.image == newItem.image)


    }

}