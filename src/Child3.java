public class Child3 extends Parent implements Printable {
    private double score;

    public Child3(String name, double score) {
        super(name);
        this.score = score;
    }

    @Override
    public void print() {
        System.out.println("Child3: Name = " + getName() + ", Score = " + score);
    }
}
