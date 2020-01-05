import java.util.Scanner;
import java.util.Arrays;

public class Numrev{
	public static void main (String[] args){
       
	System.out.println("Enter a number");
	Scanner input = new Scanner(System.in);
	int inputNum = input.nextInt();


       	int info = (int)Math.log10(inputNum) + 1;
	int[] arr = new int[info];
	int power = info;
	   
	   
	int reduced = inputNum;
	   
	   for (int i = 0; i < info; i++){
	       
	       arr[i] = reduced / (int)Math.pow(10, power - 1);
	   
	       reduced = reduced - arr[i] * (int)Math.pow(10, power - 1);
	       
	       power = power - 1;
	       
	   }
	   
	int output = 0;
	   
	for (int i = 0; i < arr.length; i++) { 
        
        output = output + (arr[i] * (int)Math.pow(10 , i));  
            
        }
	   
	System.out.println("Reversed Number = " + output);
	
	}

	
}

