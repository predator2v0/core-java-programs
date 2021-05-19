package networking;

import java.net.InetAddress;
import java.net.URL;

public class Networking {
    public static void main(String[] args) throws Exception{
//        InetAddress class Example
        InetAddress address1 = InetAddress.getLocalHost();
        System.out.println(address1);
        InetAddress address2 = InetAddress.getByName("www.google.com");
        System.out.println(address2);
        InetAddress[] address3 = InetAddress.getAllByName("www.facebook.com");
        for(int i = 0; i<address3.length;i++){
            System.out.println(address3[i]);
        }
//        URL class Example
        URL url = new URL("https://www.predator2v0.github.io:8080/myportfolio");
        System.out.println(url.getProtocol());
        System.out.println(url.getHost());
        System.out.println(url.getPort());
        System.out.println(url.getFile());

    }
}
