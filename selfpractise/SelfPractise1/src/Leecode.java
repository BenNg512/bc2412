public class Leecode {
    public static void main(String [] args) {
        String s = "codeleet";
        int[] indices = new int[]{4,5,6,7,0,2,1,3};
        char[] result = new char[s.length()];
        for (int i = 0; i < s.length(); i++ ){
            for (int j = 0; j < indices.length; j++){
            if (indices[j] == i){
            result[i] = s.charAt(j);
        }    
        }
    }System.out.println(String.valueOf(result)); //System.out.println(Arrays.toString(result));
}
}