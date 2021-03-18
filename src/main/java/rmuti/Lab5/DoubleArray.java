package rmuti.Lab5;

import java.util.Arrays;

public class DoubleArray {
    public static int [] copyArray(int arr[])
    {
        int[] aws = new int[arr.length*2];
        for(char i = 0 ; i<arr.length;i++)
        {
            aws[i]=arr[i];
            aws[i+arr.length]=0;
        }

        System.out.println(Arrays.toString(aws));
        return aws;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        copyArray(arr);
    }
}
