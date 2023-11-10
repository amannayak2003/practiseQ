import java.util.ArrayList;

public class firstlst {
    public static int first(int arr[],int x){
        int n = arr.length;
        int low = 0; 
        int high =  n-1;
        int idx = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==x){
               idx = mid;
               high = mid-1;
            }
            else if(arr[mid]>x){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return idx;
    }

    public static int last(int arr[],int x){
        int n = arr.length;
        int low = 0; 
        int high =  n-1;
        int idx = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==x){
               idx = mid;
               low = mid+1;
            }
            else if(arr[mid]>x){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return idx;
    }

    public static void ans(int arr[],int x){
        int b = last(arr, x);
        int a = first(arr, x);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(a);
        list.add(b);
    }
}
