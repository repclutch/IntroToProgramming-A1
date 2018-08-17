 

import java.util.Scanner;

public class Chapter4_18 {
	
		 public static void main(String[] args)
		    {
		        Scanner in = new Scanner(System.in);
		        
		        System.out.println("Enter two characters"
		        		+ " M for Math Major"
		        		+ " I for Information Technology Major"
		        		+ " C for Computer Science Major "
		        		+ " 1 for freshman, "
		        		+ " 2 for Sophomore, "
		        		+ " 3 for jonior "
		        		+ " 4 for senior   ");
		        String chara2 = in.next();
		        
		        char major = chara2.charAt(0);
		        char year = chara2.charAt(1);
		        
		        String courseName = "";
		        String yearName = "";
		        
		        if (major == 'M' || major == 'I' || major == 'C'||major=='m'||major=='i'||major=='c')
		        {
		            switch(major)
		            {
		                case 'M':
		                    courseName = "Mathematics";
		                    break;
		                case 'C':
		                    courseName = "Computer Science";
		                    break;
		                case 'I':
		                    courseName = "Information Technology";
		                    break;
		                case 'm':
		                	courseName= "Mathematics";
		                	break;
		                case 'c':
		                    courseName = "Computer Science";
		                    break;
		                case 'i':
		                    courseName = "Information Technology";
		                    break;
		                default:
		                    break;
		            }
		            
		            switch(year)
		            {
		                case '1':
		                    yearName = "Freshman";
		                    break;
		                case '2':
		                    yearName = "Sophmore";
		                    break;
		                case '3':
		                    yearName = "Junior";
		                    break;
		                case '4':
		                    yearName = "Senior";
		                    break;
		                default:
		                    break;
		            }
		            System.out.print(courseName + " "+ yearName);
		        }
		        else{
		            System.out.print("Invalid input " );
		        }
		    }
		
	}

