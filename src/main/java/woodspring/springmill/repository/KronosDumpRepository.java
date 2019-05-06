package woodspring.springmill.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import woodspring.springmill.model.KronosDump;


@Repository
public interface KronosDumpRepository extends ReactiveMongoRepository<KronosDump, Integer>{

	//Mono<KronosDump> findByUuid(String uuid);
	Flux<KronosDump> findByCkId(Integer ckid);
	
	Flux<KronosDump> findByLastName(String lastname);
	Flux<KronosDump> findByFirstName(String firstname);
	//Flux<KronosDump> findByP_Bubdep(String subdep);
	
}
