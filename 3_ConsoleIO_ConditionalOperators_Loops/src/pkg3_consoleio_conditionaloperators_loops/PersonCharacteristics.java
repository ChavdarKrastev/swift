
package pkg3_consoleio_conditionaloperators_loops;

import java.util.Scanner;

public class PersonCharacteristics {
    
     public static void main(String[] args)
{
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Number of persons");
        int persons = sc.nextInt();
        sc.nextLine();
        
        for(int a =0; a < persons; a++)
        {
        
            System.out.println("Person " + (a+1));
            
            System.out.println("Enter first name");
            String firstName = sc.nextLine();
            
            char[] charArr = firstName.toCharArray();
            for(int i=0; i<charArr.length; i++)
            {
                if(((charArr[i]!=32)&&(charArr[i]!=45)&&(charArr[i]<65))||((charArr[i]>90)&&(charArr[i]<97))||(charArr[i]>122))
                {
                    System.out.println("Wrong character, please try again");
                    firstName = sc.nextLine();
                    charArr = firstName.toCharArray();
                    i = 0;
                }
            }
    
            System.out.println("Enter last name");
            String lastName = sc.nextLine();
            
            char[] charArr2 = lastName.toCharArray();
            for(int i=0; i<charArr2.length; i++)
            {
                if(((charArr2[i]!=32)&&(charArr2[i]!=45)&&(charArr2[i]<65))||((charArr2[i]>90)&&(charArr2[i]<97))||(charArr2[i]>122))
                {
                    System.out.println("Wrong character, please try again");
                    lastName = sc.nextLine();
                    charArr2 = lastName.toCharArray();
                    i = 0;
                }
            }
            
            System.out.println("Enter a year of birth");
            String birthYear = sc.nextLine();
            char[] charArrYear = birthYear.toCharArray();
                for(int i=0; i<charArrYear.length; i++)
                {
                    if((charArrYear[i]<48)&&(charArrYear[i]>57))
                    {
                        System.out.println("Wrong data input, please use numbers");
                        birthYear = sc.nextLine();
                        charArrYear = birthYear.toCharArray();
                        i = 0;
                    }
                }
            int yearOfBirth = Integer.parseInt(birthYear);
    
    
            System.out.println("Enter weight in kg");
            String weight = sc.nextLine();
            char[] charWeight = weight.toCharArray();
                for(int i=0; i<charWeight.length; i++)
                {
                    if((charWeight[i]<48)&&(charWeight[i]>57))
                    {
                        System.out.println("Wrong data input, please use numbers");
                        weight = sc.nextLine();
                        charWeight = weight.toCharArray();
                        i = 0;
                    }
                }
            double weightKg = Double.parseDouble(weight);
    
            System.out.println("Enter height in cm");
            String height = sc.nextLine();
            char[] charHeight = height.toCharArray();
                for(int i=0; i<charHeight.length; i++)
                {
                    if((charHeight[i]<48)&&(charHeight[i]>57))
                    {
                        System.out.println("Wrong data input, please use numbers");
                        height = sc.nextLine();
                        charHeight = height.toCharArray();
                        i = 0;
                    }
                }
            short heightCm = Short.parseShort(height);
    
            System.out.println("Enter profession");
                String profession = sc.nextLine();
                char[] charPro = profession.toCharArray();
                for(int i=0; i<charPro.length; i++)
                {
                    if(((charPro[i]!=32)&&(charPro[i]!=45)&&(charPro[i]<65))||((charPro[i]>90)&&(charPro[i]<97))||(charPro[i]>122))
                    {
                        System.out.println("Wrong character, please try again");
                        profession = sc.nextLine();
                        charPro = profession.toCharArray();
                        i = 0;
                    }
                }
        }  
}
                                        }
                                      