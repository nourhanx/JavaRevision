public class TestCircleWithStaticMembers {
    public static void main (String[] args) {
        CircleWithStaticMembers c1 = new CircleWithStaticMembers(4);
        System.out.println("This number should be 1: " + CircleWithStaticMembers.circlesNum);
        CircleWithStaticMembers c2 = new CircleWithStaticMembers(5);
        System.out.println("This number should be 2: " + CircleWithStaticMembers.circlesNum);

    }
}
