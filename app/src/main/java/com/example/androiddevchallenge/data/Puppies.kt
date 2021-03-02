package com.example.androiddevchallenge.data

import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.models.Puppy

object Puppies {

    private const val randomDogDescription =
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec dignissim bibendum lorem, id ullamcorper erat iaculis a. Suspendisse in pulvinar nulla. Nunc consectetur odio ipsum, ut dignissim purus varius a. In hac habitasse platea dictumst. Nunc cursus iaculis arcu id pellentesque. Sed sed orci ornare, eleifend metus id, placerat odio. Nullam porttitor pretium nisi ut commodo. Cras semper accumsan tellus non ultricies. Donec et ultricies elit. Phasellus vehicula tempor est, eu faucibus mauris vehicula sit amet. Proin sit amet scelerisque enim. Donec tortor augue, mollis sit amet ex vitae, convallis ullamcorper orci. Integer venenatis, arcu vehicula interdum ullamcorper, magna augue vehicula enim, lacinia viverra nisl leo vel massa. Ut lobortis dictum nisi, ac aliquam est fringilla nec. Mauris lacus sapien, aliquam ac arcu a, aliquam porta tellus. Proin eget lacinia leo. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec dignissim bibendum lorem, id ullamcorper erat iaculis a. Suspendisse in pulvinar nulla. Nunc consectetur odio ipsum, ut dignissim purus varius a. In hac habitasse platea dictumst. Nunc cursus iaculis arcu id pellentesque. Sed sed orci ornare, eleifend metus id, placerat odio. Nullam porttitor pretium nisi ut commodo. Cras semper accumsan tellus non ultricies. Donec et ultricies elit. Phasellus vehicula tempor est, eu faucibus mauris vehicula sit amet. Proin sit amet scelerisque enim. Donec tortor augue, mollis sit amet ex vitae, convallis ullamcorper orci. Integer venenatis, arcu vehicula interdum ullamcorper, magna augue vehicula enim, lacinia viverra nisl leo vel massa. Ut lobortis dictum nisi, ac aliquam est fringilla nec. Mauris lacus sapien, aliquam ac arcu a, aliquam porta tellus. Proin eget lacinia leo."

    private val bill = Puppy(
        id = 0,
        name = "Bill",
        age = "3 months old",
        postedBy = "Bill Stephan",
        imageRes = R.drawable.bill_stephan,
        description = randomDogDescription
    )

    private val tr = Puppy(
        id = 1,
        name = "T.R.",
        age = "5 months old",
        postedBy = "T.R. Photography",
        imageRes = R.drawable.t_r_photography,
        description = randomDogDescription
    )

    private val erin = Puppy(
        id = 2,
        name = "Erin",
        age = "2 months old",
        postedBy = "Erin Minuskin",
        imageRes = R.drawable.erin_minuskin,
        description = randomDogDescription
    )

    private val kirk = Puppy(
        id = 3,
        name = "Kirk",
        age = "3 months old",
        postedBy = "Austin Kirk",
        imageRes = R.drawable.austin_kirk,
        description = randomDogDescription
    )

    private val corgi = Puppy(
        id = 4,
        name = "Corgi",
        age = "5 months old",
        postedBy = "Fatty Corgi",
        imageRes = R.drawable.fatty_corgi,
        description = randomDogDescription
    )

    private val hannah = Puppy(
        id = 5,
        name = "Hannah",
        age = "1 month old",
        postedBy = "Hannah Grace",
        imageRes = R.drawable.hannah_grace,
        description = randomDogDescription
    )

    private val kool = Puppy(
        id = 6,
        name = "Kool",
        age = "2 months old",
        postedBy = "Patrick Kool",
        imageRes = R.drawable.patrick_kool,
        description = randomDogDescription
    )

    private val rogelio = Puppy(
        id = 7,
        name = "Rogelio",
        age = "2 months old",
        postedBy = "Rogelio Hidalgo",
        imageRes = R.drawable.rogelio_hidalgo,
        description = randomDogDescription
    )

    private val karsten = Puppy(
        id = 8,
        name = "Karsten",
        age = "3 months old",
        postedBy = "Karsten Winegeart",
        imageRes = R.drawable.karsten_winegeart,
        description = randomDogDescription
    )

    private val andrew = Puppy(
        id = 9,
        name = "Andrew",
        age = "2 months old",
        postedBy = "Andrew Schultz",
        imageRes = R.drawable.andrew_schultz,
        description = randomDogDescription
    )

    private val matthew = Puppy(
        id = 10,
        name = "Matthew",
        age = "1 month old",
        postedBy = "Matthew Foulds",
        imageRes = R.drawable.matthew_foulds,
        description = randomDogDescription
    )

    private val david = Puppy(
        id = 11,
        name = "David",
        age = "2 months old",
        postedBy = "David Clarke",
        imageRes = R.drawable.david_clarke,
        description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec dignissim bibendum lorem, id ullamcorper erat iaculis a. Suspendisse in pulvinar nulla. Nunc consectetur odio ipsum, ut dignissim purus varius a. In hac habitasse platea dictumst. Nunc cursus iaculis arcu id pellentesque. Sed sed orci ornare, eleifend metus id, placerat odio. Nullam porttitor pretium nisi ut commodo. Cras semper accumsan tellus non ultricies. Donec et ultricies elit. Phasellus vehicula tempor est, eu faucibus mauris vehicula sit amet. Proin sit amet scelerisque enim. Donec tortor augue, mollis sit amet ex vitae, convallis ullamcorper orci. Integer venenatis, arcu vehicula interdum ullamcorper, magna augue vehicula enim, lacinia viverra nisl leo vel massa. Ut lobortis dictum nisi, ac aliquam est fringilla nec. Mauris lacus sapien, aliquam ac arcu a, aliquam porta tellus. Proin eget lacinia leo."
    )

    private val berkay = Puppy(
        id = 12,
        name = "Berkay",
        age = "3 months old",
        postedBy = "Berkay Gumustekin",
        imageRes = R.drawable.berkay_gumustekin,
        description = randomDogDescription
    )

    private val andriyko = Puppy(
        id = 13,
        name = "Andriyko",
        age = "1 month old",
        postedBy = "Andriyko Podilnyk",
        imageRes = R.drawable.andriyko_podilnyk,
        description = randomDogDescription
    )

    private val dong = Puppy(
        id = 14,
        name = "Dong",
        age = "2 months old",
        postedBy = "Dong Cheng",
        imageRes = R.drawable.dong_cheng,
        description = randomDogDescription
    )

    private val part = Puppy(
        id = 15,
        name = "Part",
        age = "4 months old",
        postedBy = "Parttime Portraits",
        imageRes = R.drawable.parttime_portraits,
        description = randomDogDescription
    )

    private val nord = Puppy(
        id = 16,
        name = "Nord",
        age = "3 months old",
        postedBy = "Nordwood Themes",
        imageRes = R.drawable.nordwood_themes,
        description = randomDogDescription
    )

    private val allPuppies = listOf(
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

    fun get() = allPuppies

    fun getPuppy(index: Int): Puppy = allPuppies[index]

}