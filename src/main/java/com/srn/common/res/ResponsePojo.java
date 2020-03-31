package com.srn.common.res;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import jdk.nashorn.internal.objects.annotations.Getter;

@JsonSerialize
public class ResponsePojo {


   private String responseCode;
   private String messageBody;
   private String resTimestamp;





}
