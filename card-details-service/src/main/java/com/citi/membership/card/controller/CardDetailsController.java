 package com.citi.membership.card.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.citi.membership.card.model.CardDetails;
import com.citi.membership.card.model.CardDetailsRequest;
import com.citi.membership.card.model.CardDetailsResponse;
@CrossOrigin(origins = "*", allowedHeaders = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RestController
@RequestMapping(value="/v1")
public class CardDetailsController {
	@RequestMapping(value="/cards/{cardNum}",method=RequestMethod.GET,produces="application/json")
	@ResponseBody
	public List<String> getCards(   @PathVariable("CardNUm") String carnNum,
			                        @RequestHeader(name="clientId",required=true) String clientId,   
			                        @RequestHeader(name="requestId",required=true) String requestId,
			                        @RequestHeader(name="msgTs",required=true) String msgTs){
		//get the request from consumer
		//validate the request
		//prepare request for the service
		//call service and get the service response 
		//handle the exception if any comes from the service class
		//prepare the controller response
		return null;
	}
	
	@RequestMapping(value="/carddeatils/{cardNum}",method=RequestMethod.GET,produces="application/json")
	@ResponseBody
	
	public CardDetailsResponse getCardDetails(  @PathVariable("CardNUm") String carnNum,
                                                @RequestHeader(name="clientId",required=true) String clientId,   
                                                @RequestHeader(name="requestId",required=true) String requestId,
                                                @RequestHeader(name="msgTs",required=true) String msgTs){
		//get the request from consumer
		//validate the request
		//prepare request for the service
		//call service and get the service response 
		//handle the exception if any comes from the service class
		//prepare the controller response
		
             CardDetailsResponse response= new CardDetailsResponse();
		
		     List<CardDetails> cardDetailsList=new ArrayList<CardDetails>();
		     
		     CardDetails cardDetails1 = new CardDetails();
		     
		     cardDetails1.setCardNum("0552115641236521");
		     cardDetails1.setPrimary(true);
		     cardDetails1.setPastDue(false);
		     cardDetails1.setFname("vijay");
		     cardDetails1.setLname("tech");
		     cardDetails1.setProductType("pa");
		     cardDetails1.setStatus("Active");
		     
            CardDetails cardDetails2 = new CardDetails();
		     
		     cardDetails2.setCardNum("0552115641230022");
		     cardDetails2.setPrimary(false);
		     cardDetails2.setPastDue(false);
		     cardDetails2.setFname("vijay");
		     cardDetails2.setLname("tech");
		     cardDetails2.setProductType("pa");
		     cardDetails2.setStatus("Active");
		     
            CardDetails cardDetails3 = new CardDetails();
		     
		     cardDetails3.setCardNum("0552115641230023");
		     cardDetails3.setPrimary(false);
		     cardDetails3.setPastDue(false);
		     cardDetails3.setFname("vijay");
		     cardDetails3.setLname("tech");
		     cardDetails3.setProductType("pa");
		     cardDetails3.setStatus("Active");
		     
		     cardDetailsList.add(cardDetails1);
		     cardDetailsList.add(cardDetails2);
		     cardDetailsList.add(cardDetails3);

		     
		     
		     
             response.setCardDetails(cardDetailsList);

		     return  response;
		
		
	}
	
	
	@RequestMapping(value="/allcards/{cardNum}",method=RequestMethod.POST,produces="application/json",consumes="application/json")
	@ResponseBody
	public CardDetailsResponse getAllCardDetails(@RequestBody CardDetailsRequest cardDetailsRequest,
			                                     @RequestHeader(name="clientId",required=true) String clientId,   
                                                 @RequestHeader(name="requestId",required=true) String requestId,
                                                 @RequestHeader(name="msgTs",required=true) String msgTs){ 
				                                 				                               
		//get the request from consumer
		//validate the request
		//prepare request for the service
		//call service and get the service response 
		//handle the exception if any comes from the service class
		//prepare the controller response
	                                  
		return null;
		
	}
	
	@RequestMapping(value="/health",method=RequestMethod.GET,produces="application/json")
	@ResponseBody
	public String healthCheck() {
		return "service is up and running";
		
	}

}
