package com.example.weatherforecast

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.weatherforecast.ui.theme.WeatherForecastTheme
import com.example.weatherforecast.weather.DataStore
import com.example.weatherforecast.weather.GettingWeatherData

class MainActivity : ComponentActivity() {


    var name = "d"/*gettingWeatherData.getDataWeather(dataStore.komsomolskiy).toString()*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WeatherForecastTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainScreen()


                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}




@Preview(showBackground = true)
@Composable
fun MainScreen(){

    val gettingWeatherData = GettingWeatherData()
    val dataStore = DataStore()

    Column{
        Button(onClick = {



        }) {
            Text("Назад", fontSize = 25.sp)
        }

    }
}

