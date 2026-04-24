
//STACK REPRESENTATION USING LINKED LIST

class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}

class st{
Node head=null;
int MAX =10;
Node TOP =null;

void push(int data){
 

/*if (TOP==MAX-1){
 System.out.println("STACK  IS OVERFLOW");        not for linked link its only array based stack
 return;                                          linked  list allocated dynamically memory to stack thier is no limit.       
}  */




Node newNode = new Node(data);
newNode.next=TOP;
TOP= newNode; 
System.out.println("Node inserted in stack");

}


void pop(){

if(TOP==null){
    System.out.println("STACK IS UNDERFLOW");
    return;
}

int info=TOP.data; 
Node temp =TOP;
TOP=TOP.next;
System.out.println("Node Deleted from stack");

}

void Display(){

if (TOP==null){
    System.out.println("Nothing to print\n STACK IS EMPTY");
    return;
}
Node temp =TOP;
System.out.println("\nPrinting Stack");
while(temp!=null){
    System.out.println(temp.data);
    temp=temp.next;
}

}



}


class Stack{
    public static void main(String args[]){

        st s=new st();

        s.push(10);
        s.push(20);
        s.push(30);

        s.Display();

        s.pop();

         s.Display();

    }
}
