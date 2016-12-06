package ull.mvc.model;
/**
 * @author Orlandy Ariel Sánchez A.
 */
public class Prduct
{
	private String name;
	private double cost;
	public Prduct()
	{
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public double getCost()
	{
		return cost;
	}
	public void setCost(double d)
	{
		this.cost = d;
	}
	@Override
	public String toString()
	{
		return name;
	}
}
