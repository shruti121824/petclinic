package devops.demo;

public class Dummy6 {

	public void whichClass(Dummy6 d6){
		if(d6 instanceof Dummy6){
			System.out.println("This is Dummy6 class");
			
		}
		
		else
		{
			System.out.println("This is not an instance of Dummy6");
		}
	}
	
}
