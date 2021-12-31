 public class Check{
	
        {
   	System.out.println("Empty block");
        }

	static{
	        System.out.println("Static block");
         }
	public  Check(){
		System.out.println("constructor block");
	}
public static void main(String[] args){
     Check object = new Check();
    
}
}