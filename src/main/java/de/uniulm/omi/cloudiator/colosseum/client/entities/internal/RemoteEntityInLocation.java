package de.uniulm.omi.cloudiator.colosseum.client.entities.internal;

import de.uniulm.omi.cloudiator.colosseum.client.entities.enums.RemoteState;
import java.util.List;

/**
 * Created by Frank on 24.11.2015.
 */
public class RemoteEntityInLocation extends RemoteEntityInCloud {

  private Long location;

  public RemoteEntityInLocation(List<Link> links, String remoteId, RemoteState remoteState,
      String providerId, String swordId, Long cloud, List<Long> cloudCredentials, Long owner,
      Long location) {
    super(links, remoteId, remoteState, providerId, swordId, cloud, cloudCredentials, owner);
    this.location = location;
  }

  public RemoteEntityInLocation(String remoteId, RemoteState remoteState, String providerId,
      String swordId, Long cloud, List<Long> cloudCredentials, Long owner, Long location) {
    super(null, remoteId, remoteState, providerId, swordId, cloud, cloudCredentials, owner);
    this.location = location;
  }

  protected RemoteEntityInLocation() {

  }

  public Long getLocation() {
    return location;
  }

  public void setLocation(Long location) {
    this.location = location;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof RemoteEntityInLocation)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }

    RemoteEntityInLocation that = (RemoteEntityInLocation) o;

    return !(location != null ? !location.equals(that.location) : that.location != null);

  }

  @Override
  public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + (location != null ? location.hashCode() : 0);
    return result;
  }
}
