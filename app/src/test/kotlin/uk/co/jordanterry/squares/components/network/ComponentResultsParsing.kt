package uk.co.jordanterry.squares.components.network

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.collections.shouldHaveSize
import io.kotest.matchers.maps.shouldContainKey
import io.kotest.matchers.maps.shouldHaveSize
import io.kotest.matchers.types.shouldBeInstanceOf
import kotlinx.serialization.json.Json

class ComponentResultsParsing : DescribeSpec({

    val json = Json {
        ignoreUnknownKeys = true
        allowStructuredMapKeys = true
    }

    describe("Parsing a component result") {
        it("1 screen with 1 component") {
            val subject = """
            {
                "screens" : {
                     "Home" : {
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
                }
            }
        """.trimIndent()

            json.decodeFromString(ComponentResults.serializer(), subject)
                .shouldBeInstanceOf<ComponentResults> { results ->
                    results.screens shouldHaveSize 1
                    results.screens shouldContainKey ScreenDefinition("Home")
                    results.screens[ScreenDefinition("Home")].shouldBeInstanceOf<LayoutComponent.SingleColumnList> { layoutComponent ->
                        layoutComponent.components shouldHaveSize 1
                    }
                }
        }

        it("1 screen with 3 components") {
            val subject = """
            {
                "screens" : {
                    "Home" : {
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
                            }
                        ]
                    }
                }
            }
        """.trimIndent()

            json.decodeFromString(ComponentResults.serializer(), subject)
                .shouldBeInstanceOf<ComponentResults> { results ->
                    results.screens shouldHaveSize 1
                    results.screens shouldContainKey ScreenDefinition("Home")
                    results.screens[ScreenDefinition("Home")].shouldBeInstanceOf<LayoutComponent.SingleColumnList> { layoutComponent ->
                        layoutComponent.components shouldHaveSize 3
                    }
                }
        }

        it("3 screens") {
            val subject = """
            {
                "screens" : {
                    "Home" : {
                        "type" : "SingleColumnList",
                        "components" : [
                            {
                                "textAttributes" : {
                                    "text" : "Home",
                                    "textSize" : "Small"
                                }
                            }
                        ]
                    },
                    "Settings" : {
                        "type" : "SingleColumnList",
                        "components" : [
                            {
                                "textAttributes" : {
                                    "text" : "Settings",
                                    "textSize" : "Small"
                                }
                            }
                        ]
                    },
                    "About" : {
                        "type" : "SingleColumnList",
                        "components" : [
                            {
                                "textAttributes" : {
                                    "text" : "About",
                                    "textSize" : "Small"
                                }
                            }
                        ]
                    }
                }
            }
        """.trimIndent()

            json.decodeFromString(ComponentResults.serializer(), subject)
                .shouldBeInstanceOf<ComponentResults> { results ->
                    results.screens shouldHaveSize 3
                    results.screens shouldContainKey ScreenDefinition("Home")
                    results.screens shouldContainKey ScreenDefinition("Settings")
                    results.screens shouldContainKey ScreenDefinition("About")
                }
        }


        it("3 screens with same key should fail") {
            val subject = """
            {
                "screens" : {
                    "About" : {
                        "type" : "SingleColumnList",
                        "components" : [
                            {
                                "textAttributes" : {
                                    "text" : "Home",
                                    "textSize" : "Small"
                                }
                            }
                        ]
                    },
                    "About" : {
                        "type" : "SingleColumnList",
                        "components" : [
                            {
                                "textAttributes" : {
                                    "text" : "Settings",
                                    "textSize" : "Small"
                                }
                            }
                        ]
                    },
                    "About" : {
                        "type" : "SingleColumnList",
                        "components" : [
                            {
                                "textAttributes" : {
                                    "text" : "About",
                                    "textSize" : "Small"
                                }
                            }
                        ]
                    }
                }
            }
        """.trimIndent()

            json.decodeFromString(ComponentResults.serializer(), subject)
                .shouldBeInstanceOf<ComponentResults> { results ->
                    results.screens shouldHaveSize 1
                    results.screens shouldContainKey ScreenDefinition("About")
                }
        }
    }
})