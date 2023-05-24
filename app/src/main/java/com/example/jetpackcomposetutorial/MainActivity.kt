package com.example.jetpackcomposetutorial

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposetutorial.ui.theme.JetpackComposeTutorialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTutorialTheme() {
                MyComponent()
            }
        }
    }
}

@Composable
fun MyComponent() {
    Row(modifier = Modifier.background(MaterialTheme.colorScheme.background).padding(8.dp)) {
        MyImage()
        MyTexts()
    }
}

@Composable
fun MyImage() {
    Image(
        painterResource(id = R.drawable.ic_launcher_foreground),
        "Mi imagen de prueba",
        modifier = Modifier
            .clip(CircleShape)
            .background(Color.Green)
            .size(64.dp)
    )
}

@Composable
private fun MyTexts() {
    Column(modifier = Modifier.padding(start = 8.dp)) {

        MyText(
            text = "Hola Jetpack Compose!",
            MaterialTheme.colorScheme.primary,
            MaterialTheme.typography.headlineMedium
        )
        Spacer(modifier = Modifier.height(16.dp))
        MyText(
            text = "Preparado!!",
            MaterialTheme.colorScheme.onBackground,
            MaterialTheme.typography.labelLarge
        )
    }
}

@Composable
fun MyText(text: String, color: Color, style: TextStyle) {
    Text(text, color=color, style = style)
}

@Preview
@Preview (uiMode = Configuration.UI_MODE_NIGHT_YES )
@Composable
fun PreviewComponents() {
    JetpackComposeTutorialTheme() {
        MyComponent()
    }
}





