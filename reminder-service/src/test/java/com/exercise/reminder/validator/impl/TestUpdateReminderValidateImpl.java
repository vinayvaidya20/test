package com.exercise.reminder.validator.impl;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.constraints.AssertTrue;

import org.apache.commons.lang.StringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.exercise.reminder.constants.ReminderConstants;
import com.exercise.reminder.controller.ReminderAppController;
import com.exercise.reminder.entity.ReminderRequest;
import com.exercise.reminder.exception.ExceptionCodes;
import com.exercise.reminder.exception.ExceptionTypes;
import com.exercise.reminder.exception.ReminderException;
import com.exercise.reminder.service.ReminderService;
import com.exercise.reminder.util.DateUtil;
import com.exercise.reminder.validator.ReminderValidator;
@RunWith(MockitoJUnitRunner.class)
public class TestUpdateReminderValidateImpl {
	
	
	@InjectMocks
	UpdateReminderValidateImpl reminderValidator;

	@Test
	public void testValidate() throws ReminderException, ParseException {
		boolean flag =reminderValidator.validate(createReminderRequest());
		assertTrue(flag);

	}

	
	private ReminderRequest createReminderRequest() throws ParseException {
		ReminderRequest reminderRequest = new ReminderRequest();
		
		reminderRequest.setId(1);
		
		return reminderRequest;
	}

}
