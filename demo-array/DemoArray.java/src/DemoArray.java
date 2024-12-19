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
    int max = arr5[0]; // =9
    for (int i = 0; i < arr5.length; i++) {
        if (arr5[i] > max) {
            max = arr5[i];
        }
    }
    // Step 1: i = 0, arr5[0] = 9, arr5[0] > max --> false, max = 9
    // Step 2: i = 1, arr5[1] = -8, arr5[1] > max --> false, max = 9
    // Step 3: i = 2, arr5[2] = -99, arr5[2] > max --> false, max = 9
    // Step 4: i = 3, arr5[3] = 98, arr5[3] > max --> true, max = 98
    System.out.println("max value = " + max);
    // min
    int min = Integer.MAX_VALUE; 
    //! arr5[0] <-- not best value for setting min/max because array can be nothing inside.
    for (int i = 0; i < arr5.length; i++) {
        if (arr5[i] < min) {
            min = arr5[i];
        }
    }
    System.out.println("min value = " + min);
    int[] arr6 = new int[] {9,8,99,88};
    int sumArr6 = 0;
    for (int i = 0; i < arr6.length; i++) {
        sumArr6 = sumArr6 + arr5[i];
        System.out.println("sumArr5 = " + sumArr6);
        }
    // swap
    int left = 7;
    int right = 3;
    //
    int temp = left; //backup left value
    left = right;
    right = temp;

    System.out.println("left = " + left);
    System.out.println("right = " + right);

    // array
    int[] arr8 = new int[] {9, -8, 109, 99, 98};
    // print 1 (9 + -8)
    // print 101 (-8 + 109)
    // print 110 (109 + 99)
    for (int i = 0; i < arr8.length - 1; i++){
        int temp2 = arr8[i] + arr8[i+1];
        System.out.println("Sum "+i+": "+ temp2);
    }
    System.out.println("-------------------------");
    // New array
    int[] arr7 = new int[] {9, -8, 109, 99, 98};
    // move max value to the last
    // for loop + swap
    for (int i = 0; i < arr7.length - 1; i++) {
        for (int j = 0; j < arr7.length - 1 - i; j++) {
            if (arr7[j] > arr7[j + 1]) {
                // Swap arr7[j] and arr7[j + 1]
                temp = arr7[j];
                arr7[j] = arr7[j + 1];
                arr7[j + 1] = temp;
                System.out.println(temp);
            }
            // Step 1: compare 9 & -8, put -8 to the left
            // Step 2: compare 9 & 109; put 9 to the left
        }
    }
    
    // Printing the sorted array
    System.out.println("Sorted numbers in ascending order:");
    for (int num : arr7) {
        System.out.print(num + " ");
    }  

    for (int i = 0; i < arr7.length - 1; i++){
        temp = arr7[i];
        arr7[i] = arr7[i + 1];
        arr7[i + 1] = temp;
    }System.out.print(temp);
    // System.out.println(Arrays.toString(arr7));
    System.out.println("");
    System.out.println("-------------------------");
    Integer[] arr11 = new Integer[] {9, 6, 4};
    // Products for all numbers
    int product = 1;
    for (int i = 0; i < arr11.length; i++){
        product *= arr11[i]; 
    }
    System.out.println(product);
    
    // 
    double[] prices = new double[] {8.2, 6.5, 10.5};
    int[] quantities = new int[] {9, 8, 3};
    double priceTotal = 0;
    for (int i = 0; i < prices.length; i++){
        // 8.2 * 9 + 6.5 * 8 + 10.5 * 3
        priceTotal += prices[i] * quantities[i];
    }
    System.out.println("Price Total: " + priceTotal);
    System.out.println("-------------------------");
    //
    String s = String.valueOf(123);
    System.out.println(s); // 123
    s = String.valueOf(true);
    System.out.println(s); // true
    //
    System.out.println(String.valueOf('A')); //'A'
    Integer i1 = Integer.valueOf("123");
    System.out.println(i1);
    System.out.println("-------------------------");
    // Hello -> 'h' 'e' 'l' 'l' 'o'
    char[] chArr = "hello".toCharArray();
    // for (int i = 0; i < chArr.length; i++){
    //     System.out.print(chArr[i] + " ");
    // }
    // Hello -> o l l e h
    char temp2 = 'a';
    for (int i = 0; i < chArr.length /2; i++){
        temp2 = chArr[i];
        chArr[i] = chArr[chArr.length - i - 1];
        chArr[chArr.length - i - 1] = temp2;
        System.out.println(temp2 + " *** ");
    }
    System.out.println("");
    String result = "";
    for (int i = 0; i < chArr.length; i++){
        result += chArr[i];
    }
    System.out.println(result);
    System.out.println("-------------------------");
    // h -> i, e -> f, l -> m, o -> p
    chArr = "hello".toCharArray();
    for (int i = 0; i < chArr.length; i++){
        chArr[i] = (char)(chArr[i] + 1); //! forced, may overflow if <0 or >6xxxx 
        System.out.print(chArr[i]);
    }
    System.out.println("");
    System.out.println(String.valueOf(chArr)); // char Array -> String
    System.out.println("-------------------------");


    char[] arr12 = new char[] {'p','a','p','b','a','p','c'};
    //
    char[] charpab = new char[] {'a','b','c','d','p'};
    int[] count = new int[] {0, 0, 0, 0, 0};
    char maxNumChar = ' ';
    // Count the exist number of characters first
    for (int i = 0; i < charpab.length; i++){
        for (int j = 0; j < arr12.length; j++){
            if (charpab[i] == arr12[j]){
                count[i]++;
            }
        } 
        System.out.println("Count "+ charpab[i] + ": " + count[i]);
    // Find max countNum & refer to the corresponding char 
    for (int k = 0; k < charpab.length -1; k++){
        if (count[k] < count[k+1]){
        maxNumChar = charpab[k+1]; 
        }
    }
    }
    System.out.println("Most exist char is "+ maxNumChar);
    System.out.println("-------------------------");
    //
    int[] counters = new int[26]; // 26 characters (a-z, index: 0-25)
    for (int i = 0; i < arr12.length; i++){
        
        //! counter[i]
        counters[arr12[i] - 'a']++; // char = value: b-a=1 -> target is b -> counters[1] +1
        // arr12[0] - 'a' -> p-a -> 112-97 -> 15; counter[15] -> p -> counters[15] +1
        // arr12[1] - 'a' -> a-a -> 97-97 -> 0; counter[0] -> a -> counters[0] +1
        System.out.println(counters[arr12[i] - 'a']);
    };
    
    int max2 = Integer.MIN_VALUE;
    char maxNumChar2 = ' ';
    for (int i = 0; i < counters.length; i++){
        if (counters[i] > max2){
        // max2 = Math.max(counters[i], max2);
        max2 = counters[i]; // 3
        maxNumChar2 = (char)(i+97); // p
    }
    //System.out.println("count " + (char)(i+97) + " : " + counters[i]);
    }
    System.out.println("Max count = "+ max2);
    System.out.println("Most exist char is "+ maxNumChar2);
    System.out.println("-------------------------");
    //
    int[] arr20 = new int[] {20, -20, 90, 50, -40};
    // sorting
    // move the largest number to the end
    for (int i = 0; i < arr20.length -1; i++){
        // Step 1:  move largest number to the end [x, x, x, x, 90] (1=0, j < 4)
        // Step 2:  move the 2nd largest number to the end [x, x, x, 50, 90] (i=1, j <= 3)
        // Step 3:  move the 3rd largest number to the end [x, x, 20, 50, 90] (i=2, j <= 2)
        // Step 4:  move the 4th largest number to the end [x, -20, 20, 50, 90] (i=3, j<= 1)
        // Step 5:  move the 5th largest number to the end [-40, -20, 20, 50, 90] 
        for (int j = 0; j < arr20.length -1 - i; j++){
            if (arr20[j] > arr20[j+1]){
                temp = arr20[j]; // store larger value
                arr20[j] = arr20[j+1]; // swap smaller value to the left
                arr20[j+1] = temp; // j+1 return larger value -> next loop   
            }
        }
    }
    //
    for (int num : arr20) {
        System.out.print(num + " ");
    }   
    System.out.println("");
    //
    int product2 = 1;
    for (int i = 0; i < arr20.length; i++){
        product2 = arr20[i]; 
    }
    System.out.println(product2);
    System.out.println(arr20);//-40 -20 20 50 90
        
    





}
}
