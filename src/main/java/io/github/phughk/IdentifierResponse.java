package io.github.phughk;

public class IdentifierResponse {
  private final Integer count;
  private final String uuid;
  private final String hostname;
  private final String ip;

  public IdentifierResponse(Integer count, String uuid, String hostname, String ip) {
    this.count = count;
    this.uuid = uuid;
    this.hostname = hostname;
    this.ip = ip;
  }

  public Integer getCount() {
    return count;
  }

  public String getUuid() {
    return uuid;
  }

  public String getHostname() {
    return hostname;
  }

  public String getIp() {
    return ip;
  }
}
