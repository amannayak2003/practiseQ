import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class findmissing {
    public static ArrayList<Long> missing(Long arr[],Long a[]){
        ArrayList<Long> l = new ArrayList<>();
        int n = arr.length;
        int m = a.length;
        HashSet<Long> list = new HashSet<>();
        for(int i = 0 ;i<m;i++){
            list.add(a[i]);
        }
        for(int i = 0 ; i<n;i++){
            if(!list.contains(arr[i])){
                l.add(arr[i]);
            }
        }
        return l;
    }
    public static void main(String[] args) {
        
    Long arr[] = {(long)1,(long)2,(long)3,(long)4,(long)10};
    Long a[] = {(long)2,(long)3,(long)1,(long)0,(long)5};
    System.out.println(missing(arr, a));
    }
}
