package NaveenAutomationLabs;

import java.net.MalformedURLException;
import java.net.URL;

public class DomainIPCompare {

    public static void main(String[] args) throws MalformedURLException {
        // abc.com 122.36.76.84
        // get the ip address of website
        String ip = "";
        String domain = "";

        boolean flag = new URL("https://domain").equals("http://ip");
    }
}
