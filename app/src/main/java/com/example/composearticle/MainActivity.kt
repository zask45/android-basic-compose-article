package com.example.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composearticle.ui.theme.ComposeArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeArticleTheme {
                // A surface container using the 'background' color from the theme
                Surface {
                    Article()
                }
            }
        }
    }
}

@Composable
fun Title() {
    Text(
        text = "Jetpack Compose tutorial",
        fontSize = 24.sp,
        modifier = Modifier.padding(16.dp)
    )
}

@Composable
fun TextParagraph(content: String, modifier: Modifier) {
    Text(
        text = content,
        textAlign = TextAlign.Justify,
        modifier = modifier
    )
}

@Composable
fun CoverImage() {
    val image = painterResource(id = R.drawable.bg_compose_background)
    Image(
        painter = image,
        contentDescription = null
    )
}

@Composable
fun Article() {
    Column {
        CoverImage()
        Title()
        TextParagraph(
            content = stringResource(R.string.first_paragraph),
            modifier = Modifier.padding(horizontal = 16.dp)
        )
        TextParagraph(
            content = stringResource(id = R.string.second_paragraph),
            modifier = Modifier.padding(16.dp)
        )
    }
}




@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun GreetingPreview() {
    ComposeArticleTheme {
        Article()
    }
}