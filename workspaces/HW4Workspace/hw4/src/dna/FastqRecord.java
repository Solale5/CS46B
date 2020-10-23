
package dna;

/**
 * 
 * @author solomonalemu
 *
 */
public class FastqRecord implements DNARecord 
{
	private String defline;
	private String sequence;
	private String quality;
	
	/**
	 * 
	 * @param defline is the start of the file and should be the @ character
	 * @param sequence is the sequence of letters
	 * @param quality is the ! at the end
	 * @throws RecordFormatException
	 */
	public FastqRecord(String tdefline, String sequence, String quality) throws RecordFormatException
	{
		
		String theErrorMessage;
		char theAtSign = '@';
		//test to see if the first character is the @character if not throws RecordFormatException
		if(tdefline.charAt(0) != theAtSign)
		{
			theErrorMessage = "the defline does not begin with @: ";
			
			
			RecordFormatException err = new RecordFormatException(theErrorMessage);
			throw err;
		}
		else
		{
			
		
			this.defline = tdefline;
		this.sequence = sequence;
		this.quality = quality;
		}
	}
	
	/**
	 * @param x takes an object as a parameter
	 */
	public boolean equals(Object x)
	{
		// casts the object as an instance of FastqRecord
		FastqRecord that = (FastqRecord)x;
		//checks to see if all three have the same instance variable
		if(this.defline.compareTo(that.defline) == 0 && this.sequence.compareTo(that.sequence)==0 && this.quality.compareTo(that.quality)==0 )
		{
			return true;
		}
		//if they don't returns false
		else 
		{
		return false;
		}
	}
	
	
	/**
	 * 
	 * @return true if the quality has at least 1 @ and one #
	 */
	public boolean qualityIsLow()
	{
		if(this.quality.contains("$")&& this.quality.contains("#"))
		{
	
			return true;
			
		}
		
		
			
			return false;
		
	}
	
	
	//
	// Complete this. Return the sum of the hash codes of defline, sequence, and quality.
	//
	public int hashCode()
	{
		return defline.hashCode() + sequence.hashCode() + quality.hashCode();
	}
	
	public String getDefline()
	{
		return this.defline;
		
	}
	public String		getSequence()
	{
		return this.sequence;
		
	}
	
	
	
	
	
	}

