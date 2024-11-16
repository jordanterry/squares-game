package uk.co.jordanterry.squares.components.network

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.collections.shouldHaveSize
import io.kotest.matchers.shouldBe
import io.kotest.matchers.types.shouldBeInstanceOf
import kotlinx.serialization.json.Json


class LayoutComponentSerializerTest : DescribeSpec({
    val json = Json {
        ignoreUnknownKeys = true
    }

    describe("SingleColumnList") {

        it("1 component") {
            val subject = """
            {
                "type" : "SingleColumnList",
                "components" : [
                    {
                        "textAttributes" : {
                            "text" : "Squares",
                            "textSize" : "Small"
                        }
                    }
                ]
            }
        """.trimIndent()

            json.decodeFromString(LayoutComponentSerializer, subject)
                .shouldBeInstanceOf<LayoutComponent.SingleColumnList> { layout ->
                    layout.components shouldHaveSize 1
                }
        }

        it("10 components") {
            val subject = """
            {
                "type" : "SingleColumnList",
                "components" : [
                    {
                        "textAttributes" : {
                            "text" : "Squares",
                            "textSize" : "Small"
                        }
                    },
                    {
                        "textAttributes" : {
                            "text" : "Squares",
                            "textSize" : "Small"
                        }
                    },
                    {
                        "textAttributes" : {
                            "text" : "Squares",
                            "textSize" : "Small"
                        }
                    },
                    {
                        "textAttributes" : {
                            "text" : "Squares",
                            "textSize" : "Small"
                        }
                    },
                    {
                        "textAttributes" : {
                            "text" : "Squares",
                            "textSize" : "Small"
                        }
                    },
                    {
                        "textAttributes" : {
                            "text" : "Squares",
                            "textSize" : "Small"
                        }
                    },
                    {
                        "buttonAttributes" : {
                            "text" : "Squares",
                            "type" : "Medium"
                        }
                    },
                    {
                        "textAttributes" : {
                            "text" : "Squares",
                            "textSize" : "Small"
                        }
                    },
                    {
                        "textAttributes" : {
                            "text" : "Squares",
                            "textSize" : "Small"
                        }
                    },
                    {
                        "textAttributes" : {
                            "text" : "Squares",
                            "textSize" : "Medium"
                        }
                    }
                ]
            }
        """.trimIndent()

            json.decodeFromString(LayoutComponentSerializer, subject)
                .shouldBeInstanceOf<LayoutComponent.SingleColumnList> { layout ->
                    layout.components shouldHaveSize 10
                    layout.components.count { component -> component is ServerSideComponent.Button } shouldBe 1
                    layout.components.count { component -> component is ServerSideComponent.Text } shouldBe 9
                }
        }

        it("no components") {
            val subject = """
            {
                "type" : "SingleColumnList",
                "components" : [ ]
            }
        """.trimIndent()

            json.decodeFromString(LayoutComponentSerializer, subject)
                .shouldBeInstanceOf<LayoutComponent.SingleColumnList> { layout ->
                    layout.components shouldHaveSize 0
                }
        }

        it("no component element") {
            val subject = """
            {
                "type" : "SingleColumnList"
            }
        """.trimIndent()

            json.decodeFromString(LayoutComponentSerializer, subject)
                .shouldBeInstanceOf<LayoutComponent.SingleColumnList> { layout ->
                    layout.components shouldHaveSize 0
                }
        }

        it("all invalid components") {
            val subject = """
                {
                    "type" : "SingleColumnList",
                    "components" : [
                        {
                            "hello" : "hi"
                        },
                        { }
                    ]
                }
            """.trimIndent()

            json.decodeFromString(LayoutComponentSerializer, subject)
                .shouldBeInstanceOf<LayoutComponent.SingleColumnList> { layout ->
                    layout.components shouldHaveSize 0
                }
        }

        it("some invalid components") {
            val subject = """
                {
                    "type" : "SingleColumnList",
                    "components" : [
                        {
                            "hello" : "hi"
                        },
                        { },
                        {
                            "textAttributes" : {
                                "text" : "Squares",
                                "textSize" : "Medium"
                            }
                        }
                    ]
                }
            """.trimIndent()

            json.decodeFromString(LayoutComponentSerializer, subject)
                .shouldBeInstanceOf<LayoutComponent.SingleColumnList> { layout ->
                    layout.components shouldHaveSize 1
                }
        }
    }
})
