import java.util.Collection;
import java.util.Collections;

public class smallestpositivemissingno {
    public static int small(int arr[],int n){
        for(int i = 0 ;i<n;i++){
            while(arr[i]>0&&arr[i]<n+1&&arr[i]!=arr[arr[i]-1]){
                
                int temp = arr[arr[i] - 1];
                arr[arr[i] - 1] = arr[i];
                arr[i] = temp;
            }
        }
        for(int i = 0 ; i<n;i++){
            if(arr[i]!=i+1){
                return i+1;
            }
        }
        return n+1;
    }
    public static void main(String[] args) {
        int arr[] = {0,-10,1,3,-20};
        System.out.println(small(arr, 5));
    }
}
