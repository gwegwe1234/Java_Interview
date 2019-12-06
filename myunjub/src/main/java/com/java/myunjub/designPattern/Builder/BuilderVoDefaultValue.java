package com.java.myunjub.designPattern.Builder;

public class BuilderVoDefaultValue {

  private String builderStringAttribute;
  private Integer builderIntAttriute;
  private Float builderFloatAttribute;

  public BuilderVoDefaultValue() {
  }

  public BuilderVoDefaultValue(String builderStringAttribute, Integer builderIntAttriute,
      Float builderFloatAttribute) {
    this.builderStringAttribute = builderStringAttribute;
    this.builderIntAttriute = builderIntAttriute;
    this.builderFloatAttribute = builderFloatAttribute;
  }

  public static class Builder {

    private String builderStringAttribute = "Default Value";
    private Integer builderIntAttriute;
    private Float builderFloatAttribute;

    public Builder withString(final String builderStringAttribute) {
      this.builderStringAttribute = builderStringAttribute;
      return this;
    }

    public Builder withInt(final Integer builderIntAttriute) {
      this.builderIntAttriute = builderIntAttriute;
      return this;
    }

    public Builder withFloat(final Float builderFloatAttribute) {
      this.builderFloatAttribute = builderFloatAttribute;
      return this;
    }

    public BuilderVoDefaultValue build() {
      if (builderIntAttriute == null ||
          builderFloatAttribute == null) {
        throw new IllegalStateException("Cannot create BuilderVoDefaultValue");
      }
      return new BuilderVoDefaultValue(builderStringAttribute, builderIntAttriute,
          builderFloatAttribute);
    }
  }
}


