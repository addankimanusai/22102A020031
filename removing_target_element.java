import java.util.*;
public class removing_target_element
{
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int trg=sc.nextInt();
        for (int i=0;i<n;i++){
            if(arr[i]!=trg){
                System.out.print(arr[i]+" ");
            }
        }
	}
}
