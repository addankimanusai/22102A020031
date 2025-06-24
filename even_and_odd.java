import java.util.*;
public class even_and_odd{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        int even=0;
        int odd=0;
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]%2==0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("even "+even+" odd "+odd);
    }
}
