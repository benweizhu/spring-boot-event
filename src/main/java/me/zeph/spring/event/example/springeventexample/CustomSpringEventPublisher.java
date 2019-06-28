package me.zeph.spring.event.example.springeventexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class CustomSpringEventPublisher {

  @Autowired
  private ApplicationEventPublisher applicationEventPublisher;

  public void doStuffAndPublishAnEvent(final String message) {
    CustomSpringEvent customSpringEvent = new CustomSpringEvent(this, message);
    applicationEventPublisher.publishEvent(customSpringEvent);
  }

}