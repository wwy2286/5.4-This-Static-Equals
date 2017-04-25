import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;

/**
 * Created by William Yu on 4/19/2017.
 */
public class CarDriver extends Application {
    public void start (Stage primaryStage){
        TextInputDialog input = new TextInputDialog();
        Alert output = new Alert(Alert.AlertType.INFORMATION);
        input.setHeaderText("Car Creation Center");
        input.setContentText("Enter number of cars you want to create");
        input.showAndWait();
        int numCompare;
        int numCars = Integer.parseInt(input.getResult());
        Car[] car = new Car[(numCars)];
        int carNum=0;

        for (int count = 1; count<=numCars; count++){

            input.setHeaderText("Car Color");
            input.setContentText("Enter the color for car " + count);
            input.showAndWait();
            String color = input.getResult();

            input.setHeaderText("Car Horsepower");
            input.setContentText("Enter the horsepower for car " + count);
            input.showAndWait();
            int horsepower = Integer.parseInt(input.getResult());

            input.setHeaderText("Car Engine Size");
            input.setContentText("Enter the engine size for car " + count);
            input.showAndWait();
            double enginesize = Double.parseDouble(input.getResult());

            input.setHeaderText("Car Make");
            input.setContentText("Enter the make for car " + count);
            input.showAndWait();
            String make = input.getResult();

            car[carNum] = new Car(color,horsepower,enginesize,make);

            output.setContentText(carNum+" "+car[carNum]);
            output.showAndWait();
            carNum++;

        }

        input.setHeaderText("Enter two cars to compare");
        input.setContentText("Enter car number for the first car");
        input.showAndWait();
        numCompare = Integer.parseInt(input.getResult())-1;
        input.setHeaderText("Enter two cars to compare");
        input.setContentText("Enter car number for the second car");
        input.showAndWait();
       output.setHeaderText("Are the two cars equal?");
        output.setContentText(""+car[numCompare].equals(car[Integer.parseInt(input.getResult())-1]));

        output.showAndWait();

    }
   /* public static void main(String[]args){
        Application.launch();
        /*Car myCar = new Car();
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
        System.out.println(myCar.equals(hisCar));



    }*/
}
