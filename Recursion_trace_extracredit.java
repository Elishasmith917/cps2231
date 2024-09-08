package chapter_18_Recursion_4_9_2024;

public class Recursion_trace_extracredit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumofDigits(1234));
	}
	public static int sumofDigits(int number) { 
		if (number==0)
			return 1;
			else
				 return number % 10 + sumofDigits ( number / 10);

	}

}
