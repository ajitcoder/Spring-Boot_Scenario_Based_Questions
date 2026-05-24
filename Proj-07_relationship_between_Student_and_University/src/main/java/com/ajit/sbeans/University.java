package com.ajit.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class University {
	@Value("${university.name}")
    private String name;

    @Value("${university.location}")
    private String location;

    @Value("${university.ranking}")
    private Integer ranking;

   


}
