class Human 
{
  private int age;
  private String name;
  
  public Human(int age, String name){
    this.age = age;
    this.name = name;
  }

  public int getAge(){
    return this.age;
  }

  public void setAge(int a)
  {
    age = a;
  }

  public String getName(){
    return this.name;
  }

  public void setName(String n)
  {
    name = n;
  }
}


public class Demo {

  public static void main(String[] args) {

    Human human1 = new Human(50, "Broski");
    Human human2 = new Human(100, "Jide");

    System.out.println(human1.getName());
    System.out.println(human1.getAge());

    System.out.println(human2.getName());
    System.out.println(human2.getAge());
  }
}



