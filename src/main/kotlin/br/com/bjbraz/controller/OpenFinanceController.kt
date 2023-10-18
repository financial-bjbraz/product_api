package br.com.bjbraz.controller

import br.com.bjbraz.entity.docted.BankEntity
import br.com.bjbraz.entity.openbanking.*
import br.com.bjbraz.repository.*
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.*
import org.springframework.cache.annotation.CacheConfig
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/open_finance")
@CacheConfig(cacheNames= ["open_finance"])
@CrossOrigin(origins = ["http://192.168.0.18:80", "http://192.168.0.18", "http://192.168.0.18/exchange"])
class OpenFinanceController(
    val repository: ParticipantsOpenBankRepository,
    val apiResourceRepository: ApiResourceRepository,
    val resumeAccountPrePaidRepository: ResumeAccountPrePaidRepository,
    val resumeHttpStatusCodeRepository: ResumeHttpStatusCodeRepository,
    val totalApisRepository: TotalApisRepository,
    val totalParticipantsRepository: TotalParticipantsRepository,
    val resumeCreditCardServicesRepository: ResumeCreditCardServicesRepository
    ) {
    private val logger = LoggerFactory.getLogger(OpenFinanceController::class.java)

    @GetMapping(value = ["/all"], produces = ["application/json"])
    fun listAll(): ResponseEntity<Flux<ParticipantsEntity>> {
        return ResponseEntity.status(HttpStatus.OK).body(repository.findAll())
    }

    @GetMapping(value = ["/totals"], produces = ["application/json"])
    fun total(): ResponseEntity<Flux<TotalParticipantsEntity>> {
        return ResponseEntity.status(HttpStatus.OK).body(totalParticipantsRepository.findAll())
    }

    @GetMapping(value = ["/apis"], produces = ["application/json"])
    fun implementsPerApi(): ResponseEntity<Flux<TotalApisEntity>> {
        return ResponseEntity.status(HttpStatus.OK).body(totalApisRepository.findAll())
    }

    @GetMapping(value = ["/prepaid"], produces = ["application/json"])
    fun prepaidAccountFees(): ResponseEntity<Flux<ResumeAccountPrePayed>> {
        return ResponseEntity.status(HttpStatus.OK).body(resumeAccountPrePaidRepository.findAll())
    }

    @GetMapping(value = ["/http"], produces = ["application/json"])
    fun httpResume(): ResponseEntity<Flux<ResumeHttpStatusCodeEntity>> {
        return ResponseEntity.status(HttpStatus.OK).body(resumeHttpStatusCodeRepository.findAll())
    }

    @GetMapping(value = ["/resource/{httpCode}"], produces = ["application/json"])
    fun httpResources(@PathVariable httpCode:String): ResponseEntity<Flux<ApiResourceEntity>> {
        return ResponseEntity.status(HttpStatus.OK).body(apiResourceRepository.findAll())
    }

    @GetMapping(value = ["/creditcards"], produces = ["application/json"])
    fun creditCardsFees(): ResponseEntity<Flux<ResumeCreditCardServicesEntity>> {
        return ResponseEntity.status(HttpStatus.OK).body(resumeCreditCardServicesRepository.findAll())
    }



}