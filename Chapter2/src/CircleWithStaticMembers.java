public class CircleWithStaticMembers {
    static int circlesNum = 0;
    double radius;

    CircleWithStaticMembers(){
        radius = 1;
        circlesNum++;
    }

    CircleWithStaticMembers(double r) {
        radius = r;
        circlesNum++;
    }
}
