package cleanCode.core.adapters.concretes;

import cleanCode.core.adapters.KpsService;
import cleanCode.core.adapters.abstracts.MernisService;
import cleanCode.entities.concretes.Person;

public class MernisServiceAdapter implements MernisService {

	@Override
	public boolean checkPerson(Person person) {
		KpsService kpsService= new KpsService();
	    return 	kpsService.checkPerson(person.getNationalId(), person.getFirstName(), person.getLastName(), person.getYearOfBirth());
		
	}

}
