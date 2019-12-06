package com.java.myunjub.designPattern.Builder;

public class BuilderVo {

  private String builderStringAttribute;
  private Integer builderIntAttriute;
  private Float builderFloatAttribute;

  public BuilderVo() {
  }

  public BuilderVo(String builderStringAttribute, Integer builderIntAttriute,
      Float builderFloatAttribute) {
    this.builderStringAttribute = builderStringAttribute;
    this.builderIntAttriute = builderIntAttriute;
    this.builderFloatAttribute = builderFloatAttribute;
  }

  public static class Builder {

    private String builderStringAttribute;
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

    public BuilderVo build() {
      if (builderStringAttribute == null ||
          builderIntAttriute == null ||
          builderFloatAttribute == null) {
        throw new IllegalStateException("Cannot create BuilderVo");
      }
      return new BuilderVo(builderStringAttribute, builderIntAttriute, builderFloatAttribute);
    }
  }
}

