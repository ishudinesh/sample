package org.abstrac;

public class employeeDetails extends employee{

	@Override
	void employeeAddress() {
		System.out.println("employee Address: tirupur");
	}
@Override
public void employeeID() {
	System.out.println("employeeID :12345");
}
public static void main(String[] args) {
	//object creation
	employeeDetails e = new employeeDetails();
	e.employeeAddress();
	e.employeeID();
	
}
}
