package com.revature.services;

import java.util.List;

import com.revature.dtos.NewInterviewData;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.revature.dtos.AssociateInterview;
import com.revature.models.Interview;

public interface InterviewService {

	Interview save(Interview i);
	Interview update(Interview i);
	Interview delete(Interview i);
	
	List<Interview> findAll();
	Interview addNewInterview(NewInterviewData i);
	Page<Interview> findAll(Pageable page);
	Page<AssociateInterview> findInterviewsPerAssociate(Pageable page);

}
