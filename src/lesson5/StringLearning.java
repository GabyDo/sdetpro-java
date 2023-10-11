package lesson5;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringLearning {
    public static void main(String[] args) {
        String teo = "Teo"; //literal ways , bo vao java heap
        String ti = new String("Ti");
        // so sanh == la so sanh gia tri, cung gia tri o nho.
        // so sanh

        System.out.println(teo == "Teo");
        System.out.println(ti == "Ti");
        System.out.println(ti.equals("Ti"));

// Char
        String withNumberStr = "ah15 $%#@";
        char[] charArr = withNumberStr.toCharArray(); // cat tung character o trong string qua  a,h,d,f,b,k,k
        for (char character : charArr) {
            if (Character.isDigit(character)) {
                System.out.println(character + " is a digit");
            }

            if (Character.isLetter(character)) {
                System.out.println(character + " is a letter");
            }

            if (Character.isSpaceChar(character)) {
                System.out.println(character + " is a SPACE");
            }
        }
//Imurtable khong thay doi duoc noi dung
        // xu ly tren string copy ra chuoi moi roi moi xu ly chu khong

//Trim : tia 2 ben dau
        //SubStrim, index of, split

        String url = "https://goole.com";
        System.out.println(url.substring(0,5)); // 5: exclusive.
        System.out.println(url.substring(5)); // lay tu index so 5 toi cuoi chuoi.

        System.out.println(url.indexOf("w")); // -1: khong co trong chuoi
        System.out.println(url.indexOf("https:")); // 0

        System.out.println(Arrays.toString(url.split(""))); // tra ve array cua tring o ben trong
        System.out.println(Arrays.toString(url.split("oo"))); // tra ve array cua tring o ben trong

//concat


        //Regular expression | Regex
        String cookingTimeStr = "105 mins";
        //[]  tat ca,
        //^khong phai tu 0-9 (^0-9) thi thay the bang ""
        String cookingTimeNumStr = cookingTimeStr.replaceAll("[^0-9]", "") ;
        //tu Aa dn Za
        String cookingTimeNumStr1 = cookingTimeStr.replaceAll("[^Aa -Zz]", "") ;


       int cookingNumber  = Integer.parseInt(cookingTimeStr); // dung de doi tu string qua int



    }
}
