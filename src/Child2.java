public class Child2 extends Parent implements Printable {
    private String hobby;

    public Child2(String name, String hobby) {
        super(name);
        this.hobby = hobby;
    }

    @Override
    public void print() {
        System.out.println("Child2: Name = " + getName() + ", Hobby = " + hobby);
    }
}