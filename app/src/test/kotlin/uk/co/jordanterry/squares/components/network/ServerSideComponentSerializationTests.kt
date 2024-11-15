package uk.co.jordanterry.squares.components.network

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.types.shouldBeInstanceOf
import kotlinx.serialization.json.Json

class ServerSideComponentSerializationTests : DescribeSpec({
    val json = Json {
        ignoreUnknownKeys = true
    }

    describe("button component parsing") {

        it("buttonAttributes.type = Large") {
            val subject = """
                {
                    "buttonAttributes" : {
                        "text" : "Hello",
                        "type" : "Large"
                    }
                }
            """.trimIndent()
            json.decodeFromString(ServerSideComponentSerializer, subject)
                .shouldBeInstanceOf<ServerSideComponent.Button> { button ->
                    button.buttonAttributes shouldBe ServerSideComponent.Button.ButtonAttributes(
                        text = "Hello",
                        type = ServerSideComponent.Button.ButtonType.Large
                    )
                }
        }

        it("buttonAttributes.type = Medium") {
            val subject = """
                {
                    "buttonAttributes" : {
                        "text" : "Hello",
                        "type" : "Medium"
                    }
                }
            """.trimIndent()
            json.decodeFromString(ServerSideComponentSerializer, subject)
                .shouldBeInstanceOf<ServerSideComponent.Button> { button ->
                    button.buttonAttributes shouldBe ServerSideComponent.Button.ButtonAttributes(
                        text = "Hello",
                        type = ServerSideComponent.Button.ButtonType.Medium
                    )
                }

        }

        it("buttonAttributes.type = Small") {
            val subject = """
                {
                    "buttonAttributes" : {
                        "text" : "Hello",
                        "type" : "Small"
                    }
                }
            """.trimIndent()
            json.decodeFromString(ServerSideComponentSerializer, subject)
                .shouldBeInstanceOf<ServerSideComponent.Button> { button ->
                    button.buttonAttributes shouldBe ServerSideComponent.Button.ButtonAttributes(
                        text = "Hello",
                        type = ServerSideComponent.Button.ButtonType.Small
                    )
                }

        }

    }

    describe("text component parsing") {

        it("textAttributes = Small") {
            val subject = """
                {
                    "textAttributes" : {
                        "text" : "Welcome to Squares!",
                        "textSize" : "Small"
                    }
                }
            """.trimIndent()
            json.decodeFromString(ServerSideComponentSerializer, subject)
                .shouldBeInstanceOf<ServerSideComponent.Text> { button ->
                    button.textAttributes shouldBe ServerSideComponent.Text.TextAttributes(
                        text = "Welcome to Squares!",
                        textSize = ServerSideComponent.Text.TextSize.Small,
                    )
                }
        }

        it("textAttributes = Medium") {
            val subject = """
                {
                    "textAttributes" : {
                        "text" : "Welcome to Squares!",
                        "textSize" : "Medium"
                    }
                }
            """.trimIndent()
            json.decodeFromString(ServerSideComponentSerializer, subject)
                .shouldBeInstanceOf<ServerSideComponent.Text> { button ->
                    button.textAttributes shouldBe ServerSideComponent.Text.TextAttributes(
                        text = "Welcome to Squares!",
                        textSize = ServerSideComponent.Text.TextSize.Medium,
                    )
                }
        }

        it("textAttributes = Large") {
            val subject = """
                {
                    "textAttributes" : {
                        "text" : "Welcome to Squares!",
                        "textSize" : "Large"
                    }
                }
            """.trimIndent()
            json.decodeFromString(ServerSideComponentSerializer, subject)
                .shouldBeInstanceOf<ServerSideComponent.Text> { button ->
                    button.textAttributes shouldBe ServerSideComponent.Text.TextAttributes(
                        text = "Welcome to Squares!",
                        textSize = ServerSideComponent.Text.TextSize.Large,
                    )
                }
        }
    }
})