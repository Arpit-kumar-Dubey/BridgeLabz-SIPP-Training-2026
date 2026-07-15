//package Stack;
//
//public class Stack {
//    StackData top;
//
//    //IsEmpty
//    public boolean isEmpty()
//    {
//        if(top==null) return true;
//        else return false;
//
//        // peek
//    }
//    public int peek(){
//        return top.data;
//    }
//
//    // Stack push
//
//    public void push(int data){
//        StackData n = new StackData(1);
//
//        n.next=top;
//        top=n;
//    }
//    // StackPop
//    public int pop(){
//        if(isEmpty()){
//            System.out.println("Stack is Empty");
//            return -1;
//        }
//        int data = top.data;
//        top=top.next;
//
//        return data;
//    }
//}
