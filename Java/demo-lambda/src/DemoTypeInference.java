import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DemoTypeInference {
  public static void main(String[] args){
    var x = 3;
    Integer x2 = 3;
    int x3 = 3;
    System.out.println(x2.toString()+1);
        // x = 3.3; 

    var y = 3.3;
        y = 3;

    List<List<String>> stringList = new ArrayList<>();
    stringList.add(Arrays.asList("abc", "def"));
    stringList.add(Arrays.asList("xyz", "ijk"));

    // var can be define as reference since it is certain
    for (var list : stringList) {
      for (var str : list) {
        System.out.println(str);
      }
    }

    // Stream FlatMap
    List<String> result = stringList.stream()
      .flatMap(e -> e.stream())
      .collect(Collectors.toList());
    System.out.println(result);

    List<Customer> customers = new ArrayList<>();
    customers.add(new Customer("Vincent", "def", Arrays.asList("Vi", "VC")));
    customers.add(new Customer("Lucas", "ijk", Arrays.asList("L1", "Lu", "Cas")));
    customers.add(new Customer("Steven", "ijk", Arrays.asList("Ste", "Ven", "ST")));

    List<String> usernames = customers.stream()
      .map(e -> e.getUsername())
      .collect(Collectors.toList());
    System.out.println(usernames);

    List<String> nicknames = customers.stream()
      //.filter(e -> "Lucas".equals(e.getName()))
      .filter(e -> e.getName().length() > 5)
      .flatMap(e -> e.getNickname().stream())
      .collect(Collectors.toList());
    System.out.println(nicknames);

  }
  public static class Customer{
    private String name;
    private String username;
    private List<String> nickname;

    public Customer(String name, String username, List<String> nickname){
      this.name = name;
      this.username = username;
      this.nickname = nickname;
    }

    public String getName() {
      return name;
    }

    public String getUsername() {
      return username;
    }

    public List<String> getNickname() {
      return nickname;
    }

    public void setName(String name) {
      this.name = name;
    }
    public void setUsername(String username) {
      this.username = username;
    }
    public void setNickname(List<String> nickname) {
      this.nickname = nickname;
    }
  }
  //! Java does not allow defining var as variable type
  //! Java is strong type. The type has to define at compile time 
  //public static int sum(var x, var y){
  //  return x + y;
  //}


}
