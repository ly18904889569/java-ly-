package test14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class Main4
{

	public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        while((line = bf.readLine()) != null) {
            String[] arr = line.split(" ");
            Map<String,Integer> map = new TreeMap<String,Integer>();
            for(int i = 0;i < arr.length;i++) {
                char ch = arr[i].charAt(arr[i].length() - 1);
                if(ch == '.' || ch == ',') {
                    arr[i] = arr[i].substring(0,arr[i].length() - 1);
                }
                arr[i] = arr[i].toLowerCase();
                if(!map.containsKey(arr[i])) {
                    map.put(arr[i], 1);
                }else {
                    map.put(arr[i], map.get(arr[i]) + 1);
                }
            }
            for(Map.Entry<String, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + ":" + entry.getValue());
            }
        }
    }

}
