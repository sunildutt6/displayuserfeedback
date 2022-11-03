package com.sunil;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sunil.entities.Feedback;
import com.sunil.repos.FeedbackRepository;

@SpringBootTest
class UserfeedbackApplicationTests {

	@Autowired
	FeedbackRepository repos;

	@Test
	void testFeedback() {
		Feedback feedback = new Feedback();

		feedback.setName("sunil");
		feedback.setEmail("s@k.com");
		feedback.setMessage("This is amazing and awesome");

		repos.save(feedback);
	}

}
