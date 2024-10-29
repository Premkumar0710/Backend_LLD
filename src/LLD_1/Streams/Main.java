package LLD_1.Streams;

import LLD_1.FunctionalInterface.Client;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    static class Car {
        String name;
        int price;
        int speed;

        public Car(String name, int price, int speed) {
            this.name = name;
            this.price = price;
            this.speed = speed;
        }

        public static void main(String[] args) {

            // Way 1
            List<Integer> nums = Arrays.asList(1, 2, 4, 5, 3, 6, 8, 9);
            Stream<Integer> stream = nums.stream();

            // Way 2
            Integer[] arr = {10, 20, 30, 40};
            Stream<Integer> stream1 = Stream.of(arr);

            // Q: Extract all elements from list & print even
            // nums.stream().filter((n)-> n%2==0).toList()
            // 1. Filter
            System.out.println(nums.stream().filter((n) -> n % 2 == 0).toList());
        /*
        1. List is converted into a stream of numbers
        2. Stream will loop over the elements of the list
        3. Every element will be passed to filter as an input
        4. If condition of filter returns true , then that will be printed in console else it won't
         */

            Car car1 = new Car("A", 1000, 200);
            Car car2 = new Car("B", 2000, 300);
            Car car3 = new Car("C", 3000, 400);

            List<Car> cars = Arrays.asList(car1, car2, car3);
            List<Car> expensiveCars = cars.stream().filter( (c1)-> c1.price>1000).toList();
            System.out.println(expensiveCars);

            // Map

            // for every car , extract the price
            System.out.println(cars.stream().map((car)-> car.price).toList());

        }
    }
}
