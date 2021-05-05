package com.citi.membership.card.service;

import java.util.List;

import com.citi.membership.card.model.CardDetailsRequest;
import com.citi.membership.card.model.CardDetailsResponse;

public class CardDetailsServiceImpl implements CardDetailsService {

	@Override
	public List<String> getCards(String cardNum) {
		
		//1.get therequest from controller
		//2.prepare the dao request
		//3.call dao and get the response
		//4.if the response is success prepare the service response else throw the exception to controller
		//5.return service response
		
		return null;
	}

	@Override
	public CardDetailsResponse getCardDetails(String carnNum) {
		
		//1.get therequest from controller
				//2.prepare the dao request
				//3.call dao and get the response
				//4.if the response is success prepare the service response else throw the exception to controller
				//5.return service response
				
		return null;
	}

	@Override
	public CardDetailsResponse getAllCardDetails(CardDetailsRequest cardDetailsRequest) {
		
		//1.get therequest from controller
				//2.prepare the dao request
				//3.call dao and get the response
				//4.if the response is success prepare the service response else throw the exception to controller
				//5.return service response
				
		return null;
	}

}
