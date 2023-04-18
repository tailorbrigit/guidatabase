package models;

public class guidatabase 


{

    double size;
    double price;

    String city;
    String address;


    public guidatabase(String city, String address, double size, double price) 
    {
        this.city = city;
        this.size = size;
        this.price = price;
        this.address = address;
    }

    public String getCity() 
    {
        return city;
    }

    public void setCity(String city) 
    {
        this.city = city;
    }

    public String getAddress() 
    {
        return address;
    }

    public void setAddress(String address) 
    {
        this.address = address;
    }

    public double getSize() 
    {
        return size;
    }

    public void setSize(double size) 
    {
        this.size = size;
    }

    public double getPrice() 
    {
        return price;
    }

    public void setPrice(double price) 
    {
        this.price = price;
    }

}