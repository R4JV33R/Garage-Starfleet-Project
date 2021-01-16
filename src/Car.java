public class Car
{

    private String model;
    private double price;
    private int topSpeed;
    private String color;
    private String status;



    public Car(String model, double price, int topSpeed, String color, String status)
    {

        this.model = model;
        this.price = price;
        this.topSpeed = topSpeed;
        this.color = color;
        this.status = status;

    }

    public void display()
    {
        System.out.println("car[]"  + ","+ model + ","+ topSpeed + ","+ color +","+ price+ status);
    }

    public Car()
    {
        model = " ";
        price = 0;
        topSpeed = 0;
        color = " ";
        status = "in stock";

    }

    String getModel()
    {
        return model;
    }

    public String getStatus()
    {
        return status;
    }

    double getPrice()
    {
        return price;
    }

    int getTopSpeed()
    {
        return topSpeed;
    }
    String getColor()
    {
        return color;
    }
    public void setStatus(String s)
    {
        status = s;
    }
    public void setPrice(double price)
    {
        this.price = price;
    }

    public void setTopSpeed(int topSpeed)
    {
        this.topSpeed = topSpeed;
    }


    public String toString()
    {
        String s = "car[]"  + ","+ model + ","+ topSpeed + ","+ color +","+ price + status;
        return s;
    }

    public void setSpeed(int speed)
    {
        this.topSpeed = speed;
    }
}
