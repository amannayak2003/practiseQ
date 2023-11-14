import java.util.*;
public class ipl2021 {

    static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) {
        // Your code here
        ArrayList<Integer> ans = new ArrayList<>();
        int i=0,j=0;
        TreeMap<Integer,Integer> map = new TreeMap<>();
        while(j<n) {
            int ne = j-i;
            if(ne<k) {
                add(map,arr[j]);
                j++;
            } else {
                ans.add(map.lastKey());
                remove(map,arr[i]);
                i++;
            }
        }
        
        if(j-i==k) ans.add(map.lastKey());
        
        return ans;
    }
    
    public static void add(TreeMap<Integer,Integer> map,int key) {
        if(map.containsKey(key)) {
            map.put(key,map.get(key)+1);
        } else {
            map.put(key,1);
        }
    }
    
    public static void remove(TreeMap<Integer,Integer> map,int key) {
        if(map.get(key)==1) {
            map.remove(key);
        } else {
            map.put(key,map.get(key)-1);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 2 ,3 ,1, 4, 5, 2, 3, 6};
        System.out.println(max_of_subarrays(arr, 9, 3));
    }
}
