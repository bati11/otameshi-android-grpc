package info.bati11.android.otameshi

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import info.bati11.android.otameshi.gateway.GreetingService
import info.bati11.android.otameshi.ui.BiStreamScreen
import info.bati11.android.otameshi.ui.ClientStreamScreen
import info.bati11.android.otameshi.ui.UnaryScreen

@Composable
fun OtameshiNavHost(
    greetingService: GreetingService,
    navHostController: NavHostController,
    modifier: Modifier = Modifier,
) {
    NavHost(
        navController = navHostController,
        startDestination = UnaryDestination.route,
        modifier = modifier
    ) {
        composable(route = UnaryDestination.route) {
            UnaryScreen(
                "Piyo",
                greetingService = greetingService,
            )
        }
        composable(route = ClientStreamDestination.route) {
            ClientStreamScreen(
                listOf("Piyo", "Foo", "Bar"),
                greetingService = greetingService,
            )
        }
        composable(route = BiStreamDestination.route) {
            BiStreamScreen(
                listOf("Piyo", "Foo", "Bar"),
                greetingService = greetingService,
            )
        }
    }
}