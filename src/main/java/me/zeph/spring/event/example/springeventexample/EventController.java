package me.zeph.spring.event.example.springeventexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {

  @Autowired
  private CustomSpringEventPublisher customSpringEventPublisher;

  @RequestMapping(value = "/event")
  public String fireEvent(@RequestParam("message") String message) {
    customSpringEventPublisher.doStuffAndPublishAnEvent(message);
    return "event with" + message + " fire success";
  }
}
