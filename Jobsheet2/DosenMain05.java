package Jobsheet2;
public class DosenMain05 {
    public static void main(String[] args) {
        Dosen05 dosen1 = new Dosen05();
        dosen1.idDosen = "SR";
        dosen1.nama = "Sri Rejeki";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2003;
        dosen1.bidangKeahlian = "Matematika";

        dosen1.tampilInformasi();
        dosen1.setStatusAktif(false);
        dosen1.ubahKeahlian("Sains");
        dosen1.hitungMasaKerja(2025);
        dosen1.tampilInformasi();

        Dosen05 dosen2 = new Dosen05("AH", "Athaulla Hafizh", true, 2017, "Komputer");
        dosen2.tampilInformasi();
        dosen2.hitungMasaKerja(2025);
        dosen2.setStatusAktif(true);
    }
}