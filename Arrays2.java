// java program to calculate the number of elements greater than the given element
import java.util.*;
public class Arrays2{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    int x=sc.nextInt();
    int count=0;
    for(int i=0;i<n;i++){
      if (arr[i]>x){
        count++;
      }
    }
    System.out.print(count);
  }
}

/* Input :
n=5
  10 20 30 40 50
  x=40
  Output :
1
  */
