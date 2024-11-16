package uk.co.jordanterry.core.components.network.serializers

import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerializationException
import kotlinx.serialization.SerializationStrategy
import kotlinx.serialization.builtins.ListSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonDecoder
import kotlinx.serialization.json.jsonArray
import uk.co.jordanterry.core.components.network.models.ServerSideComponent

object ServerSideListComponentSerializer : KSerializer<List<ServerSideComponent>> {
    private val elementSerializer = ServerSideComponentSerializer
    private val serializer: SerializationStrategy<List<ServerSideComponent>> =
        ListSerializer(elementSerializer)
    override val descriptor: SerialDescriptor = serializer.descriptor

    override fun deserialize(decoder: Decoder): List<ServerSideComponent> {
        require(decoder is JsonDecoder) { "This deserializer can only be used with Json" }
        val json = decoder.json
        val list = decoder.decodeJsonElement()
        return list
            .jsonArray
            .mapNotNull {
                try {
                    json.decodeFromJsonElement(elementSerializer, it)
                } catch (e: SerializationException) {
                    null
                } catch (e: IllegalArgumentException) {
                    null
                }
            }
    }

    override fun serialize(
        encoder: Encoder,
        value: List<ServerSideComponent>,
    ): Unit = serializer.serialize(encoder, value)
}
