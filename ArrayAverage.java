// java program to calculate average of array elements
import java.util.*;
public class ArrayAverage{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
      float avg=0.0f;
      float sum=0.0f;
      for(int i=0;i<n;i++){
        sum=sum+arr[i];
      }
      avg=sum/arr.length;
      System.out.print(avg);
    }
  }


/* Input :  n=5
      10 20 30 40 50
     Output : 150.0

  */
  
