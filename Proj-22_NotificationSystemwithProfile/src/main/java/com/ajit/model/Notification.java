package com.ajit.model;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor

public class Notification {
Integer id;
String message;
String recipient;
}
