package com.paysecure.utilities;

import java.util.Arrays;
import java.util.List;
//hsgd kkqx jjho zghz
import org.testng.annotations.DataProvider;



public class DataProviders {

	@DataProvider(name = "cardNames")
	public Object[][] getCardNames() {
		return new Object[][] {

				{ "52000000****0015" }
//
//				{ "55320440****4659" },
//
//				{ "54312400****4007" },
//
//				{ "52000000****0015" },

		};
	}

	

}
