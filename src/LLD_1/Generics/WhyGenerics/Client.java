package LLD_1.Generics.WhyGenerics;

public class Client {
    public static void main(String[] args) {
        Pair<Double, Double> coordinates = new Pair<>(3.67, 2.44);
        Pair<String, String> message = new Pair<>("Vishal", "Hello");
        Pair<Integer, String> student = new Pair<>(7, "Prem");

        String first = message.getFirst();
        System.out.println(first.length());

        Integer first1 = student.getFirst();
        System.out.println(first1 + 4);

    }

}
