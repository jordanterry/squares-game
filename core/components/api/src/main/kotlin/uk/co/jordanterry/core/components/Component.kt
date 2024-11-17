package uk.co.jordanterry.core.components

public sealed interface Component {

    public sealed interface Button : Component {
        public data class Small(
            val text: String
        ) : Button

        public data class Medium(
            val text: String
        ) : Button

        public data class Large(
            val text: String
        ) : Button
    }

    public sealed interface Text : Component {
        public data class Small(
            val text: String
        ) : Button

        public data class Medium(
            val text: String
        ) : Button

        public data class Large(
            val text: String
        ) : Button
    }
}
