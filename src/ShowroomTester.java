import java.util.Scanner;
public class ShowroomTester
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);
        int n = 1;
        int ch;

        Showroom s1 = new Showroom();

        do {
            System.out.println("1. add car");
            System.out.println("2. sale of a car");
            System.out.println("3. display car details");
            System.out.println("4. display list of cars");
            System.out.println("5. upgrade car speed");
            System.out.println("6. go on mission/target sales");
            System.out.println("7. exit");
            System.out.println("please enter your choice");
            ch = sc.nextInt();

            switch (ch)
            {
                case 1: s1.addCartoStock();
                    break;

                case 2: s1.SaleOfCar();
                    break;

                case 3: s1.displayCar();
                    break;

                case 4: s1.displayStock();
                    break;

                case 5: s1.upgradeCar();
                    break;


                case 6:
                    System.out.println("please enter the target limit");
                    int target = sc.nextInt();
                    s1.GoOnMission(target);

                    break;

                case 7:
                    break;

                default:
            }
        }
        while (ch!=7);
    }
}
