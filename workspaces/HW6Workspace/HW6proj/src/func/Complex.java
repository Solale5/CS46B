package func;

public class Complex 
{
	private double			real;
	private double			imaginary;
	
	
	// Constructs an instance, given its real and imaginary components.	
	public Complex(double real, double imaginary)
	{
		this.real = real;
		this.imaginary = imaginary;
	}
	
	
	// Constructs an instance that duplicates source.
	public Complex(Complex source)
	{
		Complex thesource = new Complex(source.real, source.imaginary);
	}
	
	
	// Getter method.
	public double getReal()
	{
		return this.real;
	}
	

	// Getter method.
	public double getImaginary()
	{
		return this.imaginary;
	}
	
	
	//
	// Constructs and returns a new instance of Complex that represents the sum of its inputs,
	// according to the following formula:
	//
	// (a+bi) plus (c+di) = (a+c) + (b+d)i
	// 	
	public static Complex add(Complex c1, Complex c2)
	{
		double a = c1.real;
		double c = c2.real;
		double theRealAddition = (a+c);
		double theImaginaryAddition = (c2.imaginary + c1.imaginary);
		
		Complex additionOfInputs = new Complex(theRealAddition, theImaginaryAddition);
		return additionOfInputs;
	}
	
	
	//
	// Constructs and returns a new instance of Complex that represents the product of its inputs,
	// according to the following formula:
	//
	// (a+bi) times (c+di) = a*c + a*di + bi*c + bi*di = ac + (ad+bc)i + bd*ii
	// Since ii is -1 by definition, the last term is -bd ==> the result is ac-bd + (ad+bc)i
	//
	
	public static Complex multiply(Complex c1, Complex c2)
	{
		double a = c1.real;
		double c = c2.real;
		double bi = c1.imaginary;
		double di = c2.imaginary;
		
		double theReal = (a*c) - (bi*di);
		double theImaginary = (a*di) + (bi*c);
		
		Complex productOfInputs = new Complex(theReal, theImaginary);
		return productOfInputs;
	}
	
	//public static void main (String args[])
	
	//
	// The "norm" of complex number a+bi is the square root of (a^2 + b^2).
	public double norm()
	{
		double aSquared = this.real * this.real;
		double bSquared = this.imaginary * this.imaginary;
		
		
		return Math.sqrt(aSquared + bSquared);
	}
}
