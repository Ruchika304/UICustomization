//package ue;

import com.yantra.yfs.japi.*;
import com.yantra.yfs.japi.ue.*;
import java.util.*;
import org.w3c.dom.*;
import java.io.*;

public class MTSCollectionCreditCardUEImpl implements YFSCollectionCreditCardUE {
	public YFSExtnPaymentCollectionOutputStruct	collectionCreditCard(YFSEnvironment env, 
YFSExtnPaymentCollectionInputStruct inStruct) throws YFSUserExitException{
		YFSExtnPaymentCollectionOutputStruct outStruct = new YFSExtnPaymentCollectionOutputStruct();

		outStruct.authorizationAmount=inStruct.requestAmount;
		outStruct.tranAmount=inStruct.requestAmount;	
		       
		outStruct.authorizationId =inStruct.orderNo;                   //authorization id 
		System.out.println (" AUTHORIZATION ID = "+inStruct.authorizationId);
		outStruct.authorizationExpirationDate="20200501151710";		// date format is: YYYYMMDDHHMISS (HH is a 24 hour format).
		outStruct.tranType=inStruct.chargeType;		
		outStruct.tranRequestTime="";
		outStruct.tranReturnCode="return code";
		outStruct.tranReturnMessage="Auth user exit";
		outStruct.tranReturnFlag="N";
		outStruct.requestID="1234567890";
		outStruct.internalReturnCode="TER";
		outStruct.internalReturnFlag="N";
		outStruct.internalReturnMessage="CC user exit";
		outStruct.authCode="TESTCCCARD";
		outStruct.authAVS="AVS-CODE";
		outStruct.authReturnCode="RETURN CODE";
		outStruct.authReturnFlag="N";
		outStruct.authReturnMessage= inStruct.chargeType + " " + inStruct.paymentType;
		outStruct.authTime="20070109T12:21:30";				// date format is: YYYYMMDDTHHMISS (HH is a 24 hour format).
		System.out.println (" AUTH TIME : " + outStruct.authTime );
		outStruct.retryFlag="N";
		System.out.println("I am in test");
		return outStruct;
	}

}
