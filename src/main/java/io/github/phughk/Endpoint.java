package io.github.phughk;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

@RestController
public class Endpoint {
  private static final AtomicInteger counter = new AtomicInteger(0);
  private static final UUID uuid = UUID.randomUUID();

  @GetMapping(path= "/info")
  public IdentifierResponse id() throws UnknownHostException {
    Integer count = counter.incrementAndGet();
    String hostname = InetAddress.getLocalHost().getHostName();
    String ip = InetAddress.getLocalHost().getHostAddress();
    return new IdentifierResponse(count, uuid.toString(), hostname, ip );
  }
}
