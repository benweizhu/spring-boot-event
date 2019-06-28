package me.zeph.spring.event.example.springeventexample;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class CustomSpringEventListener {

  @EventListener
  public void onApplicationEvent(CustomSpringEvent event) {
    try {
      Thread.sleep(4000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("Received spring custom event - " + event.getMessage());
  }

}