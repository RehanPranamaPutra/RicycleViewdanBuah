package com.rehan.apprehan.Model

import com.rehan.apprehan.R
import java.util.Random

data class ModelBuah(
    val image :Int,
    val nama : String
)

//kita mockup data untuk array

object Mocklist{
    fun getMode() :List<ModelBuah>{
        val itemmodel1 = ModelBuah(
            R.drawable.apple,
                "Apple"
        )

        val itemmodel2 = ModelBuah(
            R.drawable.grapes,
            "Anggur"
        )

        val itemmodel3 = ModelBuah(
            R.drawable.orange,
            "Jeruk"
        )

        val itemmodel4 = ModelBuah(
            R.drawable.pear,
            "Pear"
        )

        val itemmodel5 = ModelBuah(
            R.drawable.strawberry,
            "Stroberi"
        )

        val itemmodel6 = ModelBuah(
            R.drawable.orange,
            "Orange"
        )

        val itemList: ArrayList<ModelBuah> = ArrayList()
        itemList.add(itemmodel1)
        itemList.add(itemmodel2)
        itemList.add(itemmodel3)
        itemList.add(itemmodel4)
        itemList.add(itemmodel5)
        itemList.add(itemmodel6)

        return itemList

    }
}