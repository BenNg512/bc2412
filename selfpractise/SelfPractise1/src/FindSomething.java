public class FindSomething {
    public static void main(String[] args){
        String str = "Hello, World! abcdefghijklmnopqrstuvwxyz";
        System.out.println(str);
        String breakLine = "-----------------------------------";
        char targetChar = 'o';
        int count = 0;
        String targetStr = "or";
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == targetChar){
                System.out.println("Found "+ targetChar +" at index: " + i);
                count++;
            }
        }
        System.out.println(targetChar + " exists : " + count + " times");
        System.out.println(breakLine);
        //
        String str1 = "Hello, World! abcdefghijklmnopqrstuvwxyz";
        char[] char1 = new char[] {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n'};
        int [] count1 = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,};
        int maxCount1 = Integer.MIN_VALUE;
        char maxChar1 = ' ';
        for (int i = 0; i < char1.length; i++){
            for (int j = 0; j < str.length()-1; j++){
            if (str1.charAt(j) == char1[i]){
                count1[i]++;    
            }
            }
            for (int k = 0; k < count1.length - 1; k++){
                if (count1[k] < count1[k+1]){
                maxCount1 = count1[k+1];
                maxChar1 = char1[k+1];
            }
            }
            System.out.println("Count " + char1[i] + " : " + count1[i]);
        }
        System.out.println("Most exist char: "+ maxChar1 + " & " + maxCount1 + " times");
        System.out.println(breakLine);
}
}
