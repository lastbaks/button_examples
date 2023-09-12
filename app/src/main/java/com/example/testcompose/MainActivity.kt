package com.example.testcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.testcompose.ui.theme.TestComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TestComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                     placeHolder()
                }
            }
        }
    }
}

@Composable
fun placeHolder(){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.Green)){
        simpleButton()
        buttonWithMultipleText()
        buttonWithCustomColor()
        ButtonWithCustomShape()
        ButtonWithRoundedCornerShape()
        LargeButton()
        FullWidthButton()
        ButtonWithImageAndText()
    }
}


@Composable
fun simpleButton(){
    var capt = remember {0}
    Button(onClick = { capt = 2}) {
        Text(text = "$capt")
    }
}

@Composable
fun buttonWithMultipleText(){
    Button(onClick = {}) {
        Text(text = "button with text ", color = Color.White)
        Text(text = "and another text", color = Color.Yellow)
    }
}

@Composable
fun buttonWithCustomColor(){
    Button(onClick = {}, colors = ButtonDefaults.buttonColors(Color.DarkGray)){
        Text(text = "Button with custom color")
    }
}

@Composable
fun ButtonWithCustomShape() {
    Button(onClick = {}, shape = RectangleShape) {
        Text(text = "Button with rectangle Shape")
    }
}

@Composable
fun ButtonWithRoundedCornerShape() {
    Button(onClick = {}, shape = RoundedCornerShape(10.dp)) {
        Text(text = "ButtonWithRoundedCornerShape")
    }
}

@Composable
fun LargeButton() {
    Button(onClick = {},
    modifier = Modifier
        .width(100.dp)
        .height(100.dp)){
        Text(text = "Large button")
    }
}

@Composable
fun FullWidthButton(){
    Button(onClick = {},
        shape = RectangleShape,
        modifier = Modifier.fillMaxWidth()
        ){
        Text(text = "Full width button")
    }
}

@Composable
fun ButtonWithImageAndText(){
    Button(onClick = {}) {
        Image(painter = painterResource(id = R.drawable.cart), contentDescription = "cart")
        Text(text = "   Go to shopping Cart", color = Color.Yellow)
    }
}




