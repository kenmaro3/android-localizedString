package com.example.localizedstring.Views

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.example.localizedstring.R
import com.example.localizedstring.ui.theme.LocalizedStringTheme

@Composable
fun Home() {
    val context = LocalContext.current
    Text(
        text = context.getString(R.string.greetingTitle)
    )
}

@Preview(showBackground = true)
@Composable
fun HomePreview() {
    LocalizedStringTheme {
        Home()
    }
}
