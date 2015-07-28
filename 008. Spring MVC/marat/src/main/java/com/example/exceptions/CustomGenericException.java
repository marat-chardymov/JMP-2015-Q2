package com.example.exceptions;

/**
 * Created by Marat_Chardymau on 7/28/2015.
 */
public class CustomGenericException extends RuntimeException {
  private String errorCode;
  private String errorMessage;

  public CustomGenericException(String errorCode, String errorMessage) {
    this.errorCode = errorCode;
    this.errorMessage = errorMessage;
  }

  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }
}
