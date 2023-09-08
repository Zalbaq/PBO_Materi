public class MhsMain {
    public static void main(String[] args) {
        Mahasiswa sarah = new Mahasiswa("sarah", "1234");
        Mahasiswa yanti = new Mahasiswa("yanti", "1345");
        Mahasiswa fira = new Mahasiswa("fira", "0987");

        Matkul matematika = new Matkul("Matematika", "1111");
        Matkul pancasila = new Matkul("Pancasila", "2222");
        Matkul pbo = new Matkul("PBO", "3333");
        Matkul daspro = new Matkul("Daspro", "4444");

        NilaiMhs nilaiSarah = new NilaiMhs(sarah, matematika, 80);
        NilaiMhs nilaiSarah = new NilaiMhs(sarah, matematika, 80);
        NilaiMhs nilaiSarah = new NilaiMhs(sarah, matematika, 80);
        NilaiMhs nilaiSarah = new NilaiMhs(sarah, matematika, 80);

        nilaiSarah.getNilai();

    }
}
