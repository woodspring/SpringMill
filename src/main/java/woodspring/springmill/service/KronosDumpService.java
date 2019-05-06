package woodspring.springmill.service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import woodspring.springmill.model.KronosDump;

public interface KronosDumpService {
    Mono<KronosDump> createKronosDump(KronosDump kronos);

    Mono<KronosDump> updateKronosDump(KronosDump kronos, Integer kcId);

    Flux<KronosDump> findAll();

    Flux<KronosDump> findOne(Integer kcId);

    Flux<KronosDump> findByFirstname(String firstname);
    Flux<KronosDump> findByLastname(String title);

    Mono<Boolean> delete(String id);

}
