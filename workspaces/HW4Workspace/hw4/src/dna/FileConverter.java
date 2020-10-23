package dna;

import java.io.*;
import java.util.*;


public class FileConverter 
{
	private File fastq;
	private File fasta;
	
	/**
	 * 
	 * @param fastQ is a fastq file
	 * @param fastA is a fasta file
	 */
	public FileConverter(File fastQ, File fastA) 
	{
		fastq = fastQ;
		fasta = fastA;
	}
	
	/**
	 * 
	 * @throws IOException since we are calling methods that throw exceptions we are passing the buck (I think)
	 */
	public void convert() throws IOException
	{
		// chain of readers
		FileReader fr = new FileReader(fastq);
		BufferedReader br = new BufferedReader (fr);
		FastqReader fqr = new FastqReader(br);
		
		// chain of writers
		FileWriter fw = new FileWriter(fasta);
		PrintWriter pw = new PrintWriter (fw);
		FastaWriter faw = new FastaWriter (pw);
		
		
		boolean done = false;
		while(!done)
		{

			try {
				
				FastqRecord theQrecord = fqr.readRecord();
				if(theQrecord == null)
				{
					done = true;
					br.close();
					fr.close();
					pw.close();
					fw.close();
				}
				else if(!theQrecord.qualityIsLow())
				{
					FastaRecord theArecord = new FastaRecord (theQrecord);
					
					faw.writeRecord(theArecord);

					
				}

				
			} catch (RecordFormatException e) 
			{
				
				
			}
			
			
		}
		
	}
	
		
	
	public static void main(String[] args)
	{
		System.out.println("Starting");
		try
		{
			File fastq = new File("data/HW4.fastq");
			if (!fastq.exists())
			{
				System.out.println("Can't find input file " + fastq.getAbsolutePath());
				System.exit(1);
			}
			File fasta = new File("data/HW4.fasta");
			FileConverter converter = new FileConverter(fastq, fasta);
			converter.convert();
		}
		catch (IOException x)
		{
			System.out.println(x.getMessage());
		}
		System.out.println("Done");
	}
}
