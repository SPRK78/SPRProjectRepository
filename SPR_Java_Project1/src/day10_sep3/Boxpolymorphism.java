package day10_sep3;

public class Boxpolymorphism {

	
		
		double width, length, height;
		
		Boxpolymorphism()
		{
			width=height=length=0;
		}
		
		Boxpolymorphism(double w, double l, double h)
		{
			width=w;
			length=l;
			height=h;
		}
		
		double sum()
		{
			return(width*length*height);
		}

	

}
