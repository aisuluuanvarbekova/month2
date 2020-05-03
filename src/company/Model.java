package company;

public class Model {
    public int yearProducing;
    public String modelIphone;

    public int getYearProducing() {
        return yearProducing;
    }

    public String getModelIphone() {
        return modelIphone;
    }

    public Model(int yearProducing, String modelIphone) {
        this.yearProducing = yearProducing;
        this.modelIphone = modelIphone;
    }
}
