public class HappyNum {
    //isHappy() will determine whether a number is happy or not  
    public static int isHappy(int n){  
        int rem = 0,s = 0;   
        //Calculates the sum of squares of digits  
        while(n > 0){  
            rem = n%10;  
            s = s + (rem*rem);  
            n = n/10;  
        }  
        return s;  
    }      
    public static void main(String[] args) {  
        int n = 82;  
        int res = n;  
          
        while(res != 1 && res != 4){  
            res = isHappy(res);  
        }    
        //Happy number always ends with 1  
        if(res== 1)  
            System.out.println(n+ " is a happy number");  
        //Unhappy number ends in a cycle of repeating numbers which contains 4  
        else if(res== 4)  
        System.out.println(n+ " is not a happy number");     
    }  
}

