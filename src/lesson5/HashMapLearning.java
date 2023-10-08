package lesson5;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapLearning {
    public static void main(String[] args) {
        //CRU(replace)D( remove)
        Map<Integer, String> emergencyList = new HashMap<>(); //diamond syntax , co 2 cai ngoacj ngon nhu kim cuong
        emergencyList.put(113, "CSCO");
        emergencyList.put(114, "Cuu hoa");
        emergencyList.put(115, "Cap cuu");
        emergencyList.put(116, "others");
        emergencyList.put(116, "ABC"); // dulicate key, value in ra se la gia tri moi. Add trung key se replace gia tri cu.

        System.out.println(emergencyList.get(113)); // boxing Interget.valueof(113) java tu chuyen doi sang wrapper type

        Set<Integer> allKeys = emergencyList.keySet();
        for (int key : allKeys) {
            System.out.println(emergencyList.get(key));
        }

        //If value is others, change to "SomeThing"
        for (int key : allKeys) {
            String value =  emergencyList.get(key);
            if(value.equals("others")){
//                emergencyList.put(key, "Something");
                emergencyList.replace(key, "Something");
            }
        }

        //If value is Something, change to "Others"
        emergencyList.replace(116, "Something","Others");

        emergencyList.remove(116, "ABC"); // khong remove vi khong dung gia tri

        //remove entry that has value something else
        for (int key : allKeys) {
            String value =  emergencyList.get(key);
            if(value.equals("Something")){
                emergencyList.remove(key);
            }
        }

        System.out.println("117 is existing" + emergencyList.containsKey(117));
        System.out.println("114 is existing" + emergencyList.containsKey(114));
        System.out.println("118 is existing" + emergencyList.containsKey(118));
        System.out.println("something is existing" + emergencyList.containsValue("Something"));
        System.out.println("cuu hoa is existing" + emergencyList.containsKey("Cuu hoa"));

        /**
         * menu item (String)- Sub-menu(K):text, hyperlink
         * file{
         *     New:{
         *         text: "New"
         *         hyperlink: "https://"
         *     }
         * }
         */
    }
}
