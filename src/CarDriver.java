/**
 * Created by William Yu on 4/19/2017.
 */
public class CarDriver {
    public static void main(String[]args){
        Car myCar = new Car();
        Car hisCar = new Car("Black", 400, 3.5, "Honda" );
        Car herCar = new Car("Pink", 300, 2.5, "Volks");
        System.out.println(myCar + "\n" + hisCar + "\n" + herCar);
        myCar.setColor("Blue");
        myCar.setHorsepower(650);
        myCar.setEnginesize(6.5);
        myCar.setMake("Ferrari");
        System.out.println(myCar.getColor()+ "\n" +
                            myCar.getHorsepower()+ "\n"
                            + myCar.getEnginesize() + "\n"
                            + myCar.getMake());

    }
}
