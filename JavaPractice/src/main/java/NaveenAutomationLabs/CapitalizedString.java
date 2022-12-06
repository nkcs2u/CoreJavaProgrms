package NaveenAutomationLabs;

public class CapitalizedString {
    /*
    Method-1:
    String str = "AaaBbbCcc";
    int count =0;

    for(int i=0; i<str.length(); i++){
        if(str.charAt(i) >= 'A' && str.charAt(i) <='Z'){
            count++;
        }
    }

    //method 2
    ascii value between 65 and 90
    str.charAt(i) >= 65 && str.charAt(i) <= 90


    // method 3
    Character.isUppercase(str.charAt(i))

    //method 4
    str.chars().filter(e -> e>= 65 && e<=90).count();

    stream with Character.isUppercase()

    //regexp
    String reg = "[A-Z]";
    Pattern pattern = Pattern.compile(reg);
    Matcher match = pattern.matcher(str);

    while(match.find()){
        count = count+1;
    }
     */
}
