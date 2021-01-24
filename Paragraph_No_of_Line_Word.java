import java.util.*;
class Paragraph_No_of_Line_Word
{
public static void main(String args[])
{
	String data,fdata="";
	int c=0,w=0,line=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a para:");
	while(true)
	{
	data=sc.nextLine();
	int len=data.length();
	fdata=fdata+data+"\n";
	if(len>0)
	{
		c=c+len;
		line++;	
		for(int i=0;i<len;i++)
		{
		if(data.charAt(i)==32)
		{
			w++;
		}
			}
	}
	
	
	else
	{
		break;
	}
	
	}
System.out.println("character:"+c);
System.out.println("line:"+(line));	
System.out.println("words:"+(w+line));
System.out.println(fdata);
}
}