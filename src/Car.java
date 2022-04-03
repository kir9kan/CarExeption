import java.util.Random;

public class Car {
    private String autoBrand;
    private int speed;
    private int price;

    public Car() {
    }

    public Car(String autoBrand, int speed, int price) {
        this.autoBrand = autoBrand;
        this.speed = speed;
        this.price = price;
    }

    public String getAutoBrand() {
        return autoBrand;
    }

    public void setAutoBrand(String autoBrand) {
        this.autoBrand = autoBrand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public void engineStart() throws MyOwnExeption{
        generateRandomValue();
    }
    private void generateRandomValue() throws MyOwnExeption{
        Random random=new Random();
        int randomValue=random.nextInt(21);
        checkValue(randomValue);
    }
    private void checkValue(int value) throws MyOwnExeption{
        if(value%2==0){
            throw new MyOwnExeption();
        }else{
            System.out.println(this);
        }

    }

}
