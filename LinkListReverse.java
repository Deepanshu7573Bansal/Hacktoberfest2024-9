import java.util.Scanner;

class LinkListReverse{

Node head;

static class Node{
int data;
Node next;
Node(int data){
this.data=data;
this.next=null;
}
}

public void insertNode(int data){
Node temp=head;
Node newNode=new Node(data);
if(head==null){
head=newNode;
}else{
while(temp.next!=null){
temp=temp.next;
}
temp.next=newNode;
}
}

public void reverseLinkList(){
reverse(head);
}

public void reverse(Node head){
if(head==null){
return;
}else{
reverse(head.next);
System.out.print(head.data+" ");
}
}

LinkListReverse(){
this.head=null;
}

public static void main(String[] args){
LinkListReverse llr=new LinkListReverse();
llr.insertNode(10);
llr.insertNode(20);
llr.insertNode(30);
llr.insertNode(40);
llr.insertNode(50);

llr.reverseLinkList();
}
}
