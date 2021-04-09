
public class ComplexNumber {
	private int real; 
	private int imaginary; 
	
	public ComplexNumber(int real, int imaginary) { 
		this.real = real; 
		this.imaginary = imaginary;
	}
	
	public int getImaginary() { 
		return imaginary;
	}
	
	public int getReal() { 
		return real;
	}
	
	public void setImaginary(int imaginary) {
		this.imaginary=  imaginary; 
	}
	
	public void setReal(int Real) { 
		this.real = Real;
	}
	
	public void print() { 
		System.out.println(real + " + i"+imaginary);
	}
	
	public void add(ComplexNumber c2) { 
		this.real = this.real + c2.real; 
		this.imaginary = this.imaginary + c2.imaginary; 
	}
	
	public void multiply(ComplexNumber c2) {
		this.real = this.real  * c2.real; 
		this.imaginary =this.imaginary * c2.imaginary; 
	}
	
	public static ComplexNumber add(ComplexNumber c1, ComplexNumber c3) { 
		int newReal = c1.real + c3.real; 
		int newImag = c1.imaginary + c3.imaginary;
		ComplexNumber c = new ComplexNumber(newReal, newImag); 
		return c;
	}
}
