package org.inheritance;

public class Education extends Medical{
	public void UG() {
	System.out.println("under graduate");
}
private void PG() {
	System.out.println("post graduate");
}
public static void main(String[] args) {
	Education e = new Education();
	e.Bsc();
	e.Bed();
	e.Ba();
	e.bba();
	e.BE();
	e.BTech();
	e.physio();
	e.Dental();
	e.MBBS();
	e.UG();
	e.PG();
}
}
