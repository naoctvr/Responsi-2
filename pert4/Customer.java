class Customer {
    String nama;
    String id;
    int totalBelanja;

    // Constructor
    Customer(String nama, String id, int totalBelanja) {
        this.nama = nama;
        this.id = id;
        this.totalBelanja = totalBelanja;
    }

    // Method tampilkan info
    void tampilkanInfo() {
        System.out.println("Nama: " + nama + " | ID: " + id + " | Total Belanja: Rp " + totalBelanja);
    }
}