public class StaticOverridingTest {
    public static void main (String[] args) {
        Fruit f  = new Apple();
        Apple a = new Apple();

        f.describe(); // Uses Fruit's static method
        a.describe(); // Uses Apple's static method
    }
}
