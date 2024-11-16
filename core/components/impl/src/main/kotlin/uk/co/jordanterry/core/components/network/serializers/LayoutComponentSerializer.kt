package uk.co.jordanterry.core.components.network.serializers

import kotlinx.serialization.json.JsonContentPolymorphicSerializer
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.jsonObject
import kotlinx.serialization.json.jsonPrimitive
import uk.co.jordanterry.core.components.network.models.LayoutComponent

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
