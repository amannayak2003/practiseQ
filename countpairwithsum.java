import java.util.HashMap;

public class countpairwithsum {
    public static int count(int arr[],int k){
        int ans = 0 ;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<arr.length;i++){

            int b = k-arr[i];
            if(map.containsKey(b)){
                ans+=map.get(b);
            }

            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }
            else{
                map.put(arr[i], 1);
            }
            
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,1,1};
        System.out.println(count(arr, 2));
    }
}
