// java program to calculate the sum of odd array elements
import java.util.*;
public class OddSum{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    int sum=0;
    for(int i=0;i<n;i++){
      if (arr[i]%2!=0)
        sum=sum+arr[i];
    }
    System.out.print("The sum of Odd array elements is :"+ sum);
  }
}

/* Input : n=5
  1 2 3 4 5
  Output :
The sum of Odd array elements is : 9
  */
  
