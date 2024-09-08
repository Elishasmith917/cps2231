package cps2231_Unit8_TuesdayLecture;

public class SquareTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square a = new Square ();
		Square b = new Square ("red",true,4);
		System.out.println(a.toString());
		System.out.println(b.toString());
		
		System.out.println(a.getDateCreated());

	}

}
