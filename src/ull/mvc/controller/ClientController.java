package ull.mvc.controller;

import java.util.List;

import ull.mvc.model.Client;
import ull.mvc.view.ClientView;
/**
 * @author Orlandy Ariel Sánchez A.
 */
public class ClientController
{
	private List<Client> listClientsModel;
	private ClientView clientView;
	/**
	 * Constructor 
	 * @param model, list of client (model)
	 * @param view, view
	 */
	public ClientController(List<Client> model, ClientView view)
	{
		listClientsModel = model;
		clientView = view;
	}
	//add one client to list
	public void addClient(Client client)
	{
		listClientsModel.add(client);
	}
	/**
	 * get the client of list into position determined
	 * @param pos, position
	 * @return
	 */
	public Client getClient(int pos)
	{
		return listClientsModel.get(pos);
	}
	/**
	 * update the view
	 */
	public void updateView()
	{
		clientView.printListClients(listClientsModel);
	}
}
