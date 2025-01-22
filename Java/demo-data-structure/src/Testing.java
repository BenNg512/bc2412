import java.util.HashMap;

public class Testing { //205
  public boolean isIsomorphic(String s, String t) {
        if(s.equals(t)){
          return true;
        }
        if(s.length() != t.length()){
          return false;
        }
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        for(int i = 0 ; i< s.length(); i++){
            char a = s.charAt(i);
            char b = t.charAt(i);
            if(map.containsKey(a)){ 
                if(map.get(a).equals(b)) // key = value
                continue;
                else
                return false;
            }else{
                if(!map.containsValue(b))
                map.put(a,b);
            else return false;
            }
        }
        return true;
        
    }

  public static void main(String[] args) {
    Testing testing = new Testing();
    System.out.println(testing.isIsomorphic("egg", "add")); // T
    System.out.println(testing.isIsomorphic("abc123", "abc233")); // F
    System.out.println(testing.isIsomorphic("baby", "baby")); // T
    System.out.println(testing.isIsomorphic("foo", "bar")); // F

    HashMap<String, Integer> fruitMap = new HashMap<>();
    fruitMap.put("Apple", 1);
    fruitMap.put("Apple", 3);
    System.out.println(fruitMap);
    fruitMap.put("APPLE", 4); 
    System.out.println(fruitMap);
    System.out.println(fruitMap.size());
    System.out.println(fruitMap.get("APPLE"));
    System.out.println(fruitMap.get("Apple"));
    System.out.println(fruitMap.containsKey("Apple"));

  }
}