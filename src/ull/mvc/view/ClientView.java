package ull.mvc.view;

import java.util.List;

import ull.mvc.model.Client;
/**
 * @author Orlandy Ariel Sánchez A.
 */
public class ClientView
{
	/**
	 * method for print list of client
	 * @param aList
	 */
	public void printListClients(List<Client> aList)
	{
		for (Client client : aList)
		{
			System.out.println(client);
		}
	}
}
