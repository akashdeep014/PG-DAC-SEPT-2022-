
import java.util.*;

public class RobotMove {
    
    public static boolean robotPosition(String moves){

        int n = moves.length();
        int right = 0;
        int up = 0;

        if(n % 2 != 0 ){  
            return false; 
        }

        for(int i=0; i<n; i++){

            char ch = moves.charAt(i);

            switch(ch){

                case 'R' : right++;  
                           break;
                case 'L' : right--;
                           break;
                case 'U' : up++;  
                           break;
                case 'D' : up--; 
                           break;
                default :  System.out.println("Invalid Input");;
            }
        }

        if( right == 0 && up == 0){
            return true;
        }

        return false;

    }


    public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		System.out.println(robotPosition(str));
        sc.close();
	}
    
}

