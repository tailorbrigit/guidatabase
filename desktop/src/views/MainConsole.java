package views;

import java.util.ArrayList;
import models.guidatabase;

public class MainConsole 
{

    public MainConsole() 
    {}
    

    public void printguidatabase(ArrayList<guidatabase> props) 
    {
        for(guidatabase prop: props)
        {
            System.out.println(prop.getAddress());
            System.out.println(prop.getCity());
            System.out.println(prop.getPrice());
            System.out.println(prop.getSize());
        }
    }
}
