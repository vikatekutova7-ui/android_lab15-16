package com.tekutova.student_planner.navigation

sealed class Screen(val route: String) {
    object Home : Screen("home")

    object Profile : Screen("profile")

    object Settings : Screen("settings")

    object Details : Screen("details/{subjectId}") {
        fun passRoute(subjectId: String) = "details/$subjectId"
    }
}