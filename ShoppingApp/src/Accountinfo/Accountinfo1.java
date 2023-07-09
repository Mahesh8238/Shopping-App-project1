package Accountinfo;

public class Accountinfo1 {
	String accontHolderName;
	long accono;
	public double bal;
	String branch;
	String ifsc;
	String bankname;
	public Accountinfo1(String accontHolderName,long accono,double bal,String branch,String ifsc,String bankname)
	{
		this.accontHolderName=accontHolderName;
		this.accono=accono;
		this.bal=bal;
		this.branch=branch;
		this.ifsc=ifsc;
		this.bankname=bankname;
	}
	public void deposit(double amt)
	{
		bal=bal+amt;
		System.out.println(amt);
	}
	public void withdraw(double amt)
    {
        if(bal>=amt)
        {
        bal=bal-amt;
    }
    }
	public void checkbal()
    {
            System.out.println("Available balance:"+bal);
    }

}
