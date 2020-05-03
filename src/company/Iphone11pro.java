package company;

import company.Apple;

public  class Iphone11pro extends Apple {
    private int photo;
    private int video;



    public Iphone11pro(int size,  Color color, String memory, String application, int photo, int video,Model modelIphone) {
        super(size,  color,modelIphone);
        this.photo = photo;
        this.video = video;


    }

    public int getPhoto() {
        return photo;
    }

    public int getVideo() {
        return video;
    }











    public String getInfo() {
        return " Размер" + getSize() + "Фото" + photo + "Видео" + video + "Модель" + super. getModelIphone().modelIphone +"Год Выпуска" + super.getModelIphone().yearProducing;

    }
}




