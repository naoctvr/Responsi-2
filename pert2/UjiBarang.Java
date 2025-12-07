class UjiBarang {
    public static void main(String[] args) {
        // Buat objek gitar (pakai constructor 1)
        BarangMusik gitar = new BarangMusik("GTR-001", "Gitar Akustik Yamaha");
        gitar.ubahHarga(1500000.0);
        gitar.tambahStok(5);

        // Buat objek drum (pakai constructor 3)
        BarangMusik drum = new BarangMusik("DRM-001", "Drum Set Pearl", 8500000.0, 3);

        // Output
        System.out.println("=== INVENTARIS TOKO NADAKITA ===");
        gitar.tampilInfo();
        drum.tampilInfo();
    }
}