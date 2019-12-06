package com.java.myunjub.designPattern;

import com.java.myunjub.designPattern.Builder.BuilderVo;
import com.java.myunjub.designPattern.Builder.BuilderVo.Builder;
import com.java.myunjub.designPattern.Builder.BuilderVoDefaultValue;
import org.junit.Test;


public class BuilderTest {

  @Test
  public void legalBuilderTest() {
    final Builder builder = new Builder();
    final BuilderVo builderVo = builder
        .withString("ABCD")
        .withInt(1234)
        .withFloat(1234.0F)
        .build();
  }

  @Test(expected = IllegalStateException.class)
  public void illegalBuilderTest() {
    final Builder builder = new Builder();
    final BuilderVo builderVo = builder
        .withString("ABCD")
        .withInt(1234)
        .build();
  }

  @Test
  public void builderWithDefaultValueTest(){
    final BuilderVoDefaultValue.Builder builder = new BuilderVoDefaultValue.Builder();
    final BuilderVoDefaultValue builderVoDefaultValue = builder
        .withInt(1234)
        .withFloat(1234.0F)
        .build();
  }
}
