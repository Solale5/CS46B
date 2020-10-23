package dna;



/**
 * 
 * @author solomonalemu
 * interface that is used by FastqRecord and FastaRecord
 */
public interface DNARecord 
{
	String		getDefline();
	String		getSequence();
}
