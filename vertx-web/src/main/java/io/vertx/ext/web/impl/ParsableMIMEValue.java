package io.vertx.ext.web.impl;

import io.vertx.codegen.annotations.Nullable;
import io.vertx.ext.web.LanguageHeader;
import io.vertx.ext.web.MIMEHeader;

public class ParsableMIMEValue extends ParsableHeaderValue implements MIMEHeader{

  private String component;
  private String subComponent;
  
  private int orderWeight;
  
  public ParsableMIMEValue(String headerContent) {
    super(headerContent);
    component = null;
    subComponent = null;
  }

  @Override
  public String component() {
    return component;
  }
  
  @Override
  public String subComponent() {
    return subComponent;
  }
  
  @Override
  protected void ensureHeaderProcessed() {
    super.ensureHeaderProcessed();
    if(component == null){
      HeaderParser.parseMIME(
            value(),
            this::setComponent,
            this::setSubComponent
          );
      orderWeight = STAR == component ? 0 : 1;
      orderWeight += STAR == subComponent ? 0 : 2;
    }
  }
  
  private void setComponent(String component) {
    this.component = STAR.equals(component) ? STAR : component;
  }
  
  private void setSubComponent(String subComponent) {
    this.subComponent = STAR.equals(subComponent) ? STAR : subComponent;
  }
    
  @Override
  protected int weightedOrderPart2(){
    return orderWeight;
  }
}