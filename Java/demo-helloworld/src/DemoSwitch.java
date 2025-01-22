public class DemoSwitch {
  public static void main(String[] args){
    int x = 2;
    if (x == 1){
      System.out.println("x = 1");
    }else if(x == 2){
      System.out.println("x = 2");
    }else if(x == 3){
      System.out.println("x = 3");
    }else{
      System.out.println("something else");
    }


    // switch
    switch (x){ // check x == ? 
      //! cannot do comparison >, <, >=, <=, == 
      //! string x -> not OK
      //! char x -> OK
      case 1:
        System.out.println("x = 1");
        break;
      case 2:
        System.out.println("x = 2");
        break;
      case 3:
        System.out.println("x = 3");
        break;
      default: // = else
        System.out.println("something else");
    }

    char gender = 'M';
    switch (gender){
      case 'M':
        System.out.println("Male");
        break;
      case 'F':
        System.out.println("Female");
        break;
      default:
        System.out.println("other genders");
    }

    String scr = "IVXLCDM";
    


  }
}
