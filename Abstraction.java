
abstract class Abstract {
    abstract void func();

    void normalFunc() {
        System.out.println("Supports normal methods");
    }
}

public class Abstraction extends Abstract{
    public static void main(String[] args) {
        new Abstraction().func();
        new Abstraction().normalFunc();
    }

    void func() {
        System.out.println("Abstraction in java");
    }
}
