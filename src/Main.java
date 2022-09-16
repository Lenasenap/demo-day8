public class Main {
    public static void main(String[] args) {
        String sayHello = "Hej och godmorgon!";
        System.out.println(sayHello);

        Animal horse1 = new Animal();
        Animal horse2 = new Animal(3);
        Animal horse3 = new Animal(3, "Åke", "Häst");
        Animal horse4 = new Animal("Häst");

        System.out.println(horse1.getAge());
        System.out.println(horse2.getAge());
        System.out.println(horse3.getType());
        System.out.println(horse4.getType());
    }
}
