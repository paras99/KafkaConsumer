package com.PODownload.Consumer.repository;

import com.PODownload.Consumer.model.POModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PORepository  extends JpaRepository<POModel,Integer>{

}
