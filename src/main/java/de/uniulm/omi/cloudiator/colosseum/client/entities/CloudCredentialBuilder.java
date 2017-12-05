package de.uniulm.omi.cloudiator.colosseum.client.entities;

public class CloudCredentialBuilder {

  private String user;
  private String secret;
  private Long cloud;
  private Long tenant;

  public CloudCredentialBuilder user(String user) {
    this.user = user;
    return this;
  }

  public CloudCredentialBuilder secret(String secret) {
    this.secret = secret;
    return this;
  }

  public CloudCredentialBuilder cloud(Long cloud) {
    this.cloud = cloud;
    return this;
  }

  public CloudCredentialBuilder tenant(Long tenant) {
    this.tenant = tenant;
    return this;
  }

  public CloudCredential build() {
    return new CloudCredential(user, secret, cloud, tenant);
  }
}
