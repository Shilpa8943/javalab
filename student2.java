    import java.util.Scanner;

    public class student2

    {

        public static void main(String[] args) 

        {

            int n, total = 0, percentage,f=0;

            Scanner s = new Scanner(System.in);

            System.out.print("Enter no. of subject:");

            n = s.nextInt();

            int marks[] = new int[n];

            System.out.println("Enter marks out of 100:");

            for(int i = 0; i < n; i++)
             {
               marks[i] = s.nextInt();
 	    if(marks[i]>100)
              {
                System.out.println("enter valid mark");
                break;
              }
            else
               {

                total = total + marks[i];

              }
           
            }
      
            percentage = total / n;

            System.out.println("Sum:"+total);

            System.out.println("Percentage:"+percentage+"%");

        }

    }
