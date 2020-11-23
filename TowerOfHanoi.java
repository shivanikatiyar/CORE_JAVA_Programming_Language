public class TowerOfHanoi
{
class  Stack                         // A structure to represent a stack
{
int capacity;
int top;
int array[];
}

Stack createStack(int capacity)     // Function to create a stack of given capacity.
{
 Stack s=new Stack();
 s.capacity=capacity;
 s.top=-1;
 s.array=new int[capacity];
 return s;
 }
 
 boolean isFull(Stack stack)            // Stack is full when the top is equal.  To the last index.
 {
 return(stack.top==stack.capacity-1);    
 }
 
 boolean isEmpty(Stack stack)           // Stack is empty when top is equal to -1
 {
 return(stack.top==-1);
 }
 
 void push(Stack stack, int item)       // Function to add an item to stack. It increases top by 1
 {
 if(isFull(stack))
 return;
 
 stack.array[++stack.top]=item;
 }
 
 int pop(Stack stack)                    // Function to remove an item from stack. It decreases top by 1
 {
    if(isEmpty(stack))
	     return Integer.MIN_VALUE;
		 
	return stack.array[stack.top--];
 }
 
 void moveDisksBetweenTwoPoles(Stack src, Stack dest, char s,char d)    // Function to implement legal movement between .  two pole.
 {
 int pole1TopDisk=pop(src);
 int pole2TopDisk=pop(dest);
 if(pole1TopDisk==Integer.MIN_VALUE)           // When pole 1 is empty
 {
    push(src,pole2TopDisk);
	moveDisk(d,s,pole2TopDisk);
 }
 else if(pole2TopDisk==Integer.MIN_VALUE)       // When pole 2 is empty
 {
    push(dest,pole1TopDisk);
	moveDisk(s,d,pole1TopDisk);
 }
 else if(pole1TopDisk > pole2TopDisk)           // When top disk of pole 1 > top disk of pole 2
 {
 push(src,pole1TopDisk);
 push(src,pole2TopDisk);
 moveDisk(d,s,pole2TopDisk);
 }
 else{                                         // When top disk of pole 1 < top disk of pole 2
 push(dest,pole2TopDisk);
 push(dest,pole1TopDisk);
 moveDisk(s,d,pole1TopDisk);
 }
 }
 
 void moveDisk(char fromPeg, char toPeg, int disk)
 {
 System.out.println("Move the Disk " + disk + " from " + fromPeg + " to " + toPeg);
 }
 
 void tohIterative(int num_of_disks, Stack src, Stack aux, Stack dest)     // Function to implement TOH .
 {
 int i,total_num_of_moves;                    
 char s='S',d='D',a='A';
 
  if(num_of_disks % 2 ==0)                       // If number of disks is even, then interchange destination pole and  auxiliary pole.            
  {
  char temp=d;
  d=a;
  a=temp;
  }
  total_num_of_moves=(int)(Math.pow(2, num_of_disks) -1);
  for(i=num_of_disks; i>=1;i--)                   // Larger disks will be pushed first
  push(src,i);
  for(i=1;i<=total_num_of_moves;i++)
  {
  if(i%3==1)
  moveDisksBetweenTwoPoles(src, dest, s, d);
  else if(i%3==2)
  moveDisksBetweenTwoPoles(src, aux, s, a);
  else if(i%3==0)
  moveDisksBetweenTwoPoles(aux, dest, a, d);
 }
 }
 
 public static void main(String[] args)
 {
 int num_of_disks=3;
 
 TowerOfHanoi ob=new TowerOfHanoi();
 Stack src,dest,aux;
 
 src=ob.createStack(num_of_disks);
 dest=ob.createStack(num_of_disks);
 aux=ob.createStack(num_of_disks);
 
 ob.tohIterative(num_of_disks, src, aux, dest);
 }
}