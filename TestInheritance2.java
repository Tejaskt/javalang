//Constructor in Inheritance
class Animal{
		Animal() {
			System.out.println("From animal constructor");
		 }
		void eat(){
			System.out.println("eating....");
		 }
		 protected void finalize() {
		 System.out.println("End of animal");
		 }
		}
		
class Dog extends Animal{
		 Dog() {
		 System.out.println("From dog constructor");
		 }
		 void bark(){
		 System.out.println("barking...");
		 }
		 protected void finalize() {
		 System.out.println("End of dog");
		 }
}
class BabyDog extends Dog{
		 BabyDog() {
		 System.out.println("From babydog constructor");
		 }
		 void weep(){
		 System.out.println("weeping...");
		 }
		 protected void finalize() {
		 System.out.println("End of babydog");
		 }
}
class TestInheritance2{
 public static void main(String args[]){
 BabyDog d=new BabyDog();
 d.weep();
 d.bark();
 d.eat();
 d=null;
 System.gc();
 }
} 