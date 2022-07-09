package week1.day1;

public class Fibbonacci {

	public static void main(String[] args) {
		int firstNum=0;
		int secNum=1;
		int sum=0;
		for(int i=0;i<=10;i++) {
			sum=firstNum+secNum;
			System.out.println(firstNum);
			firstNum=secNum;
			secNum=sum;
			
		}
		
		// TODO Auto-generated method stub

	}

}
