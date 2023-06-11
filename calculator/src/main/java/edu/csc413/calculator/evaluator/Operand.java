package edu.csc413.calculator.evaluator;

/**
 * Operand class used to represent an operand
 * in a valid mathematical expression.
 */
public class Operand {
    private int value;

    /**
     * construct operand from string token.
     */
    public Operand(String token) {
//        this.value = Integer.parseInt(token);
        try {
            value = Integer.parseInt(token);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid operand: " + token);
        }
    }

    /**
     * construct operand from integer
     */
    public Operand(int value) {
        this.value = value;
    }

    /**
     * return value of operand
     */
    public int getValue() {
        return value;
    }

    /**
     * Check to see if given token is a valid
     * operand.
     */
    public static boolean check(String token) {
        try {
            Integer.parseInt(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        Operand x = new Operand(5);
        System.out.println(Operand.check("rtyer+"));
        System.out.println(Operand.check("4562"));
        System.out.println(x.getValue());
    }
}
