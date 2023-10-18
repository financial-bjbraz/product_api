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
@Document(collection = "open_banking_resume_pa")
class ResumeAccountPrePayed (
        @Id
        val id: ObjectId? = null,
        val friendlyName: String? = null,
        val dhExtraction: LocalDateTime? = null,

        @Field("feeMaximumService")
        val expensiveService: String? = null,
        val feeMaximum: Double? = null,

        @Field("feeMinimumService")
        val cheapService: String? = null,
        val feeMinimum: Double? = null,

        @Field("qrdRanges")
        val totalRanges: Long? = null,

        val url: String? = null
)
