package smallSideProj;

public class MakeCoffee {

	public static void main(String args[]) {
		Coff makeCof = Coff.Coffee;
		
		switch(makeCof) {
		case Coffee: printArray(new String[]{
				"Add Coffee",
				"Add Creamer",
				"Add Sugar",
				"Mix well"});
			break;
		case Chocolate: printArray(new String[] {
				"Add Chocolate"
		});
			break;
		}
		
	}
	
	public static void printArray(String arr[]) {
		for(String i : arr) {
			System.out.println(" "+i);
		}
	}

}


enum Coff{
	Coffee,
	Chocolate;
}