import java.util.*;
class CharStuff
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Characters:");
        int n=sc.nextInt();
        System.out.println("Enter the characters:");
        String arr[]=new String[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.next();
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i].equals("dle"))
            {
                arr[i]="dle dle";
            }
        }
        System.out.println("Transmitted message is: ");
        System.out.print("dle stx ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.print("dle etx");
    }
}
