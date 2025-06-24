import java.util.*;
public class sum_of_two_arr
{
	public static void main(String[] args) {
		int[] arr1 = new int[5];
		int[] arr2 = new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++){
		    arr1[i]=sc.nextInt();
		}
		for(int i=0;i<5;i++){
		    arr2[i]=sc.nextInt();
		}
		int[] arr = new int[5];
		for(int i=0;i<5;i++){
		    arr[i]=arr1[i]+arr2[i];
		    System.out.print(arr[i]+" ");
		}
	}
}
