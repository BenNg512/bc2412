public class DemoArray {
    public static void main(String[] args){
    // int x1 = 3;
    // int x2 = 10;
    // int x3 = 11;

    // array
    int[] arr = new int[3];
    // assign values to array
    arr[0] = 3;
    arr[1] = 10;
    arr[2] = 11;

    // for loop --> read the array
    for (int i = 0; i < arr.length; i++){ //i = 0,1,2
    System.out.println(arr[i]);
    }
    // Print all values >= 10
    for (int i = 0; i < arr.length; i++){
        if (arr[i] >= 10){
            System.out.println("Values >= 10 are: " + arr[i]);
        }
    }
    // declare double array, length = 5
    // 10.4, 4.3, 3.3, 1.9, 9.9
    double[] arr2 = new double[5];
    arr2[0] = 10.4;
    arr2[1] = 4.3;
    arr2[2] = 3.3;
    arr2[3] = 1.9;
    arr2[4] = 9.9;

    double sum =0;
    for (int i = 0; i < arr2.length; i++){
        sum = sum + arr2[i];
    }
    System.out.println(sum);

    String[] arr3 = new String[4];
    arr3[0] = "abc";
    arr3[1] = "def";
    arr3[2] = "ijk";
    arr3[3] = "aaabbc";
    //find if "abc" exist
    String target = "abc";
    boolean isTargetExist = false;
    for (int i = 0; i < arr3.length; i++){
        if (target.equals(arr3[i])){
        isTargetExist = true;
    }
    }
    System.out.println("Is target exist? " + isTargetExist);

    // What if the string contains a special character?
    String findString = "abb";
    for (int i = 0; i < arr3.length; i++){
    if (arr3[i].contains(findString)){
        System.out.println("Found "+ findString + " in " + arr3[i]);
    }
    }
    char[] arr4 = new char[3];
    arr4[0] = 'b';
    arr4[1] = 'c';
    arr4[2] = 'a';
    // convert the char value to int value, and the assign them to a new int array
    // 98, 99, 97
    int[] ascii = new int[arr4.length];

    for (int i = 0; i < arr4.length; i++){
        ascii[i] = arr4[i]; // char value -> int value
        System.out.println("int value = " + ascii[i]);
    }

// Find max value in the array
    int arr5[] = new int[] {9, -8, -99, 98};
    int max = arr5[0]; // starts from 1st number
    for (int i = 0; i < arr5.length; i++) {
        if (arr5[i] > max) {
            max = arr5[i];
        }
    }
    System.out.println("max value = " + max);
    // min
    int min = arr5[0];
    for (int i = 0; i < arr5.length; i++) {
        if (arr5[i] < min) {
            min = arr5[i];
        }
    }
    System.out.println("min value = " + min);

}
}
