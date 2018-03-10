package devops.demo;

public class Dummy4 {
	public void whichClass(Dummy4 d4){
		if(d4 instanceof Dummy4){
			System.out.println("This is Dummy4 class");
			
		}
		
		else
		{
			System.out.println("This is not an instance of Dummy4");
		}
	}
}
