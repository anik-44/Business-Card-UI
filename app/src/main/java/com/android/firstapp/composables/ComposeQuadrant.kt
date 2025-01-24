package com.android.firstapp.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.android.firstapp.R
import com.android.firstapp.ui.theme.FirstAppTheme
import com.android.firstapp.ui.theme.Quadrant1
import com.android.firstapp.ui.theme.Quadrant2
import com.android.firstapp.ui.theme.Quadrant3
import com.android.firstapp.ui.theme.Quadrant4

@Composable
fun ComposableQuadrant(
    header: String,
    description: String,
    backGroundColor: Color,
    modifier: Modifier
) {
    Surface(
        color = backGroundColor, modifier = modifier,
    ) {
        Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxSize().padding(16.dp)) {
            Text(
                text = header,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 16.dp)
            )
            Text(
                text = description, textAlign = TextAlign.Justify
            )
        }
    }
}


@Composable
fun QuadrantContainer(modifier: Modifier) {
    Column(
        modifier
            .fillMaxSize()
            .background(Quadrant2)
    ) {
        Row(modifier.weight(1f)) {
            ComposableQuadrant(
                header = stringResource(R.string.text_composable),
                description = stringResource(R.string.text_composable_description),
                backGroundColor = Quadrant1,
                modifier = Modifier.weight(1f)
            )

            ComposableQuadrant(
                header = stringResource(R.string.image_composable),
                description = stringResource(R.string.image_compose_description),
                Quadrant2,
                modifier = Modifier.weight(1f)
            )
        }
        Row(modifier.weight(1f)) {
            ComposableQuadrant(
                header = stringResource(R.string.row_composable),
                description = stringResource(R.string.row_compose_description),
                backGroundColor = Quadrant3,
                modifier = Modifier.weight(1f)
            )
            ComposableQuadrant(
                header = stringResource(R.string.column_composable),
                description = stringResource(R.string.column_compose_description),
                Quadrant4,
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ComposeArticlePreview() {
    FirstAppTheme {
        ComposableQuadrant(
            header = stringResource(R.string.text_composable),
            description = stringResource(R.string.text_composable_description),
            backGroundColor = Quadrant1,
            modifier = Modifier
        )
    }
}
