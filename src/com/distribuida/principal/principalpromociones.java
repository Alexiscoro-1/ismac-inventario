package com.distribuida.principal;


import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.promocionesDAO;
import com.distribuida.entities.promociones;

public class principalpromociones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		promocionesDAO promocionesDAO = context.getBean("promocionesDAOImpl", promocionesDAO.class);
		
		
		//Add
		promociones promociones1 = new promociones(0,"Promocion Navidad",30.5,new Date(),new Date());
		promocionesDAO.add(promociones1);
		
		//Up
		promociones promociones2 = new promociones(10,"Promocion viernes",20.5,new Date(),new Date());
		//promocionesDAO.up(promociones2);
		
		//del
		//promocionesDAO.del(10);
		System.out.println("****************** DEL ************"+promocionesDAO.findOne(1));
		
		//findAll
		//List<promociones> promociones = promocionesDAO.findALL();
		promocionesDAO.findALL().forEach(item -> {System.out.println(item.toString());
		});
		
		context.close();
	}

}

