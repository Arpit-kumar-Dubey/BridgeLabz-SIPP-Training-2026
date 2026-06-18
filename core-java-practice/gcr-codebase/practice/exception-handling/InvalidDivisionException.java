package practicesProgram;

public class InvalidDivisionException extends RuntimeException {

    int numerator;
    int denominator;

    public InvalidDivisionException(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    @Override
    public String getMessage() {
        return "Division By Zero!\nNumerator:- " + numerator +
                "\nDenominator:- " + denominator;
    }
}
