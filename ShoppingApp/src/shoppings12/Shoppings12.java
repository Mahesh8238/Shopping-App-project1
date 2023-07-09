package shoppings12;

//import Accountinfo.Accountinfo1;
import Debit_card.Debit_Card;
public class Shoppings12 extends Debit_Card {
	String productname;
	double productprice;
	String shippingaddress;
	public Shoppings12(String productname,double productprice,String shippingaddress)
	{
		this.productname=productname;
		this.productprice=productprice;
		this.shippingaddress=shippingaddress;
		
	}
	public void selectproduct(String pn,double pp,String sa)
	{
		if(pn==productname && pp==productprice && sa==shippingaddress)
		{
			System.out.println("buy now");
		}
		else
		{
			System.out.println(pn+"is out of stock");
		 }
		
	}
	

}
