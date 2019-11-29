package com.s3groupinc;

public abstract class ValidatorDecorator implements Validator {
  protected Validator validator;

  public ValidatorDecorator(Validator newValidator) {
    validator = newValidator;
  }

  @Override
  public void validate(String property) throws Exception {
    validator.validate(property);
  }

  @Override
  public void validate(int length, int maxLength) throws Exception {
    validator.validate(length, maxLength);
  }
}
