package com.sunil.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunil.entities.Feedback;
import com.sunil.repos.FeedbackRepository;
import com.sunil.service.FeedbackService;

@RestController
@RequestMapping("/feedback")
public class FeedbackRestController {

	@Autowired
	FeedbackService service;

	@GetMapping
	public Iterable<Feedback> getFeedback() {
		return service.findAllFeedback();
	}

	@PostMapping
	public Feedback create(@RequestBody Feedback feedback) {
		return service.saveFeedback(feedback);
	}

	@PutMapping
	public Feedback update(@RequestBody Feedback feedback) {
		return service.saveFeedback(feedback);
	}

	@GetMapping("/{id}")
	public Feedback getFeedback(@PathVariable("id") int id) {
		return service.findFeedbackById(id);
	}

	@DeleteMapping("/{id}")
	public void deleteFeedback(@PathVariable("id") int id) {
		service.deleteFeedbackById(id);
	}
}
