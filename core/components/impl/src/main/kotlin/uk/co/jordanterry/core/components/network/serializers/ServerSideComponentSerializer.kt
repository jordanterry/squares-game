package uk.co.jordanterry.core.components.network.serializers

import kotlinx.serialization.json.JsonContentPolymorphicSerializer
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.jsonObject
import uk.co.jordanterry.core.components.network.models.ServerSideComponent

internal object ServerSideComponentSerializer :
    JsonContentPolymorphicSerializer<ServerSideComponent>(ServerSideComponent::class) {
    override fun selectDeserializer(element: JsonElement) = when {
        "buttonAttributes" in element.jsonObject -> ServerSideComponent.Button.serializer()
        "textAttributes" in element.jsonObject -> ServerSideComponent.Text.serializer()
        else -> ServerSideComponent.serializer()
    }
}
