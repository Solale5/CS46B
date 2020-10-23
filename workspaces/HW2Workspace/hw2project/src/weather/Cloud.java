package weather;

public class Cloud {

private float bottom;
private float top ;


/**
 * Constructor for the cloud class
 * @param ttop is the instance variable top
 * @param tbottom is the instance variable bottom
 * 
 */
public Cloud ( float tbottom, float ttop)
{
	
	
	 this.bottom = tbottom;
	  this.top = ttop;
	
}
/**
 * 
 * @return returns the height
 */
public float getHeight() 
{
	float theHeight = top - bottom;
	return theHeight;
}
/**
 * 
 * @return returns a string that says its raining
 * 
 */
public String  rain()
{
	String rain = "It is raining";
	return rain;
	
}




















}
