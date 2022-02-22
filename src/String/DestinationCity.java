package String;

import java.util.*;

public class DestinationCity {

    public static void main(String[] args) {
        List<List<String>> list = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        list1.add("pYyNGfBYbm");
        list1.add("wxAscRuzOl");
        list.add(list1);
        list1.add("kzwEQHfwce");
        list1.add("pYyNGfBYbm");
        list.add(list1);
        System.out.println(destCity(list));
        //System.out.println("a"* 2);
    }
    public static String destCity(List<List<String>> paths) {
        Set<String> set = new HashSet<String>();
        for(int i = 0; i < paths.size(); i++) {
            paths.get(i).get(0);
        }
        String value = "";
        for(int i = 0; i < paths.size(); i++) {
            if(!set.contains(paths.get(i).get(1))) {
                value = paths.get(i).get(1);
            }
        }
        return value;
    }
}
