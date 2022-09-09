package house;

public class House {

	
	     private int floors = 0; 
	     private float squarefeet = 0; 
	     
	     public House( float sq ) { 
	          squarefeet = sq; 

	     } 
	     
	     public House( int f, float sq ) { 
	          floors = f; 
	          squarefeet = sq; 
	     }
	     
	     public void setFloors( int f ) { 
	          floors = f; 

	     }
	     
	     public void setSqFt( float sq ) { 
	          squarefeet = sq; 
	     } 
	     
	     public House(House in) {
	    	 setFloors(in.floors);
	    	 setSqFt(in.squarefeet);
	     }
	     
	     public  String toString() {
	    	 return "House has " + floors +" floors and " + squarefeet + "sqft.";
	    	 
	     }

			
	
	
public static void main (String[] args) {
	// TODO Auto-generated method stub
	House house1, house2;
	house1 = new House (2,1000.0f);
	house2 = new House (2500.0f);
	
	house1.setSqFt(1500.0f);
	house2.setFloors(1);
	System.out.println(house1);
	
}

}

	



