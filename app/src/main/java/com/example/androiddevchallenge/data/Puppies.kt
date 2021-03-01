package com.example.androiddevchallenge.data

import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.models.Puppy

object Puppies {

    private val bill = Puppy(
        id = 0,
        name = "Bill",
        imageRes = R.drawable.bill_stephan,
        description = ""
    )

    private val tr = Puppy(
        id = 1,
        name = "T.R.",
        imageRes = R.drawable.t_r_photography,
        description = ""
    )

    private val erin = Puppy(
        id = 2,
        name = "Erin",
        imageRes = R.drawable.erin_minuskin,
        description = ""
    )

    private val kirk = Puppy(
        id = 3,
        name = "Kirk",
        imageRes = R.drawable.austin_kirk,
        description = ""
    )

    private val corgi = Puppy(
        id = 4,
        name = "Corgi",
        imageRes = R.drawable.fatty_corgi,
        description = ""
    )

    private val hannah = Puppy(
        id = 5,
        name = "Hannah",
        imageRes = R.drawable.hannah_grace,
        description = ""
    )

    private val kool = Puppy(
        id = 6,
        name = "Kool",
        imageRes = R.drawable.patrick_kool,
        description = ""
    )

    private val rogelio = Puppy(
        id = 7,
        name = "Rogelio",
        imageRes = R.drawable.rogelio_hidalgo,
        description = ""
    )

    private val karsten = Puppy(
        id = 8,
        name = "Karsten",
        imageRes = R.drawable.karsten_winegeart,
        description = ""
    )

    private val andrew = Puppy(
        id = 9,
        name = "Andrew",
        imageRes = R.drawable.andrew_schultz,
        description = ""
    )

    private val matthew = Puppy(
        id = 10,
        name = "Matthew",
        imageRes = R.drawable.matthew_foulds,
        description = ""
    )

    private val david = Puppy(
        id = 11,
        name = "David",
        imageRes = R.drawable.david_clarke,
        description = ""
    )

    private val berkay = Puppy(
        id = 12,
        name = "Berkay",
        imageRes = R.drawable.karsten_winegeart,
        description = ""
    )

    private val andriyko = Puppy(
        id = 13,
        name = "Andriyko",
        imageRes = R.drawable.andriyko_podilnyk,
        description = ""
    )

    private val dong = Puppy(
        id = 14,
        name = "Dong",
        imageRes = R.drawable.dong_cheng,
        description = ""
    )

    private val part = Puppy(
        id = 15,
        name = "Part",
        imageRes = R.drawable.parttime_portraits,
        description = ""
    )

    private val nord = Puppy(
        id = 16,
        name = "Nord",
        imageRes = R.drawable.nordwood_themes,
        description = ""
    )

    fun get() = listOf(
        bill,
        tr,
        erin,
        kirk,
        corgi,
        hannah,
        kool,
        rogelio,
        karsten,
        andrew,
        matthew,
        david,
        berkay,
        andriyko,
        dong,
        part,
        nord
    )

}