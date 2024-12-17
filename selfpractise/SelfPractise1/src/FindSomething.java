public class FindSomething {
    public static void main(String[] args){
        String str = "Hello, World! abcdefghijklmnopqrstuvwxyz";
        System.out.println(str);
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
    }
}
