public class Helloworld {
public static void main(String[] args) {
    // Comment. Welcome to bootcamps3141$%$
    // ! Data Type (Primitive)
    // Variables ->integer
    int x = 3;
    int dayOfWeek = 7;
    //int y = 1.2; error because integer only

    double y2 = 3.2;
    // double 2w =10.0 //! not ok
    // variable Java naming convension
    // caml case: dayOfWeek, y2
    
    // Re-assignment
    x = 101; //reassign 101 to x
    x = x + 10; // right :101 +10 = 111: assign 111 to x
    x = x - 40; // 111 - 40 = 71: assign 71 to x
    x = x * 3; // 71 * 3 = 213: assign 213 to x
    x = x / 213; // 213/213 = 1: assign 1 to x

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

    //int x5 = 3.0/2;
    // Step 1: 3.0 is double, 2 is int
    // Step 2: double / int = double
    // Step 3: 3.5/2 = 1.5
    // Step 4: assign 1.5 (double) to double int type //!(downcasting)
    //System.out.println(x5); //!Error
}
}



