package org.abstrac;

public class StudentDetails implements Student {

	@Override
	public void studentName() {
		System.out.println("Student Name : ishu");
	}

	@Override
	public void studentBloodGroup() {
		System.out.println("Student BloodGroup: o+");
	}

    public static void main(String[] args) {
		StudentDetails s = new StudentDetails();
	s.studentName();
	s.studentBloodGroup();
    }





}
