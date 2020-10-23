package simpledoku;

import java.util.*;


public class SimpledokuGrid 
{
	private int				nCellsPerSide;
	private int[][]			values;
	
	
	public SimpledokuGrid(int nCellsPerSide)
	{
		this.nCellsPerSide = nCellsPerSide;
		values = new int[nCellsPerSide][nCellsPerSide];
	}
	
	
	// This is called a "copy constructor". A copy ctor has 1 arg, which is the same type as
	// the current class. The ctor should make the new instance look just like the "source"
	// instance. CAUTION: The source and the current grid should each have their own "values"
	// array. So don't say "this.values = source.values". You have to create a new values
	// array, and copy numbers from source.values into the new array, one at a time.
	public SimpledokuGrid(SimpledokuGrid source)
	{


	}	
	
	
	//
	// Returns true if the input list contains a repeated value that isn't zero.
	// Call this from isLegal().
	//
	private boolean containsNonZeroRepeats(ArrayList<Integer> ints)
	{


	}
	
	
	public boolean isLegal()
	{
		// Check all rows. For each row, put the corresponding numbers from
		// the values[][] array into an ArrayList<Integer>. Then pass the array
		// list to containsNonZeroRepeats(). If containsNonZeroRepeats() return true,
		// then this grid isn't legal, so return false.



		// Check all columns. For each column, put the corresponding numbers from
		// the values[][] array into an ArrayList<Integer>. Then pass the array
		// list to containsNonZeroRepeats(). If containsNonZeroRepeats() return true,
		// then this grid isn't legal, so return false.


		
		// Check top-left to bottom-right diagonal. 

		
		
		// Check top-right to bottom-left diagonal. 


		
		// If we haven't returned yet, this grid must be false.
	}
	
	
	// Returns true if all members of the values[][] array are non-zero.
	public boolean isFull()
	{

	}	
	
	
	
	// Returns the Evaluation corresponding to the state of this grid. The return will be
	// Evaluation.ABANDON, Evaluation.ACCEPT, or Evaluation.CONTINUE. To determine what to
	// return, call isLegal() and isFull().
	public Evaluation evaluate()
	{
		if (!isLegal())
			return Evaluation.ABANDON;
		else if (isFull())
			return Evaluation.ACCEPT;
		else
			return Evaluation.CONTINUE;
	}
	
	
	// Returns a size=2 array of ints that index the next empty cell in the values[][] array.
	// The 2 ints in the returned array are the first and second indices into the values[][] array.
	// Returns null if this grid is full.
	private int[] getIndicesOfNextEmptyCell()
	{
		int[] xy = new int[2];
		
		for (xy[0]=0; xy[0]<nCellsPerSide; xy[0]++)
			for (xy[1]=0; xy[1]<nCellsPerSide; xy[1]++)
				if (values[xy[0]][xy[1]] == 0)
					return xy;
		
		return null;
	}
	
	
	//
	// COMPLETE THIS
	//
	//
	// Finds an empty member of values[][]. Returns an array list containing nCellsPerSide grids that look like the 
	// current grid, except the empty member contains 1, 2, 3 .... nCellsPerSide. 
	// 
	//
	// Example: if this grid = 12300
	//                         00000
	//                         00000
	//                         00000
	//                         00000
	//
	// Then the returned array list contains:
	//
	//      12310        12320        12330        12340        12350
	//      00000        00000        00000        00000        00000
	//      00000        00000        00000        00000        00000
	//      00000        00000        00000        00000        00000
	//      00000        00000        00000        00000        00000
	//
	ArrayList<SimpledokuGrid> generateNextGrids()
	{		
		int[] indicesOfNext = getIndicesOfNextEmptyCell();
		ArrayList<SimpledokuGrid> nextGrids = new ArrayList<SimpledokuGrid>();
		// Generate some grids and put them in nextGrids. Be sure that every
		// grid is a separate object.
		return nextGrids;
	}
	
	
	// Use this for debugging if it's helpful.
	public String toString()
	{
		String s = "";
		for (int j=0; j<nCellsPerSide; j++)
		{
			for (int i=0; i<nCellsPerSide; i++)
			{
				if (values[j][i] == 0)
					s += ".";
				else
					s += ("" + values[j][i]);
			}
			s += "\n";
		}
		return s;
	}
}
