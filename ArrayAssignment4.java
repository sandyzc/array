import java.util.Arrays;
import java.util.Scanner;

public class ArrayAssignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[]={25,28,15,59,7,15,3,45,17,3,78};
		
		Scanner s = new Scanner(System.in);
		
		// sort the array
		Arrays.sort(num);
		//ask user to enter the number to be searched 
		System.out.println("enter the number to be searched");
		int searchval = s.nextInt();
		
		int retreiveval = Arrays.binarySearch(num, searchval);
		
		if(retreiveval>=0){
			System.out.println(" entered number is found and its position is "+retreiveval);
			
		}	
		
		
		if(retreiveval<0){
			System.out.println("Entered number not found");
		}
		
}

	}


