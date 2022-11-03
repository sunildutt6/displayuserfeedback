package com.sunil.service;

import com.sunil.entities.Feedback;

public interface FeedbackService {
	
	public Feedback saveFeedback(Feedback feedback);
	
	public Feedback updateFeedback(Feedback feedback);
	
	public void deleteFeedbackById(int id);
	
	public void deleteFeedback(Feedback feedback);
	
	public Feedback findFeedbackById(int id);
	
	public Iterable<Feedback> findAllFeedback();

}
