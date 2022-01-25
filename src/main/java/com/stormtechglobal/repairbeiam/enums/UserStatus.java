package com.stormtechglobal.repairbeiam.enums;

public enum UserStatus {
  VERIFIED("VERIFIED"),
  PENDING("PENDING");
  private String userStatus;

  private UserStatus(String userStatus) {
    this.userStatus = userStatus;
  }

  public String getUserStatus() {
    return userStatus;
  }
}
