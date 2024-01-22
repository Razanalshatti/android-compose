
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

private val Typography.h5: TextStyle
    get() {
        TODO("Not yet implemented")
    }


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FeatherAndroidTasksTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TrueFalseGame()
                }
            }
        }
    }
}
@Composable
fun TrueFalseGame() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        // Step 2: Add Text for the question
        Text(
            text = "Is the sky blue?",
            style = MaterialTheme.typography.h5
        )

        // Step 3: Use Row layout for true and false buttons
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            // True button
            TrueFalseButton(text = "True", isTrue = true)

            // Spacer for button spacing
            Spacer(modifier = Modifier.width(16.dp))

            // False button
            TrueFalseButton(text = "False", isTrue = false)
        }

        // Step 4: Add Next Question button
        Button(
            onClick = { /* Handle next question click */ },
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(top = 16.dp)
        ) {
            Text(text = "Next Question")
        }

        // Step 5: Create custom composable for Correct Answer and Wrong Answer
        CorrectWrongAnswer(isCorrect = true) // Change to false for Wrong Answer
    }
}

@Composable
fun TrueFalseButton(text: String, isTrue: Boolean) {
    Button(
        onClick = {  },
        modifier = Modifier
            .weight(1f)
            .fillMaxWidth()
    ) {
        Text(text = text)
    }
}

private fun Any.fillMaxWidth(): Modifier {
    TODO("Not yet implemented")
}

private fun Modifier.Companion.weight(fl: Float): Any {
    TODO("Not yet implemented")
}

@Composable
fun CorrectWrongAnswer(isCorrect: Boolean) {
    // Bonus: Use Box to create Correct and Wrong Answer circles
    Box(
        modifier = Modifier
            .size(40.dp)
            .clip(CircleShape)
            .background(
                color = if (isCorrect) Color.Green else Color.Red
            ),
        contentAlignment = Alignment.Center
    ) {
        // Bonus: Use icons for Correct and Wrong Answer
        Icon(
            imageVector = if (isCorrect) Icons.Default.CheckCircle else Icons.Default.Clear,
            contentDescription = if (isCorrect) "Correct Answer" else "Wrong Answer",
            tint = Color.White
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewTrueFalseGame() {
    FeatherAndroidTasksTheme {
        TrueFalseGame()
    }
}

@Composable
fun FeatherAndroidTasksTheme(content: @Composable () -> Unit) {
    TODO("Not yet implemented")
}
