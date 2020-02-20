package test9;

import java.util.HashSet;

public class Main2
{

	public static void main(String[] args) {
        int n= 8;
        int m=10;
        int s=18;
 
        HashSet<Integer> arr=new HashSet<Integer>();
 
    int sum7;
     
        for(int i=0;i<=5;i++) {
            for(int j=0;j<=4;j++) {
                for(int k=0;k<=6;k++) {
                    sum7=m*i+j*n+s*k;
                    arr.add(sum7);
                }
            }
        }
        System.out.println(arr.size()-2);
    }

}
