public class Persegi {
    int sisi;

    Persegi(int sisi) {
        this.sisi = sisi;
    }

    public void showSquareSideLength() {
        System.out.println("Panjang sisi\t\t: " + this.sisi);
    }

    public void showSquareArea() {
        System.out.println("Luas Persegi\t\t: " + (this.sisi * this.sisi));
    }

    public void showRoundSquare() {
        System.out.println("Keliling Persegi\t: " + (this.sisi * 4));
    }
}