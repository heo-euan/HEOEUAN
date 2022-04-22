import java.lang.String;

public class LibraryEx002 {
    
    public static void main(String[] args) {
        String text = "Hello PASS World";
        String concat, upperCase, lowerCase, replace, subString;
        System.out.println("기본 String : " + text);
        System.out.println("기본 String 길이 : "+ text.length()); // 문자열 길이
        
        concat = text.concat(": YOUNGJIN.COM"); //문자열 연결
        upperCase = concat.toUpperCase(); 
        lowerCase = concat.toLowerCase();
        replace = upperCase.replace(':', '!');
        subString = replace.substring(6,10);
        
        System.out.println("Concat String : " + concat);
        System.out.println("UpperCase String : " + upperCase);
        System.out.println("LowerCase String : " + replace);
        System.out.println("SubString String : " + subString);
    }
}