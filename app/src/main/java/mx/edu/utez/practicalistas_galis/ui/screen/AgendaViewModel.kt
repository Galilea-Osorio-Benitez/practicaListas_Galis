package mx.edu.utez.practicalistas_galis.ui.screen

import android.util.Log
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import mx.edu.utez.practicalistas_galis.models.Persona

class AgendaViewModel: ViewModel() {
    private val _personas = MutableStateFlow<List<Persona>>(emptyList())
    val personaa: StateFlow<List<Persona>> = _personas

    init {
        loadPersonas()
    }

    fun loadPersonas(){
        _personas.value = listOf(
            Persona(1, "Joseline", 19, "Femenino", "777 199 3844", "joseline@gmail.com"),
            Persona(2, "Ashley", 19, "Femenino", "734 158 5596", "ashley@gamil.com"),
            Persona(3, "Sara", 18, "Femenino", "777 492 2285", "sara@gmail.com"),
            Persona(4, "Mich", 19, "Femenino", "777 199 2079", "mich@gmail.com"),
            Persona(5, "Carlos", 19, "Masculino", "777 332 5508", "carlos@gmail.com"),
            Persona(6, "Val", 20, "Femenino", "777 161 9098", "vale@gmail.com"),
            Persona(7, "Isaac", 19, "Masculino", "777 304 0796", "isaac@gmail.com"),
            Persona(8, "Guillermo", 20, "Masculino", "777 555 4582", "memo@gmail.com")
        )
    }

    fun onPersonaClicked(p: Persona){
        Log.d("PersonaViewModel", "El viewModel ha sido notificado del un click en ${p.nombre}")
    }
}