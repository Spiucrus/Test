package test;

public class Git {
    private String name;
    private int age;


    public Git (String  name, int age) {
        this.name = name;
        this.age = age;
        hi();
    }

    private void hi() {
        System.out.println("Hello, I'm " + name + ".");
    }
}
