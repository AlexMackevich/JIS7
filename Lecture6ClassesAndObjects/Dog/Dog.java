package by.jrr.HomeWork.Lecture6ObjectsAndClasses.Dog;

public class Dog {

   private String name;
   private int age;
   private String color;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    public void voice(){

       System.out.println("Гав!");
   }
   public void eat(){

        System.out.println("Хочет есть");
   }
   public void sleep(){

        System.out.println("Zzzzzz");
   }
 }
