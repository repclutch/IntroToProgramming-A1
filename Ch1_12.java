 

public class Ch1_12 {
	public static void main(String[] args){
		
		double miles;
		double kilometers;
		double kilometersPerhour;
		double seconds;
		
		
		
		miles = 24.0;
		kilometers = miles * 1.6;
		seconds = 6035;
		kilometersPerhour = (kilometers / seconds) * 3600;
	
		
				System.out.println("The kilometers per Hour are " +  kilometersPerhour);
		
	}

}
