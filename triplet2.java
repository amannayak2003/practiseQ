import java.util.Arrays;

public class triplet2 {
    public static int triplet(int arr[],int k ){
        Arrays.sort(arr);
        int n = arr.length;
        for(int i = 0 ; i<n;i++){
            int l = i+1;
            int r = n-1;

            while(l<r){
                int sum = arr[i]+arr[l]+arr[r];
                if(sum==k){
                    return 1;
                }
                else if(arr[i]+arr[l]+arr[r]>k){
                    r--;
                }
                else{
                    l++;
                }
            }
        }
        return 0;
    }

}

