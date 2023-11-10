import java.util.HashMap;

public class largestsubarray {
    int maxLen(int arr[], int n)
    {   HashMap<Integer,Integer> map = new HashMap<>();
        int max = 0;
        int sum = 0 ;
        map.put(0,-1);
        for(int i = 0 ; i<arr.length;i++){
            sum+= arr[i];
            if(map.containsKey(sum)){
                int len = i-map.get(sum);
                max = Math.max(max, len);
            }
            else{
                map.put(sum, i);
            }

        }
        return max;
    }
}
