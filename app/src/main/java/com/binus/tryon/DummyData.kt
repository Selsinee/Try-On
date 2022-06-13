package com.binus.tryon

import ai.deepar.deepar_example.R
import com.binus.tryon.entities.Product
import com.binus.tryon.entities.Variant

object DummyData {

    fun getLipProducts() : ArrayList<Product> {
        return arrayListOf(
            Product(1, "Lip & Cheek Tint", "Rp. 22.800,00", "IMPLORA", R.drawable.implora, arrayListOf(
                Variant("Vampire Blood", R.color.vampireBlood),
                Variant("Cherry Bomb", R.color.cherryBomb),
                Variant("Candy Apple", R.color.candyApple),
                Variant("Red Wine", R.color.redWine),
                Variant("Cranberry", R.color.cranberry),
                Variant("Pumpkin", R.color.pumpkin),
            )),
            Product(2, "Intense Matte Lip Cream", "Rp. 109.000,00", "Make over", R.drawable.intense_matte_lip_cream, arrayListOf()),
            Product(3, "Glossy Stain", "Rp. 23.500,00", "EMINA", R.drawable.implora, arrayListOf()),
            Product(4, "Lip Gloss", "Rp. 50.100,00", "ESQA", R.drawable.lip_gloss_esqa, arrayListOf()),
            Product(5, "Color Stick Matte Crayon", "Rp. 150.400,00", "Make over", R.drawable.color_stick_matte_crayon, arrayListOf()),
            Product(6, "Lip Cushion", "Rp. 100.800,00", "Emina", R.drawable.lip_cushion_emina, arrayListOf()),
            Product(7, "SYCA Liptint", "Rp. 66.900,00", "SYCA", R.drawable.liptint_syca, arrayListOf()),
            Product(8, "Everyday Cheek and Lip Tint", "Rp. 26.000,00", "WARDAH", R.drawable.cheek_and_liptint, arrayListOf()),
            Product(9, "Satin Lip Gloss", "Rp. 60.800,00", "GOBAN", R.drawable.satin_lip_gloss, arrayListOf()),
        )

    }

    fun getFaceProducts() : ArrayList<Product> {
        return arrayListOf(
            Product(1, "Blush", "Rp. 50.900,00", "ESQA", R.drawable.blush_esqa, arrayListOf(
                Variant("Vampire Blood", R.color.vampireBlood),
                Variant("Cherry Bomb", R.color.cherryBomb),
                Variant("Candy Apple", R.color.candyApple),
                Variant("Red Wine", R.color.redWine),
                Variant("Cranberry", R.color.cranberry),
                Variant("Pumpkin", R.color.pumpkin),
            )),
            Product(2, "UVW BB Cream", "Rp. 87.000,00", "PIXY", R.drawable.uvw_bb_cream, arrayListOf()),
            Product(3, "Daily Matte BB Cream", "Rp. 23.500,00", "EMINA", R.drawable.daily_matte_bb_cream, arrayListOf()),
            Product(4, "Lightening BB Cream", "Rp. 50.100,00", "WARDAH", R.drawable.lightening_bb_cream, arrayListOf()),
            Product(5, "Blush Me Up", "Rp. 150.400,00", "MIZZU", R.drawable.blush_me_up, arrayListOf()),
            Product(6, "Cheeklit Cream Blush", "Rp. 100.800,00", "EMINA", R.drawable.cheeklit_cream_blush, arrayListOf()),
            Product(7, "Pro Face Powder", "Rp. 66.900,00", "LA GIRL", R.drawable.pro_face_powder, arrayListOf()),
            Product(8, "Setting Powder", "Rp. 26.000,00", "ESQA", R.drawable.setting_powder_esqa, arrayListOf()),
            Product(9, "Face Powder", "Rp. 60.800,00", "BLP BEAUTY", R.drawable.face_powder, arrayListOf()),
        )

    }

    fun getEyeProducts() : ArrayList<Product> {
        return arrayListOf(
            Product(1, "Power Liner", "Rp. 50.900,00", "BLP BEAUTY", R.drawable.power_liner, arrayListOf(
                Variant("Vampire Blood", R.color.vampireBlood),
                Variant("Cherry Bomb", R.color.cherryBomb),
                Variant("Candy Apple", R.color.candyApple),
                Variant("Red Wine", R.color.redWine),
                Variant("Cranberry", R.color.cranberry),
                Variant("Pumpkin", R.color.pumpkin),
            )),
            Product(2, "New Softbrow Pencil", "Rp. 87.000,00", "IMPLORA", R.drawable.new_softbrow_pencil, arrayListOf()),
            Product(3, "Perfect Matte Eyeliner", "Rp. 23.500,00", "DEAR ME BEAUTY", R.drawable.perfect_matte_eyeliner, arrayListOf()),
            Product(4, "Eyeliner", "Rp. 50.100,00", "ESQA", R.drawable.eyeliner_esqa, arrayListOf()),
            Product(5, "Brow Stick Pencil", "Rp. 150.400,00", "ESQA", R.drawable.brow_stick_pencil, arrayListOf()),
            Product(6, "Eyebrows Powder", "Rp. 100.800,00", "FOCALLURE", R.drawable.eyebrows_powder, arrayListOf()),
            Product(7, "Eyeshadow Pen", "Rp. 66.900,00", "BLP BEAUTY", R.drawable.eyeshadow_pen, arrayListOf()),
            Product(8, "Starlight Liquid Eyeshadow", "Rp. 26.000,00", "ESQA", R.drawable.starlight_liquid_eyeshadow, arrayListOf()),
            Product(9, "Eye Metal Glitter", "Rp. 60.800,00", "HOLIKA HOLIKA", R.drawable.eye_metal_glitter, arrayListOf()),
        )

    }

    fun getAllProducts() : ArrayList<Product> {
        return arrayListOf()

    }

    fun getBrands() : ArrayList<Product> {
        return arrayListOf(
            Product(1, "", "Rp. 50.900,00", "COSRX", R.drawable.cosrx_logo, arrayListOf()),
            Product(2, "", "Rp. 87.000,00", "EMINA", R.drawable.emina_logo, arrayListOf()),
            Product(3, "", "Rp. 23.500,00", "GARNIER", R.drawable.garnier_logo, arrayListOf()),
            Product(4, "", "Rp. 50.100,00", "WHITELAB", R.drawable.whitelab_logo, arrayListOf()),
            Product(5, "", "Rp. 150.400,00", "SENSATIA BOTANICALS", R.drawable.sensatia_logo, arrayListOf()),
            Product(6, "", "Rp. 100.800,00", "THE ORDINARY", R.drawable.the_ordinary_logo, arrayListOf()),
            Product(7, "", "Rp. 66.900,00", "INNISFREE", R.drawable.innisfree_logo, arrayListOf()),
            Product(8, "", "Rp. 26.000,00", "MISSHA", R.drawable.missha_logo, arrayListOf()),
            Product(9, "", "Rp. 60.800,00", "IMPLORA:", R.drawable.implora_logo, arrayListOf()),
            Product(10, "", "Rp. 60.800,00", "DEAR ME BEAUTY", R.drawable.dear_me_beauty_logo, arrayListOf()),
            Product(11, "", "Rp. 60.800,00", "ESQA", R.drawable.esqa_logo, arrayListOf()),
            Product(12, "", "Rp. 60.800,00", "YOU", R.drawable.you_logo, arrayListOf()),
        )

    }
}