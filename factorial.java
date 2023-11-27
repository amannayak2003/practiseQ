import java.util.ArrayList;

public class factorial {
    public static void fact(int arr[]){
        ArrayList<Integer> list  = new ArrayList<>();
        for(int i = 0 ;i<arr.length;i++){
            int curr = arr[i];
            int sum = 1 ;
            while(curr>0){
                sum = sum*curr
                curr--;
            }
            list.add(sum);
        }
    }
}
