package com.example.saisathwikportfolio.homelist

import com.example.saisathwikportfolio.R

class Datasource {

    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.about1,R.string.about2,R.string.about3),
            Affirmation(R.string.skills1, R.string.skills2,R.string.skills3),
            Affirmation(R.string.Edu1, R.string.Edu2, R.string.Edu3),
                    Affirmation(R.string.km1, R.string.km2, R.string.km3)
        )
    }
}