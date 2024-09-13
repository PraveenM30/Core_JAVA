package A_april.Arrays;

public class array3 {
    public static void main(String[] args) {

        //WAPTF largest among the given array.

        int[] a={1,2,3,4,5,6,7,8,9};
        int max=a[0];

        for (int i=0;i<a.length;i++){
            if(max>a[i]){
                continue;
            }else {
                max=a[i];
            }
        }
        System.out.println( max+ " is the greatest num in the given array");
    }
}
