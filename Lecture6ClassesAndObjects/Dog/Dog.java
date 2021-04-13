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
    public String toString() { //toString в самом конце идет. Там разработчик ожидает его увидеть.
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
   //Геттеры и сеттеры quals and hashCode добавь

    public void voice(){ //Методы выынеси в отдельный класс DogService 

       System.out.println("Гав!");
   }
   public void eat(){

        System.out.println("Хочет есть");
   }
   public void sleep(){

        System.out.println("Zzzzzz");
   }
 }
