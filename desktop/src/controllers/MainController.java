package controllers;
import java.util.ArrayList;
import java.util.Arrays;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import models.guidatabase;
import models.Restapi;
import views.MainConsole;

public class MainController 
{
    MainConsole mainConsole;

    public MainController() 
    {
        this.mainConsole = new MainConsole();
        this.showProp();
    }

   

    private ArrayList<guidatabase> convertStringToArray(String res) 
    {
        ArrayList<guidatabase> propList = null;
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        guidatabase[] propArray = gson.fromJson(res, guidatabase[].class);
        propList = new ArrayList<>(Arrays.asList(propArray));
        return propList;
        
    }
    


    private void showProp()
    {
        Restapi restapi = new Restapi();
        String res = restapi.getProperties();
        ArrayList<guidatabase> propList = convertStringToArray(res); 
        this.mainConsole.printProperties(propList);
    }
}
