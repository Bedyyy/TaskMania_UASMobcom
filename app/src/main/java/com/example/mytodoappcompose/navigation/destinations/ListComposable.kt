package com.example.mytodoappcompose.navigation.destinations

import androidx.compose.material.ExperimentalMaterialApi
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.mytodoappcompose.ui.screens.list.ListScreen
import com.example.mytodoappcompose.ui.viewmodels.SharedViewModel
import com.example.mytodoappcompose.util.Action
import com.example.mytodoappcompose.util.Constants.LIST_ARGUMENT_KEY
import com.example.mytodoappcompose.util.Constants.LIST_SCREEN

@ExperimentalMaterialApi
fun NavGraphBuilder.listComposable(
    navigateToTaskScreen: (taskId: Int) -> Unit,
    sharedViewModel: SharedViewModel,
    action: Action
) {
    composable(
        route = LIST_SCREEN,
        arguments = listOf(navArgument(LIST_ARGUMENT_KEY) {
            type = NavType.StringType
        })
    ) {
        ListScreen(navigateToTaskScreen = navigateToTaskScreen, sharedViewModel = sharedViewModel, action =action)
    }
}