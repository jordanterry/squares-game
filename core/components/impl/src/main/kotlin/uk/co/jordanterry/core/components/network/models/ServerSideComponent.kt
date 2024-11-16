package uk.co.jordanterry.core.components.network.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
sealed interface ServerSideComponent {

    @Serializable
    data class Button(
        @SerialName("buttonAttributes")
        val buttonAttributes: ButtonAttributes,
    ) : ServerSideComponent {
        @Serializable
        data class ButtonAttributes(
            @SerialName("text")
            val text: String,
            val type: ButtonType,
        )

        @Serializable
        enum class ButtonType {
            @SerialName("Small")
            Small,

            @SerialName("Medium")
            Medium,

            @SerialName("Large")
            Large;
        }
    }

    @Serializable
    data class Text(
        @SerialName("textAttributes")
        val textAttributes: TextAttributes,
    ) : ServerSideComponent {
        @Serializable
        data class TextAttributes(
            @SerialName("text")
            val text: String,
            @SerialName("textSize")
            val textSize: TextSize,
        )

        @Serializable
        enum class TextSize {
            @SerialName("Small")
            Small,

            @SerialName("Medium")
            Medium,

            @SerialName("Large")
            Large;
        }
    }
}