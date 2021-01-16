import java.util.Scanner;
public class Showroom
{
    public Car[]stock;
    private int no_cars;
    private int no_sales;
    public int id;
    private String status;
    public static int index = 0;

    public Showroom()
    {
        no_cars = 100;
        stock = new Car[100];
        no_sales = 0;
        id = 0;
        status = "in stock";
    }

    public Showroom(int no_cars, int no_sales, Car[]stock, String status, int id)
    {
        this.stock = stock;
        this.no_cars = no_cars;
        this.no_sales = no_sales;
        this.status = status;
        this.id = id;
    }


    public void addCartoStock()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the car details");

        System.out.println("please enter the showroom car id");
        int id = sc.nextInt();

        System.out.println("please enter the car model");
        String model = sc.next();

        System.out.println("please enter the topSpeed");
        int topSpeed = sc.nextInt();

        System.out.println("please enter the price");
        double price = sc.nextDouble();

        System.out.println("please enter the color");
        String color = sc.next();

        System.out.println("please enter the status");
        String status = sc.next();
        System.out.println("index = "+ Showroom.index);

        Car c1 = new Car(model, price, topSpeed, color, status);
        stock[Showroom.index] = new Car();
        stock[Showroom.index] = c1;
        stock[Showroom.index].display();
        Showroom.index++;
        System.out.println("index = "+ Showroom.index);
        System.out.println(c1);

    }
    public void SaleOfCar()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the id of the car being sold");
        int id = sc.nextInt();
        stock[id-1].setStatus("sold-out");
    }

    public void displayCar()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the id of the car");
        int id = sc.nextInt();
        stock[id-1].display();
    }

    public void displayStock()
    {
        for(int i = 0; i < Showroom.index; i++)
        {
            if(stock[i].getStatus().equals("in stock"))
            stock[i].display();

        }
    }

    public void upgradeCar()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the id of the car who's speed you want to upgrade");
        int id = sc.nextInt();
        System.out.println("enter the speed");
        int s = sc.nextInt();
        System.out.println("success");
        stock[id-1].setSpeed(s);
    }

    public void GoOnMission(int target)
    {
        int i;
        int count = 0;
        for (i = 0; i<index; i++)
        {
            if (stock[i].getStatus().equals("sold-out"));
            {
                count = count++;
            }
        }
        if (count >= target)
        {
            System.out.println("mission completed");
        }
        else
            {
                System.out.println("mission failed");
        }
    }
}
