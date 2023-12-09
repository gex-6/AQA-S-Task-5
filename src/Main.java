public class Main {
    public static void main(String[] args) {

        checkFractionEquality(
                new Fraction(2, 4),
                new Fraction(4, 8),
                true);

        checkFractionEquality(
                new Fraction(3, 9),
                new Fraction(9, 27),
                true);

        checkFractionEquality(
                new Fraction(1, 2),
                new Fraction(3, 6),
                true);

        checkFractionEquality(
                new Fraction(5, 10),
                new Fraction(2, 4),
                true);

        checkFractionEquality(
                new Fraction(3, 5),
                new Fraction(4, 8),
                false);

        checkFractionEquality(
                new Fraction(1, 3),
                new Fraction(2, 4),
                false);

        checkFractionEquality(
                new Fraction(0, 3),
                new Fraction(1, 3),
                false);
    }

    public static void checkFractionEquality(Fraction one, Fraction two, boolean expectedResult) {
        if (one.equals(two) && expectedResult)
            System.out.println(one.getNumerator() + "/" + one.getDenominator() + " and " +
                    two.getNumerator() + "/" +  two.getDenominator() + " are equal");
        else
            System.out.println("! "+ one.getNumerator() + "/" + one.getDenominator() + " and " +
                    two.getNumerator() + "/" +  two.getDenominator() + " are not equal");
    }
}