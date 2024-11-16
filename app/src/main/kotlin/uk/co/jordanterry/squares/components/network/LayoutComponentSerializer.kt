package uk.co.jordanterry.squares.components.network

import kotlinx.serialization.json.JsonContentPolymorphicSerializer
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive

object LayoutComponentSerializer :
    JsonContentPolymorphicSerializer<LayoutComponent>(LayoutComponent::class) {
    override fun selectDeserializer(element: JsonElement) = when {
        "type" in element.jsonObject -> {
            when {
                element.jsonObject["type"]!!.jsonPrimitive == JsonPrimitive("SingleColumnList") -> LayoutComponent.SingleColumnList.serializer()
                else -> LayoutComponent.serializer()
            }
        }

        else -> LayoutComponent.serializer()
    }
}
