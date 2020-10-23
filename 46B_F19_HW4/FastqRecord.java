package dna;

//
// FastqRecord contains the defline, sequence, and quality string
// from a record in a fastq file.
//


public class FastqRecord implements DNARecord 
{
	//
	// Add a precondition check: throw RecordFormatException if the 1st char of the defline is 
	// not '@'. You will have to change the ctor declaration to say that it throws
	// the exception. The exception should contain a useful informative message.
	//
	public FastqRecord(String defline, String sequence, String quality)
	{
	}
	
	
	// 
	// Provide the 2 methods that satisfy the interface.
	//

	

	//
	// Provide an equals() method that checks for deep equality of all 3 instance variables. 
	// When checking string variables, be sure to do it like this:  
	//              this.defline.equals(that.defline) 
	// and not like this:  
	//              this.defline == that.defline
	//
	
	
	//
	// Complete this according to the assignment instructions.
	//
	public boolean qualityIsLow()
	{

	}
	
	
	//
	// Complete this. Return the sum of the hash codes of defline, sequence, and quality.
	//
	public int hashCode()
	{

	}
}
