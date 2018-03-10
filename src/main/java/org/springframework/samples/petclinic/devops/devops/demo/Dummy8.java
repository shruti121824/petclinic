package devops.demo;

public class Dummy8 {
	public void whichClass(Dummy8 d8){
		if(d8 instanceof Dummy8){
			System.out.println("This is Dummy8 class");
			
		}
		
		else
		{
			System.out.println("This is not an instance of Dummy8");
		}
	}
}
