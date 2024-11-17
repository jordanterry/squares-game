package uk.co.jordanterry.core.components.network.serializers

import kotlinx.serialization.json.JsonContentPolymorphicSerializer
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.jsonObject
import uk.co.jordanterry.core.components.network.models.ActionComponent

internal object ActionComponentSerializer :
    JsonContentPolymorphicSerializer<ActionComponent>(ActionComponent::class) {
    override fun selectDeserializer(element: JsonElement) = when {
        "navigateTo" in element.jsonObject -> ActionComponent.NavigateTo.serializer()
        else -> ActionComponent.serializer()
    }
}
