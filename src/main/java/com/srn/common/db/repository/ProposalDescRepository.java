package com.srn.common.db.repository;

import com.srn.common.db.models.DocDescription;
import com.srn.common.pojo.DocumentPojo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface ProposalDescRepository extends MongoRepository<DocDescription,String> {




}
