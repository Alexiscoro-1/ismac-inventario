package com.distribuida.principal;

import java.util.List;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.clientesDAO;
import com.distribuida.entities.clientes;

public class principalclientes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		clientesDAO clientesDAO = context.getBean("clientesDAOImpl", clientesDAO.class);

		//Add
		clientes cliente1 = new clientes(0,"Alexis","Av.60 de junio","0954632179","alexis2002@gmail.com");
		//clientesDAO.add(cliente1);
		
		//Up
		clientes cliente2 = new clientes(6,"Andres","Av.5 de agosto","0901245632","andres0245@gmail.com");
		clientesDAO.up(cliente2);
		
		//del
		//clientesDAO.del(1);
		System.out.println("****************** DEL ************"+clientesDAO.findOne(1));
		
		//findAll
		//List<clientes> cliente = clientesDAO.findALL();
		clientesDAO.findALL().forEach(item -> {System.out.println(item.toString());
		});
		
		context.close();
	}

}


