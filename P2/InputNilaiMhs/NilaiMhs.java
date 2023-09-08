public class NilaiMhs {
    private String nim;
    private String namaMatkul;
    private int nilai;

    NilaiMhs(Mahasiswa mhs,Matkul matkul, int nilai){
        this.nim = mhs.nim;
        this.namaMatkul = matkul.namaMatkul;
        this.nilai = nilai;
    }

    public void getNilai(){
        System.out.println("NIM\t: " + nim);
        System.out.println("Matkul\t: " + namaMatkul);
        System.out.println("Nilai\t: " + nilai);
    }
}
