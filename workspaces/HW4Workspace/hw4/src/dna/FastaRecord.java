package dna;


public class FastaRecord implements DNARecord
{	
	private String defline;
	private String sequence;
	
	/**
	 * 
	 * @param defline defline of a fasta is >
	 * @param sequence takes the sequence of a fasta
	 * @throws RecordFormatException if the defline isnt > throws this exception
	 */
	public FastaRecord(String defline, String sequence) throws RecordFormatException
	{	String theErrorMessage;
		char greaterThanSign = '>';
		// precondition check: throw RecordFormatException if the 1st char of the defline is 
		// not '>'.
		if(defline.charAt(0) != greaterThanSign )
		{
			theErrorMessage = "the defline should begin with: > ";
			RecordFormatException err = new RecordFormatException(theErrorMessage);
			throw err;
		}
		else
		{
			this.defline = defline;	
			
		}
		this.sequence = sequence;
		
	}
	
/**
 * 
 * @param fastqRec takes a FastaRecord file and initializes the instance variables with values from the FastqRecord
 */
	public FastaRecord(FastqRecord fastqRec)
	{
		
		String fastqDef = fastqRec.getDefline();
		String noAtSign = fastqRec.getDefline().substring(1, fastqRec.getDefline().length());
		
		String carrot = ">";
		
		String newDefline = carrot + noAtSign;
		this.defline = newDefline;
		
		
		this.sequence = fastqRec.getSequence();
		
		
		
		
	}
	
	
	
	/**
	 * @param x takes an object as a parameter
	 */
	public boolean equals(Object x)
	{
		FastaRecord that = (FastaRecord)x;
		//checks to see if all three have the same instance variable
				if(this.defline.compareTo(that.defline)==0 && this.sequence.compareTo(that.sequence)==0)
				{
					return true;
				}
				//if they don't returns false
				else 
				{
				return false;
				}
		
	}
	
		public int hashCode()
		{
			return defline.hashCode() + sequence.hashCode() ;
			
		}
		

		public String getDefline()
		{
			return this.defline;
			
		}
		public String		getSequence()
		{
			return this.sequence;
			
		}
		//testing my conversion 
		public static void main (String[] args)
		{
			
			String defline = "@hdashf";
			String sequence = "sgropf";
			String quality = "dslkfnsmfs";
			
			try {
				FastqRecord f = new FastqRecord(defline, sequence, quality);
				FastaRecord g = new FastaRecord(f);
				System.out.println(g.getDefline());
				System.out.println(g.getSequence());
				
			} 
			
			catch (RecordFormatException e) {
				
				System.out.println(e.getMessage());
			}
			
			
		}

}
