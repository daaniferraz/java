package entities;

public class Retangulo {

	public double largura;
	public double altura;

	
	public double area() {
		
    return largura*altura;
    
	}
	
	public double perimetro () {
		
		return ((altura*2) + (largura*2));
	    
		}
	
	
	public double diagonal() {
		
		return Math.sqrt((altura*altura)+(largura*largura));
	}
	

     public String toString() {
    	 return "AREA = " + area()+ "\n"+"PERIMETRO = " + perimetro()+ "\n"+"DIAGONAL = " + diagonal() ;
    	 
     }
	
	

}


