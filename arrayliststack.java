public class StackClass{
class Stack{
	ArrayList<Integer>list=new ArrayList<>();
	public static boolean isEmpty(){
		return list.size()==0;
	}
	//push
	
}
public static void main(String args[]){
	Stack s=new Stack();
	s.push(1);
	s.push(2);
	s.push(3);
	s.push(4);
	while(!s.isEmpty()){
		System.out.println(s.peak());
		s.pop();
	}
	
}
}