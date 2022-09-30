package Abctracsia;

public abstract class Animal {
    private int age;
    private String name;

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public void osuu(){
        System.out.println("DLFN");
    }
    public abstract void method();


}
