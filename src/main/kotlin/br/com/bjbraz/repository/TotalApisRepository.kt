package br.com.bjbraz.repository

import br.com.bjbraz.entity.openbanking.TotalApisEntity
import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository

@Repository
interface TotalApisRepository : ReactiveMongoRepository<TotalApisEntity, ObjectId> {
}