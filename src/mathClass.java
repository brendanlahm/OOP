public class mathClass {
    //Define variables
    int x = 5;
    int y = 2;
    int z;

    //Object-Oriented Method
    public static void main(String[] args) {
        mathClass mathObj = new mathClass(); //Constructor
        mathObj.z = mathObj.x + mathObj.y;
        System.out.println(mathObj.z);
        mathClassMethod();
        System.out.println(mathObj.x + "+" + mathObj.y + "=" + mathObj.z); //Print formula
        System.out.println(Math.max(mathObj.x, mathObj.y) + "<" + mathObj.z);
    }

    //Static Method
    static void mathClassMethod() {
        System.out.println("Math is fun");

    }

}
