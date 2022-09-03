public class revisionQuestions {
    public static void main(String[] args){
        stringStatement(); // 6. Outline the difference between the result of these two statements
        arrayOf20Doubles(); // 8. Construct Java Code to create an array of 20 doubles
        priceBetween50and80(); // 9. Construct Java code for the expression representing the condition "if the price is between 50 and 80 dollars"
        fifthFloatFrom12(); // 12. Construct the java code that returns the 5th float from an array of 12 floats
        int[] nums = {2, 4, 6, 8, 6, 4, 6, 8, 10}; // 15.
        System.out.println(methodName(nums, 5)); // 15. final number in the array that is smaller then 5
    }

    public static void stringStatement() {
        System.out.println(1 + 2 + "abc"); // 3abc - This is because int + int = int then concat to string
        System.out.println("abc" + 1 + 2); // abc12 - This is because string + int = concat into a string + int = string
    }

    public static void arrayOf20Doubles(){
        // Question 8. Construct Java Code to create an array of 20 Doubles
        // Double: Used to represent floating-point numbers. Uses 64 bits to store a variable value and has a range greater than float primitive

        double[] doubleArray = new double[20]; // init length of array - primitive type is double
        doubleArray[0] = 20; // the 1st index equals to 20
        System.out.println(doubleArray[0]); // output what the 1st index is, in this case 20
    }

    public static void priceBetween50and80(){
        int price = 60;
        if(price >= 50 && price <= 80){ // range is from 50 to 80
            System.out.println("Price is between $50 and $80!");
        }
        else{ // if not in the range
            System.out.println("Price is not in between $50 and $80!");
        }
    }

    public static void fifthFloatFrom12() {
        float[] array = new float[12]; // length: 12
        array[5] = 659; // 5th float
        System.out.println(array[5]); // output to console
    }

    public static int methodName(int[] items, int key) {
        int index = items.length - 1; // index equals to the length of the array - 1. 1st index starts at 0, hence has to take away .
        while (index >= 0) { // while loop when the index is greater than or equal to 0 - loops through the array
            if (items[index] < key) { // if the index of the array is less then the value of the key (eg 5)
                System.out.println("found");
                return index;
            }
            index = index - 1;
        }
        System.out.println("not found");
        return -1;

    }

}
