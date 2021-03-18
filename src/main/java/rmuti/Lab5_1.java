package rmuti;

import java.util.Arrays;

public class Lab5_1 { //DoubleArray
    public static int[] copyArray(int arr[]){
        int[] aws= new int[arr.length*2];  // array copy address 0,0,0,0,0,0
        for (int i = 0  ;i<arr.length; i++) { // for loop copy array value p2p
            aws[i] = arr[i]; // copy address value
            aws[i + arr.length] = 0; // i+ความยาว arr เพื่อ ใส่ 0
        }
        System.out.println(Arrays.toString(aws));
        return aws;
    }

    public static void main(String[] args) {
        int[] arr={1,2,4,7,4,2};
        copyArray(arr);
    }
}
