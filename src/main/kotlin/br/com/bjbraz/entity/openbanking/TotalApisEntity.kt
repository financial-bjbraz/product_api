package br.com.bjbraz.entity.openbanking

import lombok.Builder
import lombok.Data
import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDateTime

@Data
@Builder
@Document(collection = "open_banking_total_apis")
class TotalApisEntity(
    @Id
    val id: ObjectId? = null,
    val apiName: String? = null,
    val dhExtraction: LocalDateTime? = null,
    val totalParticipantsUsing: Long? = null
)