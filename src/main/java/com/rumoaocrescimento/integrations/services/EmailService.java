package com.rumoaocrescimento.integrations.services;

import com.rumoaocrescimento.integrations.dto.EmailDTO;

public interface EmailService {
	
	void sendEmail(EmailDTO dto);

}
