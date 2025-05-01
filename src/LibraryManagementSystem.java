import java.util.Scanner;

public class LibraryManagementSystem {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Library library = new Library(100);
            while (true) {
                System.out.println("\n1. Kitab əlavə et");
                System.out.println("2. Kitab sil");
                System.out.println("3. Kitab məlumatlarını yenilə");
                System.out.println("4. Bütün kitabları göstər");
                System.out.println("5. Yalnız mövcud kitabları göstər");
                System.out.println("6. Çıxış");
                System.out.print("Seçim edin: ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Kitab adı: ");
                        String title = scanner.nextLine();
                        System.out.print("Müəllif: ");
                        String author = scanner.nextLine();
                        System.out.print("Janr: ");
                        String genre = scanner.nextLine();
                        System.out.print("Səhifə sayı: ");
                        int pages = scanner.nextInt();
                        System.out.print("Qiymət: ");
                        double price = scanner.nextDouble();
                        System.out.print("Mövcudluq (true/false): ");
                        boolean isAvailable = scanner.nextBoolean();
                        library.addBook(new Book(title, author, genre, pages, price, isAvailable));
                    case 2:
                        System.out.print("Silinəcək kitabın adı: ");
                        Book removeTitle = null;
//                        Book removeTitle = scanner.nextLine();
                        library.removeBook(removeTitle);
                        break;
                    case 3:
                        System.out.print("Yenilənəcək kitabın adı: ");
                        String updateTitle = scanner.nextLine();
                        System.out.print("Yeni qiymət: ");
                        double newPrice = scanner.nextDouble();
                        System.out.print("Mövcudluq (true/false): ");
                        boolean availability = scanner.nextBoolean();
                        library.updateBook(updateTitle, newPrice, availability);
                        break;
                    case 4:
                        library.showBooks();
                        break;
                    case 5:
                        library.showAvailableBooks();
                        break;
                    case 6:
                        System.out.println("Proqram dayandırıldı.");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Yanlış seçim! Zəhmət olmasa düzgün seçim edin.");
                }
            }
        }
}