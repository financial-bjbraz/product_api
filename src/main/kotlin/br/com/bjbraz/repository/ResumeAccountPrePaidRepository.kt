package br.com.bjbraz.repository

import br.com.bjbraz.entity.openbanking.ResumeAccountPrePayed
import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository

@Repository
interface ResumeAccountPrePaidRepository : ReactiveMongoRepository<ResumeAccountPrePayed, ObjectId> {
}