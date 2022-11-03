package com.sunil.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sunil.entities.Feedback;
import com.sunil.service.FeedbackService;

@Controller
public class FeedbackController {

	@Autowired
	FeedbackService service;

	@RequestMapping("/feedbackform")
	public String showFeedback() {
		return "feedback";
	}

	@RequestMapping("/saveFeedback")
	public String saveFeedback(@ModelAttribute("feedback") Feedback feedback, ModelMap model) {
		Feedback saveFeedback = service.saveFeedback(feedback);
		String message = "Feedback received with id: " + saveFeedback.getId();
		model.addAttribute("message", message);
		return "feedback";
	}

	@RequestMapping("/displayFeedback")
	public String displayFeedback(ModelMap model) {
		Iterable<Feedback> feedbacks = service.findAllFeedback();
		model.addAttribute("feedbacks", feedbacks);
		return "displayFeedback";
	}

}
