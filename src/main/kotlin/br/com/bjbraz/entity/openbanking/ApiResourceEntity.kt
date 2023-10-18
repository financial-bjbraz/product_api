package br.com.bjbraz.entity.openbanking

import lombok.Builder
import lombok.Data
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime


@Data
@Builder
@Document(collection = "open_banking_api_resource")
class ApiResourceEntity(
    val apiEndpoint: String? = null,
    val friendlyName: String? = null,
    val registeredName: String? = null,
    val lastResponse: String? = null,
    val apiFamilyType: String? = null,
    val lastExecution: LocalDateTime? = null
)