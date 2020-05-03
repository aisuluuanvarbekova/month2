package company;

import company.Color;

public class Apple {
    private int size;
    private Model modelIphone;
    private Color color;


    public Apple(int size, Color color,Model modelIphone) {
        this.size = size;
        this.modelIphone = modelIphone;
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public Model getModelIphone() {
        return modelIphone;
    }

    public Color getColor() {
        return color;
    }

    public String getInfo(){
        return  " Размер"+ size + "Модель" + modelIphone + "Цвет" + color;
    }


    }
