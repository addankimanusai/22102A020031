import java.util.*;
public class sort_or_not
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        int sum=0;
        boolean res=true;
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(i>0 && arr[i-1]>=arr[i]){
                res=false;
            }
        }
        System.out.println(res);
	}
}
