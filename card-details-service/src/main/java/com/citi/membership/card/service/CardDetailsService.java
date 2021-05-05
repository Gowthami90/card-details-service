package com.citi.membership.card.service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.citi.membership.card.model.CardDetailsRequest;
import com.citi.membership.card.model.CardDetailsResponse;

public interface CardDetailsService {

	List<String> getCards(String cardNum);

	CardDetailsResponse getCardDetails(String carnNum);

	CardDetailsResponse getAllCardDetails(CardDetailsRequest cardDetailsRequest);

}