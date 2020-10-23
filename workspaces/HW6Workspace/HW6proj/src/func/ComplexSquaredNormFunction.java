package func;

public class ComplexSquaredNormFunction implements DoubleFunctionOfTwoInts 
{

	

	@Override
	public double fOfXY(int x, int y)
	{
		return Math.sqrt((x*x)+(y*y))* Math.sqrt((x*x)+(y*y))  ;
	}
	
	
	@Override
	public String getName()
	{
		return "Squared Function";
	}
	
	
	
	
	
	
	
	
}
