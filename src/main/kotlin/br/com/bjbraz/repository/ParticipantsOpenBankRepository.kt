package br.com.bjbraz.repository

import br.com.bjbraz.entity.openbanking.ParticipantsEntity
import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository

@Repository
interface ParticipantsOpenBankRepository  : ReactiveMongoRepository<ParticipantsEntity, ObjectId> {
}