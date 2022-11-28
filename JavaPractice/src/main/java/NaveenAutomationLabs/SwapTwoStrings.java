package NaveenAutomationLabs;

public class SwapTwoStrings {
    public static void main(String[] args){
        String str1 = "aaa", str2 = "bbb";
        System.out.println(str1 + " " + str2);

        str1 = str1 + str2;
        str2 = str1.substring(0, str1.length()-str2.length());
        str1 = str1.substring(str2.length());
        System.out.println(str1 + " " + str2);

        str1 = str1 + str2;
        //bbbaaa
        //str2 = bbb
        str2 = str1.split(str2)[0];
        str1 = str1.split(str2)[1];
        System.out.println(str1 + " " + str2);
    }
}
