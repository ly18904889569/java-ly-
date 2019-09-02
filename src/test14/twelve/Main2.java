package test14.twelve;

import java.util.*;
public class Main2{
    public static void main(String[] args)
        {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        String res=reverse(str);
        System.out.println(res);
    }
    public static String reverse(String str)
        {
    	//屌屌，用spilt进行切分，然后在用StringBuffer进行拼接
        String[] s=str.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=s.length-1;i>0;i--)
            {
            sb.append(s[i]);
            sb.append(" ");
        }
        sb.append(s[0]);
        //最后注意输出的是toString
        return sb.toString();
    }
}
