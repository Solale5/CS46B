package dna;

import java.io.*;

/**
 * 
 * @author solomonalemu
 *FastqReader class
 */
public class FastqReader 
{
	private BufferedReader theBufferedReader;
	
	/**
	 *  Constuctor for the FastqReader 
	 * @param br passes in the buffered reader
	 */
	public FastqReader(BufferedReader br)
	{
		
		theBufferedReader = br;
		
		
	}
	
	
	
	/**
	 * 
	 * @return Returns next record in the file, or null if EOF (end-of-file).
	 * @throws IOException because of br's methods
	 * @throws RecordFormatException if the fastqrecord format is wrong
	 */
	public FastqRecord readRecord() throws IOException, RecordFormatException
	{
		
		String theDefline = theBufferedReader.readLine();
		String theSequence;
		String theQuality;
	
		// checkes if the file is null

		if(theDefline == null)
		{
			return null;
			
		
		}
		else
			
			
			 theSequence = theBufferedReader.readLine();
		// useless line is just for fun to show that the + sign in a fastq record is useless, I didnt need to assign it to a variable i couldve just called it	
		String useless = theBufferedReader.readLine();
			theQuality  = theBufferedReader.readLine();
		
		FastqRecord q = new FastqRecord(theDefline, theSequence, theQuality);
		
		return q;

	}
	

	
	}

