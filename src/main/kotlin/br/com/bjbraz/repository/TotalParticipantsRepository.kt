package br.com.bjbraz.repository

import br.com.bjbraz.entity.openbanking.TotalParticipantsEntity
import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository

@Repository
interface TotalParticipantsRepository : ReactiveMongoRepository<TotalParticipantsEntity, ObjectId> {
}