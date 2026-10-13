package mx.edu.utez.practicalistas_galis.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import mx.edu.utez.practicalistas_galis.R
import mx.edu.utez.practicalistas_galis.models.Persona
import mx.edu.utez.practicalistas_galis.ui.theme.PracticaListas_GalisTheme

@Composable
fun PersonaCard(
    persona: Persona,
    onClick: () -> Unit
){
    Card(
        onClick = onClick,
        modifier = Modifier.fillMaxWidth()
            .padding(horizontal = 24.dp, vertical = 10.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Row(
            modifier = Modifier.padding(16.dp).fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(persona.img ?: R.drawable.cuenta),
                contentDescription = "",
                modifier = Modifier.size(80.dp)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column{
                Text(
                    text = persona.nombre,
                    style = MaterialTheme.typography.titleLarge,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    color = Color(0xFF49454F)
                )

                Spacer(modifier = Modifier.width(4.dp))

                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        imageVector = Icons.Default.AccountCircle,
                        contentDescription = "Edad",
                        modifier = Modifier.height(15.dp).width(15.dp)
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(
                        text = "${persona.edad} años",
                        style = MaterialTheme.typography.titleSmall,
                        color = Color(0xFF49454F)
                    )
                    Text(
                        text = "  .  ",
                        fontSize = 18.sp,
                        color = Color(0xFF49454F)
                    )
                    Icon(
                        imageVector = Icons.Default.Info,
                        contentDescription = "Genero",
                        modifier = Modifier.height(15.dp).width(15.dp)
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(
                        text = "${persona.genero}",
                        style = MaterialTheme.typography.titleSmall,
                        color = Color(0xFF49454F)
                    )
                }
                Spacer(modifier = Modifier.width(16.dp))

                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        imageVector = Icons.Default.Phone,
                        contentDescription = "Telefono",
                        modifier = Modifier.height(15.dp).width(15.dp)
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(
                        text = "${persona.telefono}",
                        style = MaterialTheme.typography.titleSmall,
                        color = Color(0xFF49454F)
                    )
                }
                Spacer(modifier = Modifier.width(16.dp))
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        imageVector = Icons.Default.Email,
                        contentDescription = "Email",
                        modifier = Modifier.height(15.dp).width(15.dp)
                    )
                    Spacer(modifier = Modifier.size(4.dp))
                    Text(
                        text = "${persona.email}",
                        style = MaterialTheme.typography.titleSmall,
                        color = Color(0xFF49454F)
                    )
                }
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun PersonaCardPreview(){
    PracticaListas_GalisTheme(){
        PersonaCard(
            Persona(1, "Joseline", 19, "Femenino", "777 199 3844", "joseline@gmail.com"),
            {}
        )
    }
}