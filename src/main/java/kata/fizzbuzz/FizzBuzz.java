package kata.fizzbuzz;

public class FizzBuzz {

    public String getNumber(int i) {

        String response = "";

        if (i % 3 == 0) {
            response = "Fizz";
        }

        if (i % 5 == 0) {
            response += "Buzz";
        }
        if (!response.isEmpty()){
            return response;
        }

        return Integer.toString(i);

    }

    public static void main(String[] args){
        FizzBuzz fizzbuzz = new FizzBuzz();
        int count = 0;
        do{
            count++;
            System.out.println(count + " " + fizzbuzz.getNumber(count));

        }while(count<50);
    }

}

