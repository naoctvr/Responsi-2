public class UjiCustomer {
    public static void main(String[] args) {

        // Buat object Customer
        Customer c1 = new Customer("Budi Santoso", "CST-001", 500000);

        // Buat object Member
        Member m1 = new Member("Siti Aminah", "MBR-110", 1250000, 240, "Gold");

        // Tampilkan output
        System.out.println("=== DATA CUSTOMER BELANJAKU ===");

        System.out.println("Status: Customer Biasa");
        c1.tampilkanInfo();

        System.out.println();

        System.out.println("Status: Member");
        m1.tampilkanInfo();
    }
}