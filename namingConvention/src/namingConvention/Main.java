package namingConvention;

public class Main {

	public static void main(String[] args) {
		

	}

}

public interface EmployeeService{// class için geçerli olanlar interface'ler içinde geçerlidir.
	public void add();
}

public class Employee implements EmployeeService{// Pascal case olmalıdır. Dahili class isimleri verilmemelidir. Kısaltmalar kullanılmamalıdır.
	
	private int id;//değişken isimleri camel casedir.&, $, _ karakterlei ile başlamamalıdır. Sayısal ifadeler değişkenin başında kullanılmaz.

	static final int MIN_AGE;// Değişken ismi birden fazla ise _ ile ayrılmalıdır.
@Override
public void add() {//camel case olmalıdır.
	
	
}

//Package:camelcase olmalıdır. İsim birden fazla kelime içeriyorsa, java.util, java.lang gibi noktalarla (.) ayrılmalıdır.
}
