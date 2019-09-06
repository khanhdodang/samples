package models;

import java.util.List;

public class GetDeviceResponseModel {
  List<Device> privateDevices;
  List<Device> favoriteDevices;
  List<Device> cloudDevices;

  public List<Device> getPrivateDevices() {
    return privateDevices;
  }

  public void setPrivateDevices(List<Device> privateDevices) {
    this.privateDevices = privateDevices;
  }

  public List<Device> getFavoriteDevices() {
    return favoriteDevices;
  }

  public void setFavoriteDevices(List<Device> favoriteDevices) {
    this.favoriteDevices = favoriteDevices;
  }

  public List<Device> getCloudDevices() {
    return cloudDevices;
  }

  public void setCloudDevices(List<Device> cloudDevices) {
    this.cloudDevices = cloudDevices;
  }
}
