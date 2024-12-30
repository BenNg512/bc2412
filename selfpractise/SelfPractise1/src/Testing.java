public class Testing {
  public static void main(String[] args){
    String sum = "";
    String s = "hello";
    String newStr = "";
    if (s.length() > 5 || s.indexOf("he") == 3){
      newStr = s;
    }else{
      newStr += "str";
      
    }System.out.println(newStr);
    
    String[] string = new String[3];
    for(int i=0; i < 4; i++){
//    string[i] = String.valueOf(i);
//    sum += string[i];
    }
    System.out.println(sum);

    int g =3;
    System.out.println(++g *8);

    }
}  


