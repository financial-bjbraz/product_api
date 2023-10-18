package br.com.bjbraz.repository

import br.com.bjbraz.entity.openbanking.ApiResourceEntity
import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository
import reactor.core.publisher.Flux

@Repository
interface ApiResourceRepository : ReactiveMongoRepository<ApiResourceEntity, ObjectId> {
    fun findByLastResponse(http: String?): Flux<ApiResourceEntity>
}