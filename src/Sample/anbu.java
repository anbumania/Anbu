package Sample;
import java.util.Random;

public class anbu {

	public anbu() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args)
	{
		Random random = new Random();
		// generates a random int
		for (int i = 0; i < 100; i++) 
		{
			anyRandomInt(random);
		}
		
		System.out.println();
		// generates a random int in a range from low int to high int
		//for (int i = 0; i < 10; i++) {
		//	anyRandomIntRange(random, 1, 5);
		//}
	}
	
	public static void anyRandomInt(Random random) {
		int randomInt = random.nextInt();
		System.out.println("random integer:" + randomInt);
	}

	//public static void anyRandomIntRange(Random random, int low, int high) {
	//	int randomInt = random.nextInt(high) + low;
	//	System.out.println("random integer from " + low + " to " + high + ":" + randomInt);
	//}

}	
