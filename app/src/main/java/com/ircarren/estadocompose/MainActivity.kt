package com.ircarren.estadocompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ircarren.estadocompose.provider.TaskProvider
import com.ircarren.estadocompose.ui.theme.EstadoComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EstadoComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    PantallaPrincipal()
                }
            }
        }
    }
}

@Composable
fun taskContent(modifier: Modifier = Modifier) {
    var tasks =  TaskProvider.tareas


    Column(modifier = modifier.padding(16.dp)) {
        /*
        var count by rememberSaveable { mutableStateOf(0) }

        if (count > 0) {
            var showTask by rememberSaveable { mutableStateOf(true) }
            if (showTask){
                TaskItem(tasks[count-1], modifier = modifier, onClose = { showTask = false })
            }
            Text(text = "tienes ${count} tareas", modifier = modifier)




        }
        Row(modifier=Modifier.padding(8.dp)) {
            Button(onClick = { count=0 }, modifier = modifier) {
                Text(text = "limpiar")
            }
            Spacer(modifier = Modifier.width(8.dp))
            Button(onClick = { count++ }, modifier = modifier,enabled = count<10) {
                Text(text = "Añadir tarea")
            }
        }*/




    }
    /*taskFullList(modifier = modifier)*/

}

