package com.binus.tryon.entities

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

data class Product (
    val id: Int,
    val name: String = "",
    val price: String,
    val brand: String = "",
    val image: Int,
    val variants: ArrayList<Variant>
)