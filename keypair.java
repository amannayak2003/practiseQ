import java.util.Arrays;

public class keypair {
    public static boolean key(int arr[],int x){
        int n = arr.length;
        Arrays.sort(arr);
        int l = 0 ; 
        int r = n-1;
        while(l<r){
            int sum = arr[l]+arr[r];
            if(sum==x){
                return true;
            }
            else if(sum>x){
                r--;
            }
            else{
                l++;
            }
        }
        return false;
    }
}
