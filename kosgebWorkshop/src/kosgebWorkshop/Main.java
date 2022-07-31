package kosgebWorkshop;

import java.time.LocalDate;

import kosgebWorkshop.entities.Application;
import kosgebWorkshop.entities.ApplicationPriority;
import kosgebWorkshop.entities.BannedList;
import kosgebWorkshop.entities.Credit;
import kosgebWorkshop.entities.CreditFeature;
import kosgebWorkshop.entities.CreditType;
import kosgebWorkshop.entities.Employee;
import kosgebWorkshop.entities.Entrepreneur;
import kosgebWorkshop.entities.Feature;
import kosgebWorkshop.entities.IndividualEntrepreneur;
import kosgebWorkshop.entities.Type;

public class Main {

	public static void main(String[] args) {
		Entrepreneur entrepreneur = new IndividualEntrepreneur(1, "05453343", "mücahit@gmail", "123456", 
				         "505", 50, false, null, "Mücahit", "Altınsoy", "21219929");
		
		Type type1 = new Type(1, "Banka Çalışanı", 0);
		Type type2= new Type(2, "Kosgeb Çalışanı", 0);
		Type type3 = new Type(3, "Finans Çalışanı", 0);
	
		Type type4 = new Type(4, "Bankad  Şube Müdürü",1);
		Employee employee = new Employee("Ferhat", "Çelik", "Keçiören", null);
		
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
		
		System.out.println(((IndividualEntrepreneur)entrepreneur).getFirstName()+" "+application.getId()+ "  " +
		application.getApplicationDate()+" "+application.getApplicationPriority().getApplicationPriorityName()+"  "+
		employee.getFirstName());
	}

}
