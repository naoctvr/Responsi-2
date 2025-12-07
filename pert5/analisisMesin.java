class analisisMesin {
    public static void main(String[] args) {

        // ================================
        // 1. Buat array berbagai jenis mesin
        // ================================
        defaultMesin[] mesin = new defaultMesin[5];

        mesin[0] = new mesinMotor("Honda Supra X", 125, "Bebek");
        mesin[1] = new mesinTraktor("Kubota MX5200", 520, 5.0);
        mesin[2] = new mesinTraktorListrik("EcoTrac Z900", 300, 4.2, 70);
        mesin[3] = new mesinMotor("Yamaha R25", 250, "Sport");
        mesin[4] = new mesinTraktorListrik("Volta FarmX", 300, 3.5, 80);

        // ================================
        // 2. Tampilkan DATA MESIN (HANYA 3 MESIN)
        // ================================
        System.out.println("=== DATA MESIN MEGATECH ===");
        for (int i = 0; i < 3; i++) {
            defaultMesin m = mesin[i];
            m.tampilInfo();
            System.out.println("Kategori: " + m.kategoriMesin());
            System.out.println("Performa: " + m.nilaiPerforma());
            System.out.println();
        }

        // ================================
        // 3. Suara Mesin (HANYA 3 MESIN)
        // ================================
        System.out.println("=== SUARA MESIN ===");
        for (int i = 0; i < 3; i++) {
            defaultMesin m = mesin[i];
            System.out.print(m.namaMesin + " → ");
            if (m instanceof mesinMotor) {
                ((mesinMotor)m).suaraMesin();
            } else if (m instanceof mesinTraktorListrik) {
                ((mesinTraktorListrik)m).suaraMesin();
            } else if (m instanceof mesinTraktor) {
                ((mesinTraktor)m).suaraMesin();
            }
        }

        // ================================
        // 4. Cari performa tertinggi (semua mesin)
        // ================================
        double max = -1;
        defaultMesin terbaik = null;

        for (defaultMesin m : mesin) {
            if (m.nilaiPerforma() > max) {
                max = m.nilaiPerforma();
                terbaik = m;
            }
        }

        System.out.println("\n=== MESIN PERFORMA TERTINGGI ===");
        System.out.println(terbaik.namaMesin + " → " + terbaik.nilaiPerforma());

        // ================================
        // 5. Sorting top 3 descending
        // ================================
        for (int i = 0; i < mesin.length - 1; i++) {
            for (int j = i + 1; j < mesin.length; j++) {
                if (mesin[j].nilaiPerforma() > mesin[i].nilaiPerforma()) {
                    defaultMesin tmp = mesin[i];
                    mesin[i] = mesin[j];
                    mesin[j] = tmp;
                }
            }
        }

        System.out.println("\n=== TOP 3 MESIN TERBAIK ===");
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + ". " +
                mesin[i].namaMesin + " → " +
                mesin[i].nilaiPerforma());
        }
    }
}