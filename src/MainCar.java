public class MainCar {
    public static void main(String[] args) {
        Car car=new Car("audi", 178,12000);
        try{
            car.engineStart();
        }catch(MyOwnExeption e){
            System.out.println("произошла ошибка");
        }
        try{
            car.engineStart();
        }catch(MyOwnExeption e){
            System.out.println("произошла ошибка");
        }
        try{
            car.engineStart();
        }catch(MyOwnExeption e){
            System.out.println("произошла ошибка");
        }
        try{
            car.engineStart();
        }catch(MyOwnExeption e){
            System.out.println("произошла ошибка");
        }
        try{
            car.engineStart();
        }catch(MyOwnExeption e){
            System.out.println("произошла ошибка");
        }
        try{
            car.engineStart();
        }catch(MyOwnExeption e){
            System.out.println("произошла ошибка");
        }

    }

}
