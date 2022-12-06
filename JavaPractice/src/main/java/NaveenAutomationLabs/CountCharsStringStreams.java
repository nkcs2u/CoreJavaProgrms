package NaveenAutomationLabs;

public class CountCharsStringStreams {

    public static void main(String[] args){
        String str = "abcdeaacdfgh";
        getCharCount(str, 'a');

    }

    public static void getCharCount(String str , char c){
        long count = str.chars().filter(e -> (char) e == c).count();
        System.out.println(count);
    }
}
