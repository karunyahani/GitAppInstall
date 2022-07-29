package DataType;

public class DataTypeCls {
private void dataType() {
	byte age=6;
	System.out.println("Hanisha age is "+age);
			
	short passcode=2416;
	System.out.println("Hanisha passcode is "+passcode);
	
	int DOB=24012016;
	System.out.println("Hanisha DOB is "+DOB);
	
	long Mobileno=9788504168l;
	System.out.println("Hanisha mobile number is "+Mobileno);
	
	float Schoolfees=76452;
	System.out.println("Hanisha School fees is "+Schoolfees);
	
	double AdmissionFee=15000;
	System.out.println("Hanisha admission fee is "+AdmissionFee);
	
	char section='B';
    System.out.println("Hanisha studting in Grade II section "+section);
	
    String Schoolname="Velammal New Gen School";
    System.out.println("Hanisha school name is "+Schoolname);
	
    boolean Available=true;
    System.out.println("Hanisha available status "+Available);
}
public static void main(String[] args) {
	DataTypeCls dtc=new DataTypeCls();
	dtc.dataType();
}
}
