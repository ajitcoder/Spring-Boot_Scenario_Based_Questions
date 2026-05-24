package com.ajit.cofig;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Setter;

@Data
@Component
@ConfigurationProperties(prefix = "player")
@PropertySource("player.properties")
public class PlayerConfig {

	private int id;

	private String name;

	private int yearsNumber;

	private String teamame;


}
