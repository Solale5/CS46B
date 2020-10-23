package dna;

import java.io.*;
import java.util.*;


public class FileConverter 
{
	
	//
	// Writes a fasta file consisting of conversion of all records from the fastq with
	// sufficient quality and unique defline.
	//
	public void convert() 
	{
		// Build chain of readers.
		FileReader fr = 
		BufferedReader br = 
		FastqReader fqr =

		// Build chain of writers.
		FileWriter fw =
		PrintWriter pw = 
		FastaWriter faw = 
		
		// Read, translate, write.
		
		// Close fr, br, fw, and pw in reverse order of creation.
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
