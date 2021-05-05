package com.citi.membership.card.dao;

import java.util.List;

import com.citi.membership.card.model.CardDetailsRequest;
import com.citi.membership.card.model.CardDetailsResponse;

public interface CardDetailsDao {

	List<String> getCards(String cardNum);

	CardDetailsResponse getCardDetails(String carnNum);

	CardDetailsResponse getAllCardDetails(CardDetailsRequest cardDetailsRequest);

}
