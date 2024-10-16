package virat;
//Parent class
class Animal {
 void eat() {
     System.out.println("This animal eats food.");
 }
}

//Child class
class Dog extends Animal {
 void bark() {
     System.out.println("The dog barks.");	 
     }
 void colour() {
	 System.out.println("The dog colour is Black.");
 }
 }


public class InheritanceExample {
 public static void main(String[] args) {
     Dog myDog = new Dog();
     
     // Calling methods from the child class
     myDog.bark();
     //calling inherited method from the child class
     myDog.colour();
      // Calling inherited method from the parent class
     myDog.eat();    
 }
}


	


