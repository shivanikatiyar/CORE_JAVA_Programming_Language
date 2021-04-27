import java.util.Scanner;
public class String_Anagram {
    public static void main(String [] args)
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the first string :");
       String a=sc.nextLine();
       System.out.println("Enter the second string :");
       String b=sc.nextLine();
       boolean anagram=false;
       boolean visited[]=new boolean[b.length()];
       if(a.length()==b.length()){
       for(int i=0;i<a.length();i++){
               char c=a.charAt(i);
          anagram=false;
       for(int j=0;j<b.length();j++){ 
            if(b.charAt(j)==c&& !visited[j]){
                
                visited[j]=true;
                anagram=true;
                break;
            }
       }
       if(!anagram)
       {
         break;
       }
    }
    }
       if(anagram)
       {
           System.out.println("anagram");
       }
       else
       {
             System.out.println("not anagram");
       }
    }
    } 

