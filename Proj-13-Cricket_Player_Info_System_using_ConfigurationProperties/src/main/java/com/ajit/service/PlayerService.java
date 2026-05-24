package com.ajit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ajit.Proj13CricketPlayerInfoSystemUsingConfigurationPropertiesApplication;
import com.ajit.cofig.PlayerConfig;

@Service
public class PlayerService {

    private final Proj13CricketPlayerInfoSystemUsingConfigurationPropertiesApplication proj13CricketPlayerInfoSystemUsingConfigurationPropertiesApplication;
	
	@Autowired
	private PlayerConfig playerConfig ;

    PlayerService(Proj13CricketPlayerInfoSystemUsingConfigurationPropertiesApplication proj13CricketPlayerInfoSystemUsingConfigurationPropertiesApplication) {
        this.proj13CricketPlayerInfoSystemUsingConfigurationPropertiesApplication = proj13CricketPlayerInfoSystemUsingConfigurationPropertiesApplication;
    }

public void displayPlayerInfo() {
    System.out.println("Player Information:");
    
	System.out.println("Player ID   : "+playerConfig.getId());
	System.out.println("Player Name : "+playerConfig.getName());
	System.out.println("Years Number: "+playerConfig.getYearsNumber());
	System.out.println("Team Name   : "+playerConfig.getTeamame());
}
}
