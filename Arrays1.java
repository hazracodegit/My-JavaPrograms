// java program to find the sum of the array elemnts
import java.util.*;
public class Arrays1{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int[] arr=new int[n];
	for(int i=0;i<n;i++){
	    arr[i]=sc.nextInt();
	}
	int sum=0;
	for(int i=0;i<arr.length;i++){
	    sum=sum+arr[i];
	}
	System.out.print("The sum of array elements is : "+sum);
	}
}


/*        Input n=5
          10 20 30 40 50
          Output :
           The sum of array elements is : 150

  */
