package br.com.bjbraz.repository

import br.com.bjbraz.entity.openbanking.ResumeCreditCardServicesEntity
import br.com.bjbraz.entity.openbanking.ResumeHttpStatusCodeEntity
import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository

@Repository
interface ResumeCreditCardServicesRepository: ReactiveMongoRepository<ResumeCreditCardServicesEntity, ObjectId> {
}