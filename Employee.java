public class Employee{
   public String name;
   public int age;
    public void display(){
       System.out.println(name);
       System.out.println(age);
    }
    public class Maim{
    public static void main(String[]args){
       Employee e1 = new Employee();
       e1.name = "saurav";
       e1.age = 23;
       e1.display();
       Employee e2 = new Employee();
       e2.name = "Prachi";
       e2.age = 25;
       e2.display();

    }
 }
}