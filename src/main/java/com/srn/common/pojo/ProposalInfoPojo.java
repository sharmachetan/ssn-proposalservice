package com.srn.common.pojo;

import com.srn.common.db.models.DocDescription;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
public class ProposalInfoPojo {
    @NotNull
    String id;
    String docType;
    String proposalTitle;
    String owner;
    List<String> contributors;
    List<String> versions;
    ArrayList<String> supervisors;
    String firstCreated;
    String descDocId;

    String latestVersion;

}
