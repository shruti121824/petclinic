package devops.demo;

public class Dummy9 {
	public void whichClass(Dummy9 d9){
		if(d9 instanceof Dummy9){
			System.out.println("This is Dummy9 class");
			
		}
		
		else
		{
			System.out.println("This is not an instance of Dummy9");
		}
	}
}
