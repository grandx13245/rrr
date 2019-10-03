package LN.knu.edu.tw;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Main {
    public static void main(String[] args) {
        // iuyoiyoiy
        String HOST = "tw.yahoo.com";
        String IP = "124.108.103.103";

        try {
            InetAddress addr = InetAddress.getByName(HOST);
            String ip = addr.getHostAddress();
            System.out.println("ip: " + ip);
        }catch (UnknownHostException e){
        }
    }
}
