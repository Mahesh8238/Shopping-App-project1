package MainApp;

import Accountinfo.Accountinfo1;
import Debit_card.Debit_Card;
import shoppings12.Shoppings12;

public class Mainshoppings {

	public static void main(String[] args) {
	Accountinfo1 a1=new Accountinfo1("mahesh",1234567l,3000,"basavangudi","SBI0056","SBI");
	Debit_Card  d1=new Debit_Card(1234,753,"31/12/2020",a1);
	d1.generatepin(5627);
	d1.onlinepayment(6000,1234);
	d1.onlinepayment(1000,5627);
	Shoppings12 s1=new Shoppings12("sumsang",1500,"bat and bowl");
	s1.selectproduct("nokia",15000.0,"stock");
	s1.selectproduct("sumsang",15000,"stock1");

	}

}
