/**
 * @author Vincent
 * @since 2025-01-15
 * @version 1.0
 */
public class Person {
    private String name;
    private int age;
    public static Builder builder() {
        return new Builder();
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }

    /**
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public static class Builder{
        private String name;
        private int age;

        // Name Setter
        public Builder name(String name) {
            this.name = name;
            return this;
        }
        // Age Setter
        public Builder age(int age) {
            this.age = age;
            return this;
        }
        public Person build() {
            return new Person(this.name, this.age); // return new object
        }
    }

    
    public static void main(String[] args) {
        Person p1 = new Person("Vincent", 18);
        Person p2 = Person.builder()
            .name("Lucas")
            .age(17)
            .build();
    // Adv: 
    // 1. no longer to pass null for those unnecessary attributes
    // 2. If there are many parameters, you have to check them one by one
    // 3. It is more readable: the code is more self-explanatory
    System.out.println(p1.getName());
    System.out.println(p1.getAge());
    System.out.println(p2.getName());
    System.out.println(p2.getAge());


    }



}
