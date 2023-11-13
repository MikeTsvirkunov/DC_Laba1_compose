package com.example.laba1_compose

import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintSet

fun decoupledConstraints(): ConstraintSet {
    return ConstraintSet {
        val iconLabelRef = createRefFor("IconLabel")
        val headerImageRef = createRefFor("HeaderImage")
        val tagsRowRef = createRefFor("TagsRow")
        val descriptionFragmentRef = createRefFor("DescriptionFragment")
        val gameGalleryRowRef = createRefFor("GameGalleryRow")
        val ratingFragmentRow = createRefFor("RatingFragment")
        val commentSectionRef = createRefFor("CommentSection")
        constrain(headerImageRef) {
            top.linkTo(parent.top)
        }
        constrain(iconLabelRef) {
            top.linkTo(
                headerImageRef.bottom,
                margin = (-40).dp
            )
            start.linkTo(
                parent.start,
                margin = 25.dp
            )
        }
        constrain(tagsRowRef){
            top.linkTo(iconLabelRef.bottom)
            start.linkTo(
                parent.start,
                margin = 25.dp
            )
        }
        constrain(descriptionFragmentRef) {
            top.linkTo(
                tagsRowRef.bottom,
                margin = (10).dp
            )
            start.linkTo(
                parent.start,
                margin = 25.dp
            )
            end.linkTo(
                parent.end,
                margin = 25.dp
            )
        }
        constrain(gameGalleryRowRef) {
            top.linkTo(descriptionFragmentRef.bottom, margin = 10.dp)
        }
        constrain(ratingFragmentRow) {
            top.linkTo(gameGalleryRowRef.bottom, margin = 10.dp)
            start.linkTo(
                parent.start,
                margin = 25.dp
            )
        }
        constrain(commentSectionRef) {
            top.linkTo(ratingFragmentRow.bottom, margin = 10.dp)
            start.linkTo(
                parent.start,
                margin = 25.dp
            )
        }
    }
}
