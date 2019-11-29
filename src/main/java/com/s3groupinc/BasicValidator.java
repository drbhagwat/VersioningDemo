package com.s3groupinc;

public class BasicValidator implements Validator {
  private final int CODE_MAX_LENGTH = 10;
  private String codeInvalidLength = "The value of the code key in the Json input should have maximum ${CODE_MAX_LENGTH} characters.";
  private String codeMandatory = "The code key is missing in the Json input. Please provide the code key with a value.";

  public void validate(String property) throws Exception {
    if (property == null) {
      throw new Exception(codeMandatory);
    }
  }

  public void validate(int length, int maxLength) throws Exception {
    if (length > maxLength) {
      throw new Exception(codeInvalidLength);
    }
  }
}
