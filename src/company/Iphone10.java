package company;

import company.Color;
import company.Apple;

public class Iphone10 extends Apple{
    private String application;
    private String memory;

    public Iphone10(int size, Color color, String application, String memory,Model modelIphone) {
        super(size, color,modelIphone);
        this.application = application;
        this.memory = memory;
    }

    public String getApplication() {
        return application;
    }

    public String getMemory() {
        return memory;
    }





    public final void Buy (String memory){
        System.out.println(" Память " + memory);

    }
    public void Buy (String application,String memory) {
        System.out.println(" Приложение " + application + " Память " + memory);


    }
    @Override
    public String getInfo() {
        return " Размер" + getSize() + "Модель" +super. getModelIphone().modelIphone +"Год Выпуска" + super.getModelIphone().yearProducing  + "Цвет" + getColor() + "Память" + memory  + " Приложение" + application;
    }











}
