import java.util.Scanner;

/**
 * Triangle Custom class
 * Skeleton class for a Triangle object.
 * Uses both a 'no-arg' and an 'overload' constructor that allows users to enter:
 * no values: which will set the triangle name to 'Unknown' and the base and height values to 0.0.
 * provided values: which will allow the name, base, and height values to be set upon instantiation of the object.
 * @author Levi Crouch, lcrouch@student.sdccd.edu
 * @version 1.0.1
 * @since 3/17/2026
 */
public class Triangle {
    
    private String name;
    private double base;
    private double height;

    /**
     * When no arguments are provided, this constructor will set the default values to:
     * name = 'Unknown'
     * base = 0.0
     * height = 0.0
     */
    public Triangle () {
        
        name = "Unknown";
        base = 0.0;
        height = 0.0;
    }

    /**
     * User provided values for the triangle name, base, and height values.
     * @param inName Triangle name.
     * @param inBase Triangle base value.
     * @param inHeight Triangle height value.
     * 
     */
    public Triangle (String inName, double inBase, double inHeight) {
        
        name = inName;
        base = inBase;
        height = inHeight;
    }

    /**
     * Writes the object's name, base, height, and area values to the console.
     */
    public void writeOutput () {
        System.out.printf("%s name is: %s%n", getClass().getSimpleName(), name);
        System.out.printf("%s base is: %.1f%n", getClass().getSimpleName(), base);
        System.out.printf("%s height is: %.1f%n", getClass().getSimpleName(), height);
        System.out.printf("%s area is: %.1f%n", getClass().getSimpleName(), getArea());
        System.out.println();
    }

    /**
     * Users the Scanner object to capture the triangle's name, base, and height values from the user via the console and set those values on the object.
     */
    public void readInput () {
        Scanner keyboard = new Scanner(System.in);
        System.out.printf("What is the %s's name: ", getClass().getSimpleName());
        setName(keyboard.nextLine());
        System.out.printf("What is the %s's base: ", getClass().getSimpleName());
        setBase(keyboard.nextDouble());
        System.out.printf("What is the %s's height: ", getClass().getSimpleName());
        setHeight(keyboard.nextDouble());
        System.out.println();
    }

    /**
     * no output method to set the triangle's name property value.
     * @param newName sets the triangle's name property.
     */
    public void setName (String newName) {
        
        name = newName;
    }

    /**
     * no output method to set the triangle's base property value.
     * @param newBase sets the triangle's base property value.
     */
    public void setBase (double newBase) {
        
        base = newBase;
    }

    /**
     * no output method to set the triangle's height property value.
     * @param newHeight sets the triangle's height property value.
     */
    public void setHeight (double newHeight) {
        
        height = newHeight;
    }

    /**
     * Calculates and returns the area of the triangle using the formula: (base x height) / 2.
     * @return the triangle's area as a double.
     */
    private double getArea () {
        
        return (base * height) / 2;
    }
}