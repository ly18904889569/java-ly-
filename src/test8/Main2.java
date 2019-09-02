package test8;

public class Main2{
 
public static boolean check(int i) {
        char[] arr=String.valueOf(i*i).toCharArray();
             int t=0;
             for(int j=arr.length-1;j>=arr.length/2;j--) {
                 if(arr[j]!=arr[t]) return false;
                 t++;
             }
        return true;
    }
     public static void main(String[] args) {
         for(int i=1;i<4;i++) {
             System.out.println(i);
         }
         for(int i=11;i<256;i++) {
             if(check(i)) System.out.println(i);
             }
         }
}
