package FizzBuzzKata;

public class FizzBuzz {


    FizzBuzz() {}

    public String play(FizzBuzzNumber number) {
        FizzBuzzString solution = new FizzBuzzString("");

        if (number.isNotFizzBuzzNumber())
            return "Error. Número no aceptado";

        if (number.isFizzNumber())
            solution.add(new FizzBuzzString("Fizz"));

        if (number % buzz == 0)
            solution += "Buzz";

        if (!number.isBuzzNumber() && !number.isFizzNumber())
            solution = new FizzBuzzString(number.toString());

        return solution.getString();
    }
}
