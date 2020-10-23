package func;

public class HypotFunction implements DoubleFunctionOfTwoInts

{


	@Override
	public double fOfXY(int x, int y)
	{
		return Math.hypot(x, y);
	}
	
	
	@Override
	public String getName()
	{
		return "Hypotenuse";
	}
	
	
	
	
	
}
