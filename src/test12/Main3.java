package test12;

public class Main3
{
	    public static void main(String [] args){
	        String a="";
	        String b="";
	        for(int i=2;i<=60;i++){
	            int c=0;
	            for(int j=1;j<i;j++){
	                if(i%j==0){
	                    c+=j;
	                }
	                
	                 
	            }
	            if (c==i){
	                a+=i+" ";
	            }
	            if(c>i){
	                b+=i+" ";
	            }
	        }
	        System.out.println("E: "+a+"G: 2 "+b);
	    }
}
