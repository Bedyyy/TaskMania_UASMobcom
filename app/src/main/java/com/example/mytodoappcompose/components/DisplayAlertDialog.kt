package com.example.mytodoappcompose.components

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.example.mytodoappcompose.data.models.Priority
import com.example.mytodoappcompose.ui.screens.task.TaskContent


@Composable
fun DisplayAlertDialog(
    title: String,
    message: String,
    openDialog: Boolean,
    closeDialog: () -> Unit,
    onYesClicked: () -> Unit,
) {
    if (openDialog) {
        AlertDialog(
            title = {
                Text(
                    text = title,
                    fontSize = MaterialTheme.typography.h5.fontSize,
                    fontWeight = FontWeight.Bold
                )
            },
            text = {
                Text(
                    text = message,
                    fontSize = MaterialTheme.typography.subtitle1.fontSize,
                    fontWeight = FontWeight.Normal
                )
            },
            confirmButton = {
                Button(
                    onClick = {
                        onYesClicked()
                        closeDialog()
                    })
                {
                    Text(text = "Yes")
                }
            },
            dismissButton = {
                OutlinedButton(onClick = { closeDialog() })
                {
                    Text(text = "No")
                }
            },
            onDismissRequest = { closeDialog() }
        )
    }
}

@Composable
@Preview()
fun DisplayAlertDialogPreview() {
    MaterialTheme{
        Surface(modifier = Modifier.fillMaxSize()) {
            DisplayAlertDialog(
                title = "Remove All Tasks?",
                message = "Are you sure you want to remove all Tasks?",
                openDialog = true,
                closeDialog = {},
                onYesClicked = {}
            )
        }
    }

}
