package com.example.one_page_intro_mycoureses

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.one_page_intro_mycoureses.ui.theme.One_Page_intro_mycouresesTheme
import kotlin.text.Typography


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            One_Page_intro_mycouresesTheme {
                MaterialUIApp()
            }
        }
    }
}
@Composable
fun MaterialUIApp(){
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "My Courses")
                },
                navigationIcon = {
                    IconButton(onClick = { }) {
                        Icon(Icons.Filled.Menu, contentDescription = null)
                    }
                },
                actions = {
                    IconButton(onClick = { Log.d("ButtonClicked",
                        "Notification Button Clicked")
                    }) {
                        Icon(Icons.Filled.Notifications, contentDescription = null)
                    }
                    IconButton(onClick = { Log.d("ButtonClicked",
                        "Search Button Clicked")
                    }) {
                        Icon(Icons.Filled.Search, contentDescription = null)
                    }
                    IconButton(onClick = { Log.d("ButtonClicked",
                        "Account Button Clicked")
                    }) {
                        Icon(Icons.Filled.AccountCircle, contentDescription = null)
                    }
                }
            )
        }
    ) {
        AppIntro()
    }
}
@Composable
fun AppIntro(){
    val backgroundImage = painterResource(id = R.drawable.application)

    Box{
        Image(painter = backgroundImage, contentDescription ="background image",
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth(),
            contentScale = ContentScale.Crop)
    }
    LazyColumn(
        Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        contentPadding = PaddingValues(horizontal = 10.dp, vertical = 20.dp),
        verticalArrangement =  Arrangement.spacedBy(10.dp),
    ) {
        item {
            Text(text = "Name of the App: My Courses\n", fontSize = 25.sp, fontWeight = FontWeight.ExtraBold)
            Text(text = "Category: University App\n", fontSize = 25.sp,fontWeight = FontWeight.ExtraBold)
            Text(text = "Problem Statements:\n", fontSize = 25.sp, fontWeight = FontWeight.ExtraBold)
            Text(text = ">>The newly admitted students are unclear and unaware about the subjects,course content and syllabus which are going to be taught in the campus ", fontSize = 20.sp)
            Text(text = ">>Because of the improper management system in the university students are confused about the syllabus and course content that they need to study during their entire course\n", fontSize = 20.sp)
            Text(text = "Proposed solution:\n",fontSize = 25.sp, fontWeight = FontWeight.ExtraBold)
            Text(text = ">>With the help of My Courses App you can easily know every details about your courses,contents whichever course you want to study. \n",
                fontSize = 20.sp)
            Text(text = ">>After you login into the app using university name and your roll number  and other basic details, your entire syllabus and course content of entire course period start " +
                    " reflecting into the app.\n", fontSize = 20.sp)
            Text(text = ">>You can easily depend upon the app for your entire period of course\n", fontSize = 20.sp)
            Text(text = ">>You can buy courses online if you don't get satisfied with the course content provided by the university.\n", fontSize = 20.sp)

            Text(text = "App ScreenShot", fontSize = 25.sp, fontWeight = FontWeight.ExtraBold)
            Image(painter = painterResource(id = R.drawable.appimg), contentDescription = "AppScreenshot",
            modifier = Modifier
                .padding(1.dp)
                .fillMaxWidth(),contentScale = ContentScale.Crop
            )
            Text(text = "Functionality And Concept Used",fontSize = 25.sp, fontWeight = FontWeight.ExtraBold)
            Text(text = ">>It includes function to access all the syllabus and course content side by side in just 1 click.\n", fontSize = 20.sp)
            Text(text = ">>You can buy courses of your own choice from various online platforms according to your needs and ability.\n", fontSize = 20.sp)
            Text(text = ">>It is based on various online study platform apps such as udemy and uses the concept of lms portal\n", fontSize = 20.sp)
            Text(text = "Application links", fontSize = 25.sp, fontWeight = FontWeight.ExtraBold)
            SelectionContainer() {
            Text(text = "https://github.com/Suraz343/My-Courses-App-/tree/master", fontSize = 20.sp)}
            Text(text = "The above text is selectable", fontSize = 15.sp)
            Text(text = "Future Scopes", fontSize = 25.sp, fontWeight = FontWeight.ExtraBold)
            Text(text = ">>It will be very easy for the students to study in a consistent way.\n", fontSize = 20.sp)
            Text(text = ">>An effective way of studying your course content\n", fontSize = 20.sp)
            Text(text = ">>With the help of prototype of this app ,other universities or educational platforms can develop similar app of their own syllabus and course content\n", fontSize = 20.sp)
            


        }

    }
}

