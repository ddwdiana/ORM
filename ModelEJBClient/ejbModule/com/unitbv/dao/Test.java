package com.unitbv.dao;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.unitbv.dto.ClientB2BDTO;
import com.unitbv.dto.UserDetailsDTO;
import com.unitbv.dto.WineDTO;
import com.unitbv.dto.WineType;

public class Test {

	public static void main(String[] args) throws NamingException{
		InitialContext ini = new InitialContext();
		System.out.println("ok");
		UserDAORemote us = (UserDAORemote) ini.lookup("java:global/WineShop/ModelEJB/UserDAO!com.unitbv.dao.UserDAORemote");
		ClientB2BDAORemote clientb = (ClientB2BDAORemote) ini.lookup("java:global/WineShop/ModelEJB/ClientB2BDAO!com.unitbv.dao.ClientB2BDAORemote");
		
		WineDAORemote wined = (WineDAORemote) ini.lookup("java:global/WineShop/ModelEJB/WineDAO!com.unitbv.dao.WineDAORemote");
		System.out.println("out");
		WineDTO wine = new WineDTO("wine","descr",WineType.DEMIDRY, "variety", 744);
		//wined.add(wine);
		//WineDTO wine1 = wined.getById(1);
		 UserDetailsDTO uas = new UserDetailsDTO("Zorilor", "a@a.c", "Sss", "dssd");
		// us.update(uas);
		UserDetailsDTO dto =		us.getById(1);
System.out.println(dto.toString());
		//ClientB2BDTO dto = new ClientB2BDTO(true, "company", "cui", false, uas);
		System.out.println("out");

		//clientb.add(dto);
		//ClientB2BDTO dto1 = clientb.getById(1);
		//System.out.println(dto1.companyName);
		// UserDetailsDTO uas = new UserDetailsDTO("Zorilor", "a@a.c", "Sss", "ddddssd");

		
//		/us.add(uas);
		
	}

}
