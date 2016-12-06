package ull.mvc.model;
/**
 * Class representing a client
 * @author Orlandy Ariel Sánchez A.
 *
 */
public class Client
{
	private String firtsName;
	private String lastName;
	private String address;
	private long telephone;
	private Prduct favoriteProduct;
	
	public Client()
	{
	}

	public String getFirtsName()
	{
		return firtsName;
	}

	public void setFirtsName(String firtsName)
	{
		this.firtsName = firtsName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public String getAddress()
	{
		return address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	public long getTelephone()
	{
		return telephone;
	}

	public void setTelephone(long telephone)
	{
		this.telephone = telephone;
	}

	public Prduct getFavoriteProduct()
	{
		return favoriteProduct;
	}

	public void setFavoriteProduct(Prduct favoriteProduct)
	{
		this.favoriteProduct = favoriteProduct;
	}
	@Override
	public String toString()
	{
		return "First Name:"+firtsName+", Last name:"+lastName+", Address:"+address+", Telephone:"+telephone+", Favorite Product:"+favoriteProduct;
	}
	
}
