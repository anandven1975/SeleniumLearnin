package week1.day2;

public class Fibbinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		int firstNum = 0; 
		int secNum = 1;
		int sum = 0;
		for(i=0;i<=11;i++) {
			System.out.println(sum);
			sum=firstNum+secNum;
			firstNum=secNum;
			secNum=sum;
		}
				

	}

}
