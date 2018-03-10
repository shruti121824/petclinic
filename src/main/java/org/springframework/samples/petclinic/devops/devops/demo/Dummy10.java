package devops.demo;

public class Dummy10 {
	public void whichClass(Dummy10 d10){
		if(d10 instanceof Dummy10){
			System.out.println("This is Dummy10 class");
			
		}
		
		else
		{
			System.out.println("This is not an instance of Dummy10");
		}
	}
}
