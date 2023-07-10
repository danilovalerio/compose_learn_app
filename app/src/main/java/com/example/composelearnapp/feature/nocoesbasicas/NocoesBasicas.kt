package com.example.composelearnapp.feature.nocoesbasicas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composelearnapp.ui.theme.ComposeLearnAppTheme

class NocoesBasicas : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeLearnAppTheme {
                MyApp(modifier = Modifier.fillMaxSize())
            }
        }
    }
}

@Composable
private fun MyApp(modifier: Modifier = Modifier) {
    Surface(
        modifier = modifier,
        color = MaterialTheme.colorScheme.background
    ) {
        Saudacoes(name = "Joao Zé Zinho da Silva")
    }
}

@Composable
private fun Saudacoes(name: String) {
    Surface(color = MaterialTheme.colorScheme.primary) {
        Text(text = "Hello $name", modifier = Modifier.padding(24.dp))

    }
}