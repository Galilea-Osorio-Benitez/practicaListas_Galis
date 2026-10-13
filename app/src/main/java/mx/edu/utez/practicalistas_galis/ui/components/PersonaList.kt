package mx.edu.utez.practicalistas_galis.ui.components

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import mx.edu.utez.practicalistas_galis.R
import mx.edu.utez.practicalistas_galis.models.Persona
import mx.edu.utez.practicalistas_galis.ui.theme.PracticaListas_GalisTheme

@Composable
fun PersonaList(
    personas: List<Persona>,
    onItemClick: (Persona) -> Unit
){
    LazyColumn(modifier = Modifier.fillMaxSize()) {
        items(items = personas, key = {it.id}){persona ->
            PersonaCard(
                persona = persona,
                onClick = {onItemClick(persona)}
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PersonaListPreview(){
    PracticaListas_GalisTheme(){
        val lista = listOf(
            Persona(1, "Joseline", 19, "Femenino", "777 199 3844", "joseline@gmail.com"),
            Persona(2, "Ashley", 19, "Femenino", "734 158 5596", "ashley@gamil.com"),
            Persona(3, "Sara", 18, "Femenino", "777 492 2285", "sara@gmail.com"),
            Persona(4, "Mich", 19, "Femenino", "777 199 2079", "mich@gmail.com"),
            Persona(5, "Carlos", 19, "Masculino", "777 332 5508", "carlos@gmail.com"),
            Persona(6, "Val", 20, "Femenino", "777 161 9098", "vale@gmail.com"),
            Persona(7, "Isaac", 19, "Masculino", "777 304 0796", "isaac@gmail.com"),
            Persona(8, "Guillermo", 20, "Masculino", "777 555 4582", "memo@gmail.com")
        )
        PersonaList(lista, {})
    }
}