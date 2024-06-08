public class Main {
    public static void main(String[] args) {
        Printable obj1 = createObject("Child1");
        Printable obj2 = createObject("Child2");
        Printable obj3 = createObject("Child3");

        Printable[] objects = {obj1, obj2, obj3};

        for (Printable obj : objects) {
            obj.print();
        }
    }

    public static Printable createObject(String className) {
        switch (className) {
            case "Child1":
                return new Child1("Alice", 10);
            case "Child2":
                return new Child2("Bob", "Painting");
            case "Child3":
                return new Child3("Charlie", 95.5);
            default:
                return null;
        }
    }
}
