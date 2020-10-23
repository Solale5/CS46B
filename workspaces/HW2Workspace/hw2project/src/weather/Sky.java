package weather;
import java.util.ArrayList;
public class Sky 
{

private ArrayList<Cloud> clouds;

public Sky() 
{
	clouds =  new ArrayList<Cloud>(100);
}


public boolean add(Cloud c)
{
	
	clouds.add(c);
	return true;
}



public float  getMeanHeight()
{
	float total = 0;
	float size = clouds.size();
	
	 
	if(!clouds.isEmpty())
	{
		for(Cloud s: clouds)
		{
		total += s.getHeight();
		
		}
		float meanHeight =  (total / size);
		return meanHeight;
	}
	
	return 0;
}

public static void main(String[] args) {

StratusCloud strat = new StratusCloud(100, 1000); if (!strat.rain().startsWith("It is raining"))
System.out.println("Bad StratusCloud::rain"); CumulusCloud cumu = new CumulusCloud(200, 2000);
if (!cumu.rain().startsWith("It is raining"))
System.out.println("Bad CumulusCloud::rain"); CirrusCloud cirr = new CirrusCloud(300, 3000);
if (!cirr.rain().startsWith("I cannot make"))
System.out.println("Bad CirrusCloud::rain"); Sky sky = new Sky();
sky.add(strat);
sky.add(cumu);
sky.add(cirr);
float mean = sky.getMeanHeight(); if (mean < 1799 || mean > 1801);
System.out.println("Bad mean height: expected 1800, saw " + mean); System.out.println("Everything (else) is ok");












}



}
