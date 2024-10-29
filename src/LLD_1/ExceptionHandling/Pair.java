package LLD_1.ExceptionHandling;

public class Pair {

    private String first;
    private String second;

    public Pair(Object first , Object second) throws Exception{
        if(first == null || second == null){
            // Raise an exception
          //  throw new Exception("Null values are not allowed");

        }
        this.first = (String) first;
        this.second = (String) second;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getSecond() {
        return second;
    }

    public void setSecond(String second) {
        this.second = second;
    }

    @Override
    public String toString(){
        return "Pair{" +
                "first='" + first + '\'' +
                ", second='" + second + '\'' +
                '}';

    }

}
