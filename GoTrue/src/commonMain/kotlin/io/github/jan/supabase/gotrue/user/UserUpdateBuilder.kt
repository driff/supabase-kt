package io.github.jan.supabase.gotrue.user

import io.github.jan.supabase.gotrue.GoTrue
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonObjectBuilder
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.jsonObject

/**
 * A builder for updating a user.
 * @param email The user's new email address
 * @param password The user's new password
 * @param phoneNumber The user's new phone number
 * @param nonce The nonce sent for reauthentication if the user's password is to be updated. Call [GoTrue.reauthenticate] to send the nonce to the user's email.
 * @param data Extra user metadata
 */
@Serializable
data class UserUpdateBuilder(
    var email: String? = null,
    var password: String? = null,
    @SerialName("phone")
    var phoneNumber: String? = null,
    var nonce: String? = null,
    var data: JsonObject? = null,
) {

    /**
     * Adds user-specific metadata
     */
    inline fun <reified T> data(data: T, json: Json = Json) {
        this.data = json.encodeToJsonElement(data).jsonObject
    }

    /**
     * Adds user-specific metadata
     */
    inline fun data(builder: JsonObjectBuilder.() -> Unit) {
        data = buildJsonObject(builder)
    }

}
