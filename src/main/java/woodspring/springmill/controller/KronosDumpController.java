package woodspring.springmill.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import woodspring.springmill.model.KronosDump;
import woodspring.springmill.service.KronosDumpService;

@Slf4j
@RestController
@RequestMapping("/kronos")
public class KronosDumpController {
	
	@Autowired
	KronosDumpService kronosService;

	
	
    @GetMapping("/list")
    public Flux<KronosDump> findAll() {
        log.debug("find All KronoseDump");
        return kronosService.findAll();
    }

    @GetMapping("/findByLastname/{lastname}")
    public Flux<KronosDump> findByLastname(@PathVariable String lastname) {
//    	public Flux<KronosDump> findByTitle(@RequestParam String lastname) {
        log.debug("findByTitle KronosDump with KronosDumpTitle : {}", lastname);
        return kronosService.findByLastname(lastname);
    }

    @GetMapping("/find/{kcId}")
    public Flux<KronosDump> findOne(@PathVariable Integer kcId) {
        log.debug("findOne KronosDump with kcId : {}", kcId);
        return kronosService.findOne(kcId);
    }

    @PostMapping
   // @ResponseStatus(HttpStatus.CREATED)
    public Mono<KronosDump> create(@RequestBody KronosDump KronosDump) {
        log.debug("create KronosDump with KronosDump : {}", KronosDump);
        return kronosService.createKronosDump(KronosDump);
    }

}
