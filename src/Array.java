package src;

public class Array {
    public static void fibonaci(int n){
        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 1;
        for(int  i = 2 ; i < n;i++){
            arr[i] = arr[i-1]+ arr[i-2];
        }
        for(int i = 0 ; i < n ;i++){
            System.out.println(arr[i]);
        }
    }
    public static boolean check(int[] arr,int n){
        for(int i = 0 ; i < arr.length;i++){
            if(arr[i] == n) return false;
        }
        return true;
    }
    public static void sort(int[] arr){
        int[] cnt = new int[10000000];
        for(int i = 0 ; i < arr.length;i++){
            cnt[arr[i]]++;
        }
//        for(int i = 0 ; i < cnt.length;i++){
//            if(cnt[i] != 0){
//                System.out.println("so lan xuat hien cua "+i+" la "+ cnt[i]);
//            }
//        }
        for(int i = 0; i  < arr.length;i++){
            for(int j = i ; j < arr.length;j++ ){
                if(cnt[arr[i]] == cnt[arr[j]] && arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[i] = temp;
                }
                else if(cnt[arr[i]] < cnt[arr[j]] ){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
