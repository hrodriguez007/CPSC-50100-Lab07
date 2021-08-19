//Lab 07
//Exercise 2
public class Driver {
	public static void main(String args[]) {
		
		//Creating ArrayStack instance
		ArrayStack obj1 = new ArrayStack();
		System.out.println("Pushing 1,7,3,4,9,2");
		
			obj1.push(1);
			obj1.push(7);
			obj1.push(3);
			obj1.push(4);
			obj1.push(9);
			obj1.push(2);
			System.out.println("After pushing data, the size of arraystack is "+obj1.size());
			
			//Pop
			obj1.pop(); obj1.pop(); obj1.pop(); obj1.pop(); obj1.pop(); obj1.pop();
				System.out.println("After popping data, the size of arraystack is "+obj1.size());
  
			//Creating LinkedStack instance
			LinkedStack obj2 = new LinkedStack();
			System.out.println();
			System.out.println("Pushing 1,7,3,4,9,2");
				obj2.push(1);
				obj2.push(7);
				obj2.push(3);
				obj2.push(4);
				obj2.push(9);
				obj2.push(2);
				System.out.println("After pushing data, the size of linkedstack is "+obj2.size());
				System.out.println(obj2);

				//Pop (bottom half removal)
				System.out.println();
				System.out.println("Removing bottom half");
				obj2.removeHalf();
				System.out.println("After popping data, the size of linkedStack is "+obj2.size());
				System.out.println(obj2);
				
				//Time complexity for method is O(n)
	}
}