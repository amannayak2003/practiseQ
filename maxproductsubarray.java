public class maxproductsubarray {

    public static int max(int arr[],int n){
        int ans=arr[0];
        int ma=ans;
        int mi=ans;
        for(int i = 1 ;i<n;i++){
            if(arr[i]>0){
                ma = Math.max(arr[i],ma*arr[i]);
                mi=Math.min(arr[i],mi*arr[i]);
            }
            else{
                int temp = ma;
                ma = mi;
                mi=temp;

                ma = Math.max(arr[i],ma*arr[i]);
                mi=Math.min(arr[i],mi*arr[i]);
            }
            ans = Math.max(ans, Math.max(ma,mi));
            
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, -1, 0};
        System.out.println(max(arr, 6));
    }
}