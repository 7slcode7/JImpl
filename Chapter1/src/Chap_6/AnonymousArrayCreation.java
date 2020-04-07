package Chap_6;

public class AnonymousArrayCreation {
    private static void arrayPrint(int arr[]){
        for(int i : arr){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        arrayPrint(new int[] {1,2,3,4,5,6,7,8});
    }
}
