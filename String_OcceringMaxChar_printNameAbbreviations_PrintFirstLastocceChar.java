import java.util.*;
public class String_OcceringMaxChar_printNameAbbreviations_PrintFirstLastocceChar{
    Scanner sc=new Scanner(System.in);
    // input a string of alphabets.Find out the number of occurrence of all alphabets in that string.Find out the alphabet with maximum occurence.
    public void occeringMaxChar()
    {
        System.out.println("Enter the String");
        String data=sc.nextLine();
        int count=0,max=0;
        char a[]=new char[26];
        for(char c='a';c<='z';c++){
            a[count]=c;
            count++;
        }
        int alpha[]=new int[26];
        for(int i=0;i<alpha.length;i++)
        {
           for(int j=0;j<data.length();j++){
               if(a[i]==data.charAt(j))
               {
                  alpha[i]=alpha[i]+1; 
               }
           }
        }
        for(int i=0;i<26;i++)
        {
            if(alpha[i]>0){
             System.out.println(a[i]+"\t"+alpha[i]);
            }
        }
        char cht=0;
        max=alpha[0];
        for(int i=0;i<alpha.length;i++){
            if(max<alpha[i])
            {
                max=alpha[i];
                cht=a[i];    
            }  
        }
    System.out.println(cht+" = "+max);
    }
    //Wap that takes your full name as input and displays the abbreviations of the first and middle names except the last name which is displayed as it is.For example,if your name is Robert Brett Roser,then the output should be R.B.Roser.
    public void printNameAbbreviations()
    {
       System.out.println("Enter the String");
       String st=sc.nextLine();
       String sr="";
       sr=sr+st.charAt(0);
       sr=sr+". ";
       for(int i=0;i<st.length();i++){
           if(st.charAt(i)==' '&& st.charAt(i+1)!=' '&& i+1<st.length())
           {
               sr=(sr+st.charAt(i+1)).toUpperCase();
               sr=sr+". ";
           }
       }
       String last_wrd="";
       for(int i=st.length()-1;i>=0;i--){
           if(st.charAt(i)==' '){
            last_wrd=st.substring(i+2);
            //System.out.println(last_wrd);
            break;
           }
       }
        sr=sr.substring(0,sr.length()-2);
        //System.out.println(sr);
        sr=sr+last_wrd;
        System.out.println(sr);   
       }
    // wap to find the first and the last occurence of the letter 'o' and character ',' in "Hello, World".
    public void printFirstLastocceChar()
    {
        System.out.println("Enter the String");
        String data=sc.nextLine();
        System.out.println("Enter the given string character");
        char c=sc.next().charAt(0);
        //int l=data.length();
        System.out.println("First "+data.indexOf(c));  // method use indexOf()
        System.out.println("Last "+data.lastIndexOf(c)); // method use lastIndexOf()
        System.out.println(", First"+data.indexOf(','));
        System.out.println(", Last "+data.lastIndexOf(','));
        
    }
     public static void main(String [] args){
     String_OcceringMaxChar_printNameAbbreviations_PrintFirstLastocceChar obj=new String_OcceringMaxChar_printNameAbbreviations_PrintFirstLastocceChar();
     obj.printFirstLastocceChar();
     obj.occeringMaxChar();
     obj.printNameAbbreviations();
    }
}
