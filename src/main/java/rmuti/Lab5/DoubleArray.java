package rmuti.Lab5;

public class DoubleArray {
    public static int[] copyArray(int[] arr){
    int[] aws = new int[arr.length * 2 ];
    for (char i=0;i<arr.length;i++){  // ให้ i=0 ; ถ้า i น้อยกว่า ความยาวตำแหน่ง ; i++(เลื่อนตำแหน่ง array)
        aws[i] =arr[i]; // เรียกตำแหน่ง
        aws[i+arr.length] = 0;  //ให้ตำแหน่งนั้น = 0
    }
    for (int a=0;a<aws.length;a++){
    System.out.print(aws[a]);
        System.out.printf(",");
    }
    return aws;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        copyArray(arr);
    }
}
