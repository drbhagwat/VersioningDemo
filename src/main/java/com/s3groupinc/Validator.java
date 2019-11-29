package com.s3groupinc;

public interface Validator {
  void validate(String property) throws Exception;
  void validate(int length, int maxLength) throws Exception;
}
