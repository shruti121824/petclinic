package devops.demo;

public class Dummy2 {

	public void whichClass(Dummy2 d2){
		if(d2 instanceof Dummy2){
			System.out.println("This is Dummy2 class");
			
		}
		
		else
		{
			System.out.println("This is not an instance of Dummy2");
		}
	}
	
}
