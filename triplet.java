import java.util.Arrays;

public class triplet {
    public static int triplet(int arr[],int n){
        Arrays.sort(arr);
            
        for(int i = 0 ; i<n;i++){
            int l = i+1;
            int r = n-1;

            while(l<r){
                int sum = arr[i]+arr[l]+arr[r];
                if(sum==0){
                    return 1;
                }
                else if(arr[i]+arr[l]+arr[r]>0){
                    r--;
                }
                else{
                    l++;
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int arr[] = {0, -1, 2, -3, 1};
        System.out.println(triplet(arr, 5));
    }
}
