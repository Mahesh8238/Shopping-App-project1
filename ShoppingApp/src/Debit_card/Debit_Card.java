package Debit_card;

import java.util.Random;

import Accountinfo.Accountinfo1;

public class Debit_Card {
private int pinnumber;
private int cvv;
private String expdate;
Accountinfo1 a1;
public Debit_Card(int pinnuber,int cvv,String expdate,Accountinfo1 a1)
{
	this.pinnumber=pinnumber;
	this.cvv=cvv;
	this.expdate=expdate;
	this.a1=a1;
}
public int getgenatepin()
{
	return pinnumber;
}
public void setpinnumber(int pinnumer)
{
	this.pinnumber=pinnumber;
}
public int getgenatecvv()
{
	return cvv;
}
public void setcvv(int cvv)
{
	this.cvv=cvv;
}
public String getgenateexpdate()
{
	return expdate;
}
public void setexpdate(String expdate)
{
	this.expdate=expdate;
}
public void generatepin(int pinnumber)
{
	setpinnumber(pinnumber);
	Random r=new Random();
	int pinnumber1=r.nextInt(1000,9999);
	setpinnumber(pinnumber1);
	System.out.println("new-pin:"+pinnumber1);
}
public void updatedetails(int cvv,String expdate)
{
	System.out.println(cvv);
	System.out.println(expdate);
}
public Debit_Card()
{
	
}
public void onlinepayment(double productamt,int pin)
{
	if(getgenatepin()==pinnumber)
	{
		if(productamt<a1.bal)
		{
			a1.bal=a1.bal-productamt;
			System.out.println("payment successful and orderplaced");
			a1.checkbal();
		}
		else
		{
			System.out.println("insuffient bal");
		}
	}
	else
	{
	System.out.println("invalid pinnumber");
}
}
}