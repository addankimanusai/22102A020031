import java.util.*;
public class reverse_arr
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n=sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		int[] rev = new int[n];
		int j=n-1;
		for(int i=0;i<n;i++){
		    rev[i]=arr[j];
		    j--;
		}
		for(int i=0;i<n;i++){
		   System.out.print(rev[i]+" ");
		}
	}
}
