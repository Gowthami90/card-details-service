package com.citi.membership.card.dao;

import java.util.List;

import com.citi.membership.card.model.CardDetailsRequest;
import com.citi.membership.card.model.CardDetailsResponse;

public class CardDetailsDaoImpl implements CardDetailsDao{

	@Override
	public List<String> getCards(String cardNum) {
		
		//1.get the request from service
		//2.prepare request for the db
		//3.call db and get the response
		//4.if the response is success then prepare dao response else prepare exception
		//5.send either daorep or exception to the service
		return null;
	}

	@Override
	public CardDetailsResponse getCardDetails(String carnNum) {
		        //1.get the request from service
				//2.prepare request for the db
				//3.call db and get the response
				//4.if the response is success then prepare dao response else prepare exception
				//5.send either daorep or exception to the service

		return null;
	}

	@Override
	public CardDetailsResponse getAllCardDetails(CardDetailsRequest cardDetailsRequest) {
		        //1.get the request from service
				//2.prepare request for the db
				//3.call db and get the response
				//4.if the response is success then prepare dao response else prepare exception
				//5.send either daorep or exception to the service

		return null;
	}

}
