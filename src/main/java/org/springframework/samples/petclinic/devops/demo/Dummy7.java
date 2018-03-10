package devops.demo;

public class Dummy7 {
	public void whichClass(Dummy7 d7){
		if(d7 instanceof Dummy7){
			System.out.println("This is Dummy7 class");
			
		}
		
		else
		{
			System.out.println("This is not an instance of Dummy7");
		}
	}
}
