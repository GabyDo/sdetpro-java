package lab_06;

public class Lab6_4 {
    public static void main(String[] args) {
        /**
         String url = "https://google.com";
         Check http OR https; domain name, .com OR .net

         http hay https nam truoc dau :
         .com hay .net dem tu duoi len
         *  xem cos http in ra ssle enable
         * dmain name laf goolge.com
         * this is a .com domanin
         *
         * SSL enable = true/false
         * doemain name is: google.com
         * this a .com domain
         */
        String url = "https://google.com";

        int sslEndIndex = url.indexOf(":");
        String sslString  =  url.substring(0, sslEndIndex);
        Boolean    sslEnable = sslString.equals("https") ? true : false;
        System.out.println("ssl enable is: " + sslEnable);

        int startDomainNameIndex = url.indexOf("//") +2;
        String domainName = url.substring(startDomainNameIndex) ;
        System.out.println("domain name is: " +  domainName);

        String domain = url.endsWith(".com") ? ".com" : ".net";
        System.out.println("this is a " + domain);
    }
}
