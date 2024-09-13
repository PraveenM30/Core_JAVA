package JAVA.Arrays;

public class dummy {
    public static void main (String[] args) {
        int a[]={3,4,5,7,8};
        int max=0;
        for (int i=0;i<a.length ;i++ ){
            if (a[i]>max){
                max=a[i];
            }
        }
        System.out.println(max);
    }
}
