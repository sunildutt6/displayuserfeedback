package com.sunil.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunil.entities.Feedback;
import com.sunil.repos.FeedbackRepository;

@Service
public class FeedbackServiceImpl implements FeedbackService {

	@Autowired
	FeedbackRepository repository;

	@Override
	public Feedback saveFeedback(Feedback feedback) {
		return repository.save(feedback);
	}

	@Override
	public Feedback updateFeedback(Feedback feedback) {
		return repository.save(feedback);
	}

	@Override
	public void deleteFeedback(Feedback feedback) {
		repository.delete(feedback);
	}

	@Override
	public Iterable<Feedback> findAllFeedback() {
		return repository.findAll();
	}

	@Override
	public void deleteFeedbackById(int id) {
		repository.deleteById(id);
	}

	@Override
	public Feedback findFeedbackById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
