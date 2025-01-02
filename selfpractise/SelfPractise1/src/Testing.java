public class Testing {
      public boolean checkIfPangram(String sentence) {
        char[] arr = new char[26];
        int[] count = new int[26];
        boolean isPangram = true;
        for (int i = 0; i < sentence.length(); i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[j] = (char) ('a' + j);
                if (sentence.charAt(i) == arr[j]) {
                count[j]++;
                }
                if (count[j] != 0){
                continue;
                } else {
                isPangram = false;
            }
        }
        }
    return isPangram;
}

}

