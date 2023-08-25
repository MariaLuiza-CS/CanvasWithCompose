package com.example.drawingwithcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.dp
import com.example.drawingwithcompose.ui.theme.DrawingWithComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DrawingWithComposeTheme {
                Surface(
                ) {
                    Column() {
                        Canvas(
                            modifier = Modifier
                                .size(100.dp)
                                .padding(16.dp)
                        ) {
                            drawRoundRect(
                                color = Color.Red,
                                cornerRadius = CornerRadius(60f, 60f),
                                style = Stroke(width = 15f, cap = StrokeCap.Round)
                            )
                        }
                        Canvas(
                            modifier = Modifier
                                .size(100.dp)
                                .padding(16.dp)
                        ) {
                            drawCircle(
                                color = Color.Red,
                                radius = 90f,
                                style = Stroke(width = 15f, cap = StrokeCap.Round)
                            )
                        }
                        Canvas(
                            modifier = Modifier
                                .size(100.dp)
                                .padding(16.dp)
                        ) {
                            drawCircle(
                                color = Color.Red,
                                radius = 90f
                            )
                        }
                        Canvas(
                            modifier = Modifier
                                .size(100.dp)
                                .padding(16.dp)
                        ) {
                            drawRect(
                                color = Color.Red,
                            )
                        }
                        Canvas(
                            modifier = Modifier
                                .size(100.dp)
                                .padding(16.dp)
                                .background(Color.Black)
                        ) {
                            drawRect(
                                color = Color.Red,
                                topLeft = Offset(x = 100f, y = 100f)
                            )
                        }
                    }
                }
            }
        }
    }
}