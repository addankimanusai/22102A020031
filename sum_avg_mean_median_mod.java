import java.util.*;
public class sum_avg_mean_median_mod{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        int sum=0;
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        int med=0;
        if(n%2==0){
            med=(arr[n/2]+arr[(n/2)+1])/2;
        }else{
            med=arr[n/2];
        }
        double avg=sum/n;
        System.out.print("sum: "+sum+" avg: "+avg+" Mean: "+avg+" Median: "+med);
        Arrays.sort(arr);
        System.out.print(" Mod: ");
        for(int i=1;i<n;i++){
            if(arr[i-1]==arr[i]){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
