package ull.mvc.controller;

import java.util.List;
import java.util.ArrayList;

import ull.mvc.model.Client;
import ull.mvc.model.Prduct;
import ull.mvc.view.ClientView;

public class Main
{
	public static void main(String[] args)
	{
		List<Client> tList = createClientsDemo();//cretate model
		
		ClientView view = new ClientView();//create vew
		
		ClientController controller = new ClientController(tList, view); //create controller
		
		controller.updateView();
	}
	/**
	 * method for create ListClient demo
	 * @return
	 */
	public static List<Client> createClientsDemo()
	{
		//create produts
		Prduct t_product1= new Prduct();
		t_product1.setName("Laptop");
		t_product1.setCost(890.90);
		
		Prduct t_product2= new Prduct();
		t_product2.setName("Photo camera");
		t_product2.setCost(205.70);
		
		//cretate clients
		Client client1= new Client();
		client1.setFirtsName("Orlandy");
		client1.setLastName("Sáchez");
		client1.setAddress("La Laguna");
		client1.setTelephone(111111111);
		client1.setFavoriteProduct(t_product1);
		
		Client client2= new Client();
		client2.setFirtsName("Ariel");
		client2.setLastName("Acosta");
		client2.setAddress("La Laguna");
		client2.setTelephone(22222222);
		client2.setFavoriteProduct(t_product2);
		
		//create list and add clients to list
		List<Client> t_list= new ArrayList<>();
		t_list.add(client1);
		t_list.add(client2);
		
		return t_list;
	}

}
