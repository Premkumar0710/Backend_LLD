package LLD_1.FunctionalInterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Client {
    static class Car{
        String name;
        int price;
        int speed;

        public Car(String name, int price, int speed) {
            this.name = name;
            this.price = price;
            this.speed = speed;
        }




    }
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10,1,2,3,4,7,9);
        Collections.sort(nums);
        System.out.println(nums);


        Car car1 = new Car("A",1000,200);
        Car car2 = new Car("B",2000,300);
        Car car3 = new Car("C",3000,400);

        List<Car> cars = Arrays.asList(car1,car2,car3);
        Comparator<Car> comparator = (c1,c2) -> c1.speed - c2.speed ;
        Collections.sort(cars,comparator);
        System.out.println(cars);


    }
}
