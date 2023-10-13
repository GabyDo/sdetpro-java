package lab_06;

public class Lab6_4 {
    public static void main(String[] args) {
        /**
         String url = "https://google.com";
         Check http OR https; domain name, .com OR .net

         http hay https nam truoc dau :
         .com hay .net dem tu duoi len
         */
        String url = "https://google.com";
        System.out.println(url.indexOf(":"));
        System.out.println( "protocol is " + url.substring(0,url.indexOf(":")));
        System.out.println("domain is " + url.substring(url.indexOf("//") +2, url.indexOf(".")));
        System.out.println("last element is " + url.substring(url.indexOf(".")));

    }
}
