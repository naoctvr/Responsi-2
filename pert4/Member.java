class Member extends Customer {
    int poin;
    String level;

    // Constructor menggunakan super
    Member(String nama, String id, int totalBelanja, int poin, String level) {
        super(nama, id, totalBelanja);
        this.poin = poin;
        this.level = level;
    }

    // Override method tampilkanInfo
    @Override
    void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Poin Reward: " + poin + " | Level: " + level);
    }
}