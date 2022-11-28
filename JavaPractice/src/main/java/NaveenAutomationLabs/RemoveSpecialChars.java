package NaveenAutomationLabs;

public class RemoveSpecialChars {
    public static void main(String[] args){
        String name = "aabcv%^h*m";
        name = name.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(name);
    }
}
