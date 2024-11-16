package uk.co.jordanterry.core.components

sealed interface Component {

    sealed interface Button : Component {
        data class Small(
            val text: String
        ) : Button

        data class Medium(
            val text: String
        ) : Button

        data class Large(
            val text: String
        ) : Button
    }

    sealed interface Text : Component {
        data class Small(
            val text: String
        ) : Button

        data class Medium(
            val text: String
        ) : Button

        data class Large(
            val text: String
        ) : Button
    }
}


sealed interface Layout {
    data class SingleColumnList(
        val components: List<Component>,
    ) : Layout
}