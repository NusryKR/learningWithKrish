import java.util.Scanner;
class Freddy{
	public static void main(String[] args){
		
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the distance");
			double distance= scanner.nextDouble();
			
			int hopes=0;
			int gap = 0;
			double time=0.0;
			if(distance > 0){
					while(distance > 0.0){
					if(gap ==0 && distance > 0.0){
						distance = distance- 5;
						hopes++;
						time = time + 1;
						gap++;
					}
					if(gap==1 && distance > 0.0){
						distance = distance - 3;
						hopes++;
						time  = time + 2;
						gap++;
					}
					if(gap==2 && distance > 0.0){
						distance = distance - 1;
						hopes++;
						time = time + 3.5;
						gap=0;
					}
				
				}
			System.out.println("Total time "+ time + "s");
			System.out.println("Hopes "+ hopes);
			}
			else {
				System.out.println("Input invalid");
			}
		
	}
}
