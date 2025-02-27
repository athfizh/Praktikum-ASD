package Jobsheet3;
public class Contohmain {
    public static void main(String[] args) {
        Contoh mhs1 = new Contoh();
        mhs1.tampilkanInfo();

        Contoh mhs2 = new Contoh("244107060033", "Agnes Titania Kinanti");
        mhs2.tampilkanInfo();

        Contoh mhs3 = new Contoh("244107060034", "Budi Santoso", "SIB-1E", 3.75f);
        mhs3.tampilkanInfo();
    }
}