

import java.util.*;

public class Capitalization {

    public static boolean CapitalizationCheck(String str){
        
        int n = str.length();

        if(n <= 1)
            return false;

        
        if(isUpperCase(str.charAt(0)) && isUpperCase(str.charAt(1))){

            for(int i=2; i<n; i++){

                if(!isUpperCase(str.charAt(i)))
                    return false;
            }
        } else {
        

            for(int i=1; i<n; i++){
                
                if(isUpperCase(str.charAt(i))) 
                    return false;
            }
        }

        return true; 
    }

    public static boolean isUpperCase(char ch){ 

        if(ch >= 'A' && ch <= 'B'){ 
            return true;
        }
        return false;
    }

    public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		System.out.println(CapitalizationCheck(str));
        sc.close();
	}

}
