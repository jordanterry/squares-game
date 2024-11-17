package uk.co.jordanterry.core.components

public sealed interface Component {

    public sealed interface Button : Component {
        public val action: Action

        public data class Small(
            val text: String,
            override val action: Action
        ) : Button

        public data class Medium(
            val text: String,
            override val action: Action
        ) : Button

        public data class Large(
            val text: String,
            override val action: Action
        ) : Button
    }

    public sealed interface Text : Component {
        public data class Small(
            val text: String
        ) : Text

        public data class Medium(
            val text: String
        ) : Text

        public data class Large(
            val text: String
        ) : Text
    }
}
