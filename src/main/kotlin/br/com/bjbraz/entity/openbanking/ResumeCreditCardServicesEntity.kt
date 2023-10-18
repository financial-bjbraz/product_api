package br.com.bjbraz.entity.openbanking;

import lombok.Builder
import lombok.Data
import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.data.mongodb.core.mapping.Field
import java.time.LocalDateTime

@Data
@Builder
@Document(collection = "open_banking_resume_ccs")
class ResumeCreditCardServicesEntity (
    @Id
    val id: ObjectId? = null,
    val apiEndpoint: String? = null,
    val bandeira: String? = null,
    val friendlyName: String? = null,
    val maxValue: String? = null,
    val minValue : String? = null,
    val nomeProduto: String? = null,
    val participantName: String? = null,
    val registeredName: String? = null,
    val serviceName: String? = null
)
