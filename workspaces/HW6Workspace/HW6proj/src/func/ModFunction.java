package func;

public class ModFunction implements DoubleFunctionOfTwoInts
{

	
	
	@Override
	public double fOfXY(int x, int y)
	{
		return x % y;
	}
	
	
	@Override
	public String getName()
	{
		return "Modulo";
	}
	
	
	
	
	
	
	
	
}
