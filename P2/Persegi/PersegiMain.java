public class PersegiMain {
    public static void main(String[] args) {
        Persegi persegi1 = new Persegi(5);
        Persegi persegi2 = new Persegi(10);
        Persegi persegi3 = new Persegi(15);

        System.out.println("Persegi 1");
        persegi1.showSquareSideLength();
        persegi1.showRoundSquare();
        persegi1.showSquareArea();
        System.out.println();

        System.out.println("Persegi 2");
        persegi2.showSquareSideLength();
        persegi2.showRoundSquare();
        persegi2.showSquareArea();
        System.out.println();
        
        System.out.println("Persegi 3");
        persegi3.showSquareSideLength();
        persegi3.showRoundSquare();
        persegi3.showSquareArea();
        System.out.println();
    }
}
