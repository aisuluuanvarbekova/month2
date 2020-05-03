package company;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
        Iphone10 ObjectA = new Iphone10(20, Color.BLACK, " Instagram ", " 64-ГБ ", new Model(2017, " Iphone10 "));


        System.out.println("" + ObjectA.getInfo());
        ObjectA.Buy(" $50 ");
        ObjectA.Buy(" Telegram ", " 125 - GB ");


        Iphone11pro ObjectB = new Iphone11pro(30, Color.GREY, " 32 GB ", "WhatsUp", 1000, 500, new Model(2019, "Iphone11pro"));
        System.out.println("" + ObjectB.getInfo());


        Iphone11pro ObjectC = new Iphone11pro(30, Color.RED, " 32 GB ", "WhatsUp", 1000, 500, new Model(2020, "Iphone12"));
        System.out.println("" + ObjectC.getInfo());
    }
}






