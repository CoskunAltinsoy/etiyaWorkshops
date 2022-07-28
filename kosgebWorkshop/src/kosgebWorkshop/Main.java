package kosgebWorkshop;

import java.time.LocalDate;

import kosgebWorkshop.entities.Application;
import kosgebWorkshop.entities.ApplicationPriority;
import kosgebWorkshop.entities.BannedList;
import kosgebWorkshop.entities.Credit;
import kosgebWorkshop.entities.CreditFeature;
import kosgebWorkshop.entities.CreditType;
import kosgebWorkshop.entities.Entrepreneur;
import kosgebWorkshop.entities.Feature;
import kosgebWorkshop.entities.IndividualEntrepreneur;

public class Main {

	public static void main(String[] args) {
		Entrepreneur entrepreneur = new IndividualEntrepreneur(1, "05453343", "mücahit@gmail", "123456", 
				         "505", 50, false, null, "Mücahit", "Altınsoy", "21219929");
		
		BannedList bannedList = new BannedList(1, entrepreneur);
		
		entrepreneur.setBannedList(bannedList);
		
		Credit credit = new Credit(1, "Erzurum Kredisi", LocalDate.parse("2022-01-01"), LocalDate.parse("2022-01-01"), null);
		CreditType creditType = new CreditType(1, "Girişimci Kredisi");
		credit.setCreditType(creditType);
		
		Feature feature = new Feature(1, "alt limit");
		CreditFeature creditFeature = new CreditFeature(1, credit, feature, "50");
		ApplicationPriority applicationPriority = new ApplicationPriority(1, "Asil");
		Application application = new Application(1, false, LocalDate.parse("2022-01-01"), entrepreneur, 
				credit, applicationPriority);
		
		System.out.println(((IndividualEntrepreneur)entrepreneur).getFirstName()+" "+application.getId()+ "  " + application.getApplicationDate()+" "+application.getApplicationPriority().getApplicationPriorityName() );
	}

}
