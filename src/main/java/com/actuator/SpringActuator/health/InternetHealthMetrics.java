package com.actuator.SpringActuator.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

import java.net.URL;
import java.net.URLConnection;

@Component
public class InternetHealthMetrics implements HealthIndicator {


    @Override
    public Health health() {
        Health health = null;
         health = checkInternet() == true?Health.up().withDetail("Success code ","Active internet connection").build():
                Health.down().withDetail("Error code ","Inactive internet connection").build();
        return health;
    }

    private boolean checkInternet(){
        boolean flag =false;
        try{
            URL url= new URL("https://www.google.com");
            URLConnection connection = url.openConnection();
            connection.connect();
            flag=true;

        }
        catch (Exception e){
            flag=false;
        }
        return flag;
    }


}
