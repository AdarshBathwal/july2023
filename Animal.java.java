package July2023;

public class Animal {
	
		//method eat of class Animal
        public void eat(){
        	System.out.println("Buzo is eating");
        	}
        
        //method run of class animal
        public void run() {
        	System.out.println("Buzo is running");
        	}
        
        //main method
        public static void main(String[] args)
          {
        	
        	System.out.println("its my first program");
        	//creating an object in class 
        	Animal buzo = new Animal();
        	buzo.eat();
            buzo.run();
            
            //declaring new object bird
            Birds sparrow = new Birds();
            
            //calling method of sparrow in birds class
            sparrow.fly();
            sparrow.feather();
          
        }
        
      
        }

//new class birds
class Birds{
   //method fly and feather of class bird and object sparrow
      	
    	  public void fly() {
      	System.out.println(" Sparrow can fly");
      	}
      	
      public void feather() {
      	System.out.println("Sparrow fly with help of their feathers");
      	}
      
        
        
 }


