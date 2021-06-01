package com.SpringMessagingSample.springRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.SpringMessagingSample.Model.EmpDetails;

public interface EmpDetailsRepo extends MongoRepository<EmpDetails, Integer>{

}
