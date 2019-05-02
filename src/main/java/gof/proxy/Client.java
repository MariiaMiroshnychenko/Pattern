package gof.proxy;

import gof.proxy.entity.Image;
import gof.proxy.entity.ProxyImage;
import gof.proxy.entity.RealImage;

public class Client {
    public static void main(String[] args) {
//        Image realImage = new RealImage("D:/Images/my.jpg");
//
//        realImage.display();

        Image proxyImage = new ProxyImage("D://Images//my.jpg");
        proxyImage.display();
    }
}
