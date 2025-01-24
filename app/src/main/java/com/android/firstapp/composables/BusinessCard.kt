package com.android.firstapp.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.android.firstapp.R
import com.android.firstapp.ui.theme.BoldGreen
import com.android.firstapp.ui.theme.CardBackground
import com.android.firstapp.ui.theme.androidBackground

@Composable
fun BusinessCard(modifier: Modifier) {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(CardBackground)
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
                .background(CardBackground)
        ) {
            val image = painterResource(R.drawable.android_logo)
            val text1 = stringResource(R.string.jennifer_doe)
            val text2 = stringResource(R.string.android_developer_extraordinaire)
            BusinessCardHeader(image, text1, text2)
        }

        Column(
            modifier
                .fillMaxSize()
                .padding(bottom = 24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Bottom,
        ) {

            val phoneIcon = painterResource(R.drawable.call_24dp_e8eaed)
            val shareIcon = painterResource(R.drawable.share_24dp_e8eaed_fill0_wght400_grad0_opsz24)
            val mailIcon = painterResource(R.drawable.mail_24dp_e8eaed_fill0_wght400_grad0_opsz24)
            BusinessCardFooter(phoneIcon, "phoneIcon", "(+91) 9999988888")
            BusinessCardFooter(shareIcon, "Tag icon", "@AndroidDev")
            BusinessCardFooter(mailIcon, "mailIcon", "jen.doe.1@mail.com")
        }

    }

}


@Composable
fun BusinessCardHeader(image: Painter, name: String, title: String) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Image(
            image,
            contentDescription = "Avatar",
            modifier = Modifier
                .width(100.dp)
                .height(100.dp)
                .background(androidBackground)
        )
        Text(
            modifier = Modifier.padding(4.dp),
            text = name,
            fontSize = 40.sp,
            fontWeight = FontWeight.Light,
            textAlign = TextAlign.Center
        )
        Text(text = title, fontWeight = FontWeight.Bold, color = BoldGreen, fontSize = 12.sp)
    }
}

@Composable
fun BusinessCardFooter(icon: Painter, iconDes: String, text: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 100.dp)
    ) {
        Icon(
            icon, contentDescription = iconDes,
            tint = BoldGreen,
            modifier = Modifier.size(20.dp).align(Alignment.CenterVertically)
        )
        Spacer(modifier = Modifier.width(20.dp))
        Text(
            text,
            fontSize = 14.sp
        )
    }

}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ComposePreview() {
    BusinessCard(modifier = Modifier)
}