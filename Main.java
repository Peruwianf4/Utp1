
 // TODO: musimy dodac brakujace klasy!

 // OK, ja dodam ‘Adder‘, a s342510 doda ‘Subtractor‘.

public class Main {

    public static void main(String[] args) {

        Adder adder = new Adder();
        System.out.println(adder.add(3, 5));
        Subtractor subtractor = new Subtractor();
        System.out.println(subtractor.subtract(4, 2));
    }
}
