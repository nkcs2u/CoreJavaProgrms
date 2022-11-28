package NaveenAutomationLabs;

import java.util.Optional;

public class OptionalClass {
    public static void main(String[] args){
        String[] str = new String[4];
        Optional<String> isNull = Optional.ofNullable(str[2]);

        if(isNull.isPresent()){
            // do when some value
        }else {
            // do when none
        }

    }
}
