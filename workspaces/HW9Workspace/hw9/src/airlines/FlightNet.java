package airlines;

import java.util.HashSet;
/**
 * 
 * @author solomonalemu
 *
 */
public class FlightNet extends HashSet<Airport>
{
	/**
	 * 
	 * @param name is the name that we are checking availability of
	 * @return true or false depending on availability
	 */
	public boolean nameIsAvailable(String name)
	{
		for(Airport s: this)
		{
			if(s.getName().equals(name))
			{
				return false;
			}
		}
		return true;
	}
	
	/**
	 * 
	 * @param a1 is the first airport to be connected
	 * @param a2 is the second airport to be connected
	 */
	public void connect(Airport a1, Airport a2)
	{
		if(this.contains(a1)&&this.contains(a2))
		{
			a1.connectTo(a2);
			a2.connectTo(a1);
		}
	}
	/**
	 * 
	 * @param a1 is the first airport to be disconnected
	 * @param a2 is the first airport to be disconnected
	 */
	public void disconnect(Airport a1, Airport a2)
	{
		
		if(this.contains(a1)&&this.contains(a2))
		{
			a1.disconnectFrom(a2);
			a2.disconnectFrom(a1);
		}
		
	}
	
	/**
	 * 
	 * @param removeMe is the airport to be removed and disconnected from every other airport in this
	 */
	public void removeAndDisconnect(Airport removeMe)
	{
		HashSet<Airport> disconnectUs = new HashSet<Airport>();
		for(Airport s: this)
		{
			
			if(s.isConnectedTo(removeMe))
			{
				disconnectUs.add(s);
			}
			
		}
		for(Airport s: disconnectUs)
		{
			s.disconnectFrom(removeMe);
		}
		this.remove(removeMe);
		
		
	}
	/**
	 * 
	 * @param x arbitrary coordinate
	 * @param y arbitrary coordinate
	 * @param maximumDistance max distance someone would travel to an airport near by from (x,y)
	 * @return closest airport
	 */
	public Airport getAirportNearXY(int x, int y, int maximumDistance)
	{
		
		
		for(Airport s: this)
		{
			int theX = s.getX() - x;
			int theY = s.getY() - y;
			double distance = Math.hypot(theX, theY);
			
			if(distance < maximumDistance)
			{
				return s;
			}
		}
		
		return null;
	}
	
}
