import java.util.Scanner;
public class Magoffee{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//алдымен клиентке кандай кофе тандайтынын сұраймыз

        while (true) {
            System.out.println(" ");
            System.out.println("Кофе түрін таңдаңыз:");
            System.out.println("1. Қарапайым");
            System.out.println("2. Эспрессо");
            System.out.println("3. Латте");
            System.out.println("4. Капучино");
            System.out.println("5. Раф");
            int choice = scanner.nextInt();

            Coffee coffee = null;
//мұнда ол сандар арқылы кофе тұрін таңдайды яғни 1-5 аралығы, егер ондай санды енгізбесе код санды қайт а сұрайды
            if (choice == 1) {
                coffee = new Qarapaiym();
            } else if (choice == 2) {
                coffee = new Espresso();
            }
            else if (choice == 3) {
                coffee = new Latte();
            }
            else if (choice == 4) {
                coffee = new Cappuccino();
            }
            else if (choice == 5) {
                coffee = new Raf();
            }else {
                System.out.println("Кешіріңіз қайта көріңіз");
                continue; // міне осы жерде басқа сан енгізілсе код басына қайтадан орналады
            }
// мұнда кофе үстіне қосатын зат таңадалады
            while (true) {
                System.out.println("Үстінен қосымша:");
                System.out.println("1. Құлпынай");
                System.out.println("2. Шоколад");
                System.out.println("3. Банан");
                System.out.println("4. Бал");
                System.out.println("0. Заказ  аяқтау");

                int addChoice = scanner.nextInt();
// 1-4 сандар арқылы
                if (addChoice == 1) {
                    coffee = new QulpynaiD(coffee);
                } else if (addChoice == 2) {
                    coffee = new ChocolateD(coffee);
                } else if (addChoice == 3) {
                    coffee = new BananD(coffee);
                }
                else if (addChoice == 4) {
                    coffee = new BalD(coffee);
                }else if (addChoice == 0) {
                    break; // егер 0 болса клиент кандай заказ бергенін көреді
                } else {
                    System.out.println("Кешіріңіз қайтадан");// егер басқа сан болса код каитадан сұралады
                }
            }

            System.out.println("Сіздің тапсырыс:");
            System.out.println("Кофе: " + coffee.getDescription());
            System.out.println("Бағасы: " + coffee.baga() + " теңге");
            System.out.println("Тағы кофе қажет пе? ");
            System.out.println("1. Иә");
            System.out.println("2. Жоқ)");
            int againChoice = scanner.nextInt();

            if (againChoice == 2) {
                break;
            }
        }

        System.out.println("Рахмет, Сау Болыңыз!");
    }
}