package devops.demo;

public class Dummy3 {
	public void whichClass(Dummy3 d3){
		if(d3 instanceof Dummy3){
			System.out.println("This is Dummy3 class");
			
		}
		
		else
		{
			System.out.println("This is not an instance of Dummy3");
		}
	}
}
