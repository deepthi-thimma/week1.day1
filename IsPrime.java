package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		int num=20;
		int noOfFactors=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				noOfFactors+=1;
			}
			
		}
		if(noOfFactors==2) {
			System.out.println(num+ " is a prime number");
		}
		else {
			System.out.println(num+ " is not a prime number");
		}
		
		// TODO Auto-generated method stub

	}

}
