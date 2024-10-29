/* This is the assignment qns given by Vishal sharma
Solutions : https://github.com/visharma-scaler/LLD-September-2024/blob/main/notes/lambdas%20and%20streams/03-streams-worksheet-answers.md
*/
package LLD_1.Streams;

import java.util.*;
import java.util.stream.Collectors;

public class AssignmentQns {
    public static void main(String[] args) {

        // 1. Find below a list of integers. Iterate over it and print the square of each number. */
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.stream().forEach( (n) -> System.out.print("Assignment 1 : "+ n*n + " ")); // way 1
        System.out.println();
        numbers.forEach( (n)-> System.out.print("Assignment 1 : "+ (int)Math.pow(n,2) + " ")); // way 2
        System.out.println();

        // 2. Find below a list of integers. Iterate over it and print every even number. */
        List<Integer> numbers1 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNumbers = numbers1.stream().filter( (n)-> n%2==0).toList();
        System.out.println("-------------------");
        System.out.println("Assignment 2 : "+evenNumbers);
        System.out.println("-------------------");

        // 3. For the list of integers, find all the even numbers. Then, iterate over the even numbers and print each number.
        List<Integer> numb = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numb.stream().filter( (n)-> n%2==0).forEach( (n)-> System.out.println(n));

       // 4. For a list of integers, return a list of the squares of each number.
        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> sq = nums.stream().map( (n)-> (int)Math.pow(n,2)).toList();
        System.out.println("Assignment 4 : " + sq);
        System.out.println("-------------------");

        // 5. For a list of strings, return a list of the length of each string.
        List<String> names = List.of("Tantia Tope", "Rani Lakshmibai", "Mangal Pandey", "Nana Sahib");
        List<Integer> length = names.stream().map((str) -> str.length()).toList();
        System.out.println("Assignment 5 : " +length);
        System.out.println("-------------------");

        // 6. For a list of strings, filter out the strings which do not start with the letter T and then uppercase the remaining strings.
        List<String> names1 = List.of("Tantia Tope", "Rani Lakshmibai", "Mangal Pandey", "Nana Sahib");
        List<String> res = names1.stream().filter((str) -> !str.startsWith("T")).map( (resStr)-> resStr.toUpperCase()).toList();
        System.out.println("Assignment 6 : " +res);
        System.out.println("-------------------");

        // 7. For a list of strings, filter out the strings which do not start with the letter T, then uppercase the remaining strings and then sort them.
        List<String> names2 = List.of("Tantia Tope", "Rani Lakshmibai", "Mangal Pandey", "Nana Sahib");
        List<String> res1 = names2.stream().filter((str) -> !str.startsWith("T")).map( (resStr)-> resStr.toUpperCase()).sorted().collect(Collectors.toList());
        System.out.println("Assignment 7 : " +res1);
        System.out.println("-------------------");

        // 8. For a list of integers, find the sum of all the numbers.
        List<Integer> n = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Assignment 8 : " + n.stream().reduce( (a,b)-> a+b)); // optional[55]
        System.out.println("Assignment 8 : " + n.stream().reduce( 0,(a,b)-> a+b)); // 55
        /*
    You're getting Optional[385] because the reduce method returns an Optional to handle the case where the stream is empty.
    When you use reduce without an initial value, it returns an Optional to avoid returning null for empty streams.
    Why Optional?
    If the stream is empty, reduce would return null without Optional.
    Optional provides a safe way to handle absence of value. */
        System.out.println("-------------------");

        // 9. For a list of integers, find the sum of the squares of all the numbers.
        List<Integer> n1 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Assignment 9 : " + n1.stream().map( (a)-> a*a).reduce( (a,b)-> a+b));
        System.out.println("-------------------");

        // 10. For a list of integers, find the sum of the squares of all the even numbers.
        List<Integer> numbers3 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Assignment 10 : " + numbers3.stream().filter( (b)-> b%2==0).map( (c)-> c*c).reduce( 0,(a,b)-> a+b));
        System.out.println("-------------------");

        // 11. Given a list of numbers, find the maximum number in the list.
        List<Integer> numbers4 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Assignment 11 : " + numbers4.stream().reduce(0,(a,b)-> Math.max(a,b)));
        System.out.println("-------------------");

        // 12. Given a list of numbers with duplicates, find the distinct numbers in the list.
        List<Integer> numbers5 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5);
        System.out.println("Assignment 12 : " + numbers5.stream().distinct().collect(Collectors.toList()));
        System.out.println("-------------------");

        // 13. Given a list of numbers, find the average of all the numbers.
        List<Integer> numbers6 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Assignment 13 : " + numbers6.stream().reduce( 0,(a,b)-> (a+b)) / numbers6.size());
        System.out.println("-------------------");

        // 14. Give a list of strings, find the average length of all the strings.
        List<String> names3 = List.of("Tantia Tope", "Rani Lakshmibai", "Mangal Pandey", "Nana Sahib");
        Double average = names.stream()
                .mapToInt(String::length) // (String::length) -> learn this
                .average()
                .getAsDouble();
        System.out.println("Assignment 13 : " +average);
        System.out.println("-------------------");

        // 15. Given a list of strings, find the first string that is longer than 10 characters.
        List<String> names4 = List.of("Tantia Tope", "Rani Lakshmibai", "Mangal Pandey", "Nana Sahib");
        Optional<String> firstLongName = names.stream()
                .filter(name -> name.length() > 10)
                .findFirst();
        System.out.println(firstLongName);
        System.out.println("-------------------");








    }
}
