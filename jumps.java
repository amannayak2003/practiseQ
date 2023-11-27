public class jumps {
    public static int jump(int arr[]){
        int n = arr.length;
        int jump = 0; 
        int curr = 0 ;int far = 0;
        for(int i = 0 ; i<n;i++){
            far = Math.max(far, arr[i]+i);
            if(i==curr){
                curr = far     ;
                jump++;
            }
        }

        return jump;


    }
    public static void main(String[] args) {
        int arr[] = {3,4,5,2,3,1,4,2};
        System.out.println(jump(arr));

    }
}
