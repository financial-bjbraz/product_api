package br.com.bjbraz.entity.openbanking

import lombok.Builder
import lombok.Data
import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document


@Data
@Builder
@Document(collection = "open_banking_participants")
class ParticipantsEntity (

    @Id
    val id: ObjectId? = null,
    val legalEntityName: String? = null,
    val registeredName: String? = null,
    val logo: String? = null,
    val status: String? = null

)