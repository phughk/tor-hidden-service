package io.github.phughk;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;

@RestController
public class Endpoint {
  private static final AtomicInteger counter = new AtomicInteger(0);

  @GetMapping(path = "/count")
  public Integer count() {
    return counter.incrementAndGet();
  }
}
