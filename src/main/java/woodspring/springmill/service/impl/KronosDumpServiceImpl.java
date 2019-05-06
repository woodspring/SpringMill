package woodspring.springmill.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import woodspring.springmill.model.KronosDump;
import woodspring.springmill.repository.KronosDumpRepository;
import woodspring.springmill.service.KronosDumpService;

@Service
public class KronosDumpServiceImpl implements KronosDumpService {
	
	@Autowired
	KronosDumpRepository kronosRepos;

	@Override
	public Mono<KronosDump> createKronosDump(KronosDump kronos) {
		return kronosRepos.insert(kronos);
	}

	@Override
	public Mono<KronosDump> updateKronosDump(KronosDump kronos, Integer kcId) {
		Mono<KronosDump> kDump = kronosRepos.insert(kronos);
		//if (kronosRepos.existsById(kcId). != null) { 
		//} else {
		//	
		//}
		return kDump;
	}

	@Override
	public Flux<KronosDump> findAll() {
		Flux<KronosDump> retKDump = kronosRepos.findAll();
		return retKDump;
	}

	@Override
	public Flux<KronosDump> findOne(Integer kcId) {
		Flux<KronosDump> retKDump = kronosRepos.findByCkId(kcId);
		return retKDump;
	}

	@Override
	public Flux<KronosDump> findByFirstname(String firstname) {
		Flux<KronosDump> retKDump = kronosRepos.findByFirstName(firstname);
		return retKDump;
	}

	@Override
	public Flux<KronosDump> findByLastname(String lastname) {
		Flux<KronosDump> retKDump = kronosRepos.findByLastName(lastname);
		return retKDump;
	}

	@Override
	public Mono<Boolean> delete(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
