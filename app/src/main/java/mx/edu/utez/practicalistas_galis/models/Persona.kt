package mx.edu.utez.practicalistas_galis.models
import androidx.annotation.DrawableRes
import mx.edu.utez.practicalistas_galis.R

data class Persona (
    val id: Int,
    val nombre: String,
    val edad: Int,
    val genero: String,
    val telefono: String,
    val email: String,
    @DrawableRes val img: Int? = R.drawable.cuenta
)