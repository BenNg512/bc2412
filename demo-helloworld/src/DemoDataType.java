public class DemoDataType {
public static void main(String[] args) {
    // Comment. Welcome to bootcamps20241210
    // ! Data Type (Primitive)
    // Variables ->integer
    int x = 3;
    //int dayOfWeek = 7;
    //int y = 1.2; error because integer only

    // double y2 = 3.2;
    // double 2w =10.0 //! not ok
    // variable Java naming convension
    // calm case: dayOfWeek, y2
    
    // Re-assignment
    //! cannot declare twice for same variable name
    x = 101; //reassign 101 to x
    x = x + 10; // right :101 +10 = 111: assign 111 to x
    x = x - 40; // 111 - 40 = 71: assign 71 to x
    x = x * 3; // 71 * 3 = 213: assign 213 to x
    x = x / 213; // 213/213 = 1: assign 1 to x

    // Declaration 
    // int x100;
    //Value assignment
    // x = 100;

    // Print out
    System.out.println(x);
    x = x + 8 * 2 / 4 + 1;
    System.out.println(x);//6

    x = (x + 2) * 2 / (3 + 1);  
    System.out.println(x);//4

    x = ((x+3)/(6+1)*(x+1));
    System.out.println(x);//5

    // divide
    int x2= 3/2;
    // Step 1: 3 is int, 2 is int
    // Step 2: int/ int = int
    // Step 3: 3/2 = 1
    // Step 4: assign 1 (int) to int type variable (OK!)
    System.out.println(x2);//1

    double x3 = 3/2;
    // Step 1: 3 is int, 2 is int
    // Step 2: int/ int = int
    // Step 3: 3/2 = 1
    // Step 4: assign 1 (int) to double variable type (convert 1 to 1.0)
    System.out.println(x3);//1.0

    double x4 = 3.0/2;
    // Step 1: 3.0 is double, 2 is int
    // Step 2: double / int = double
    // Step 3: 3.5/2 = 1.5
    // Step 4: assign 1 (int) to double variable type (convert 1 to 1.0)
    System.out.println(x4);//1.5

    double x5 = 3/2.0;
    // Step 1: 3.0 is double, 2 is int
    // Step 2: double / int = double
    // Step 3: 3.5/2 = 1.5
    // Step 4: assign 1 (int) to double variable type (convert 1 to 1.0)
    System.out.println(x5);//1.5

    // divide by zero
    //double z1 = 10/0;
    //System.out.println(z1);//!error

    // zero divide
    double z2 = 0/10;
    System.out.println(z2);//0

    //! int x5 = 3.0/2;
    // Step 1: 3.0 is double, 2 is int
    // Step 2: double / int = double
    // Step 3: 3.5/2 = 1.5
    // Step 4: assign 1.5 (double) to double int type //!(downcast)
    //System.out.println(x5); //!Error

    // int-> double (upcast)
    // double-> int (downcast)

    // ! Store integer. Java: int, short, long
    int value = 10000000;
    int value2 = 1_000_000;
    int maxInteger = 2_147_483_647;
    int minInteger = -2_147_483_648;

    //! byte -128 to 127
    // assign an int value to byte type variable
    byte b1 = 127;
    byte b2 = -128;

    //! short -32768 to 32767
    // -32768 -> int value
    short s1 = 32767;
    short s2 = -32768;

    //! long -2^63 to 2^63 (most prefer using)
    // 2_147_483_648 is int value
    // int value -> double type variable
    // long l1=2147483648; is not valid
    //! always add "L" -> declare it's long value
    long l1=2_147_483_648L;

    // float -> double
    double d1 = 10.2; //10.2 -> double value
    double d2 = 10.2D; //10.2d -> double value
    float f1 = 10.2F; //10.2f -> float value, no "f" -> default double
    // although float is smaller than double, more safe
    //! always default use double so no need to type "f"

    //conversion
    float f4 = 10.2f; // assign float value to double type variable
    double d3 = f4; //safe. assign float value to double type variable
    // float f5 = d3; //! not safe

    double d4 = 10.2f; // upcasting (float -> double)

    double d5 = f4 + 10.2d; // float + double = double
    System.out.println(d5);//20.399999809265136

    double d6 = 0.2 + 0.1;
    System.out.println(d6);//0.30000000000000004

    double d7 = 0.2 + 0.2;
    System.out.println(d7);//0.4

    // make any character
    char c = 'x';
    char c2 = '1';
    char c3 = '!';
    char c4 = ' ';//space can also be used
    //char c5='';//! no value

    // boolean
    boolean b = true;
    boolean b3 = false;

    boolean isSmoker = false;
    int age = 66;
    boolean isElderly = age > 65;//"age > 65", True
    System.out.println(isElderly);//True

    int age2 = 18;
    boolean isAdult = age2 >= 18;
    System.out.println(isAdult);//True



}
}



