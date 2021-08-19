//Lab 07
//Exercise 1
class LinkedNode {
protected int x;
protected LinkedNode next;
  
	public LinkedNode(int n) {
		this.x = n;
	}
  
}
	public class LinkedStack {
		LinkedNode front; //Reference to the first LinkedNode in the list
		int count; //Number of nodes in the list
		//Constructor - initializes the front and count variables

		LinkedStack() {
			front = null;
			count = 0;
		}
		
		//Implement push operation
			void push(int x) {
				LinkedNode newNode = new LinkedNode(x);
				newNode.next = front;
				front = newNode;
				count++;
			}
			
			//Implement pop operation
			int pop() {
				int x = front.x;
				front = front.next;
				count--;
				return x;
			}
			//Implement peek operation
			int peek() {
				return front.x;
			}
			
			//Implement isEmpty operation
			boolean isEmpty() {
				return front == null;
			}
			
			//Implement size operation
			int size() {
				return count;
			}
			
			/*This method returns a String containing
			 * a space separated representation of the underlying linked list
			 */

				public String toString() {
					String str = "";
					LinkedNode cur = front;
					while (cur != null) {
						str += cur.x + " ";
						cur = cur.next;
					}
					return str;
				}
}