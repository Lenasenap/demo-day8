package operators;

public class Not {
    public static void main(String[] args) {

        boolean isTired = false;

        int a = 6;
        int b = 4;

        boolean bool = !((b == a) || true && !(a < b));
        System.out.println(bool);
        boolean test = false;
        System.out.println(test);




        System.out.println(bool);

        if (!isTired) {
            System.out.println("Gå till gymmet");
        }
    }
}
