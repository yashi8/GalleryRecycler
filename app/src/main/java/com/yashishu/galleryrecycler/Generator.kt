package com.yashishu.galleryrecycler

class Generator {
    companion object {
        fun get(): List<Avatar> {
            return mutableListOf(
                Avatar("Avatar 1", R.drawable.character_female_person_think),
                Avatar("Avatar 2", R.drawable.character_female_person_run2),
                Avatar("Avatar 3", R.drawable.character_male_person_drag),
                Avatar("Avatar 4", R.drawable.character_male_person_duck),
                Avatar("Avatar 5", R.drawable.character_robot_attack0),
                Avatar("Avatar 6", R.drawable.character_male_person_fall,true),
                Avatar("Avatar 7", R.drawable.character_robot_attack1),
                Avatar("Avatar 8", R.drawable.character_female_person_think),
                Avatar("Avatar 9", R.drawable.character_female_person_run2),
                Avatar("Avatar 10", R.drawable.character_male_person_drag),
                Avatar("Avatar 11", R.drawable.character_male_person_duck),
                Avatar("Avatar 12", R.drawable.character_robot_attack0),
                Avatar("Avatar 13", R.drawable.character_male_person_fall),
                Avatar("Avatar 14", R.drawable.character_robot_attack1, true)
            )
        }
    }
}