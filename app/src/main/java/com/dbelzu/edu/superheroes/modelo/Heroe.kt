package com.dbelzu.edu.superheroes.modelo

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Heroe(
    @StringRes val recursoNombre: Int,
    @StringRes val recursoDescripcion: Int,
    @DrawableRes val recursoImg: Int
)
