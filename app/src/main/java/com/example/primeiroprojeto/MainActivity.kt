package com.example.primeiroprojeto

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("LifecycleDemo", "onCreate chamado")
        Toast.makeText(this, "onCreate chamado", Toast.LENGTH_SHORT).show()

        setContent {
            LifecycleDemoApp()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("LifecycleDemo", "onStart chamado")
        Toast.makeText(this, "onStart chamado", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Log.d("LifecycleDemo", "onResume chamado")
        Toast.makeText(this, "onResume chamado",
            Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Log.d("LifecycleDemo", "onPause chamado")
        Toast.makeText(this, "onPause chamado",
            Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Log.d("LifecycleDemo", "onStop chamado")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("LifecycleDemo", "onDestroy chamado")
        Toast.makeText(this, "onDestroy chamado",
            Toast.LENGTH_SHORT).show()
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LifecycleDemoApp() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Lifecycle Demo") } // Corrigido para usar Text
            )
        }
    ) { paddingValues ->
        Surface(
            modifier = Modifier.padding(paddingValues),
            color = MaterialTheme.colorScheme.background // Usando a cor de fundo do tema
        ) {
            Text("Observe o log e os Toasts para ver o ciclo de vida.")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    LifecycleDemoApp()
}
