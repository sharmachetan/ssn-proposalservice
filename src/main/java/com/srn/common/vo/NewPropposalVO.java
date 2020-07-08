package com.srn.common.vo;


import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class NewPropposalVO {


    String title;
    String owner;
    String docType;
    List<String> contributors;
    List<String> versions;
    String lastUpdated;
    String latestVersion;




}
