package A_april.Arrays;

public class array2 {
    public static void main(String[] args) {

        //WAPTF sum of even and odd number in an array.
        int[] a={1,2,3,4,5,6,7,8,9};
        int l=a.length;
        int evensum=0;
        int oddsum=0;
        for (int i=0;i<l;i++){
            if (a[i]%2==0){
                evensum+=a[i];
            }else {
                oddsum+=a[i];
            }
        }
        System.out.println("even sum ->"+evensum);
        System.out.println("odd sum ->"+oddsum);
    }
}
