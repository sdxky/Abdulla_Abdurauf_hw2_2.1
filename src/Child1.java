public class Child1 extends Parent implements Printable {
    private int age;

    public Child1(String name, int age) {
        super(name);
        this.age = age;
    }

    @Override
    public void print() {
        System.out.println("Child1: Name = " + getName() + ", Age = " + age);
    }
}