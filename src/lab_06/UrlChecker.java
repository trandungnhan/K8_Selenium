package lab_06;

/*
String url = "https://google.com";
Check http OR https; domain name, .com OR .net
* */

public class UrlChecker {

    public static void main(String[] args) {

        String url = "https://google.com";
        checkValue(url,"http");
        checkValue(url,"https");
        checkValue(url,"google");
        checkValue(url,".com");
        checkValue(url,".net");
        checkValue(url,"invalid");

    }
    public static void checkValue(String url, String value){
        if (url.contains(value)){
            System.out.printf("%s is exist in URL\n", value);
        }else{
            System.out.printf("%s is not exist in URL\n", value);
        }
    }
}
