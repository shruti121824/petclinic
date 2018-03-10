package devops.demo;

public class Dummy5 {
	public void whichClass(Dummy5 d5){
		if(d5 instanceof Dummy5){
			System.out.println("This is Dummy5 class");
			
		}
		
		else
		{
			System.out.println("This is not an instance of Dummy5");
		}
	}
}
