package mx.edu.utez.practicalistas_galis.ui.navigation

import android.annotation.SuppressLint
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import mx.edu.utez.practicalistas_galis.ui.screen.AgendaScreen
import mx.edu.utez.practicalistas_galis.ui.screen.AgendaViewModel
import mx.edu.utez.practicalistas_galis.ui.screen.menu.MenuScreen

sealed class Route(val path: String){
    object Menu: Route("menu")
    object Agenda : Route("agenda")
}

@SuppressLint("ViewModelConstructorInComposable")
@Composable
fun AppNavGraph(
    navController: NavHostController,
    modifier: Modifier = Modifier
){
    NavHost(
        navController = navController,
        startDestination = Route.Menu.path,
        modifier = modifier
    ) {
        composable(Route.Menu.path){
            MenuScreen(
                onNavigateToAgenda = { navController.navigate(Route.Agenda.path) }
            )
        }

        composable(Route.Agenda.path){
            AgendaScreen(
                AgendaViewModel(),navController
            )
        }

    }
}