package NaveenAutomationLabs;

public class StringContainsOnlyNumeric {
    public static boolean isEmpty(CharSequence cs){
        return cs == null || cs.length()==0 ;
    }

    // method - 1
    public static boolean isNumeric(CharSequence cs){
        if(isEmpty(cs)){
            return false;
        }

        int len = cs.length();
        for(int i=0; i<len ; i++){
            if(!Character.isDigit(cs.charAt(i))){
                return false;
            }
        }
        return true;
}
    public static void main(String[] args){
        System.out.println(isNumeric("123"));

        // regular expression - method 02
        String str = "123";
        System.out.println(str.matches("[0-9]"));
    }
}
