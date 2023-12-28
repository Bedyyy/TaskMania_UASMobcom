package com.example.mytodoappcompose.data.models

import androidx.compose.ui.graphics.Color
import com.example.mytodoappcompose.ui.theme.HighPriorityColor
import com.example.mytodoappcompose.ui.theme.LowPriorityColor
import com.example.mytodoappcompose.ui.theme.MediumPriorityColor
import com.example.mytodoappcompose.ui.theme.NonePriorityColor


enum class Priority(val color: Color) {
    HIGH(color = HighPriorityColor),
    MEDIUM(color = MediumPriorityColor),
    LOW(color = LowPriorityColor),
    NONE(color = NonePriorityColor)
}
