// You are using Java
import java.util.*;
class BitStuff
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the bits:");
        String s=sc.nextLine();
        String res=bitstuffing(s);
        System.out.println("Original Data Stream:");
        System.out.println(s);
        System.out.println("Bitstuffed Data Stream:");
        System.out.println(res);
    }
    public static String bitstuffing(String s)
    {
        StringBuilder sb=new StringBuilder();
        int count=0;
        for(int i=0;i<s.length();i++){
            char bit=s.charAt(i);
            sb.append(bit);
            if(bit=='1')
            {
                count++;
            }
            else
            {
                count=0;
            }
            if(count==5)
            {
                sb.append('0');
                count=0;
            }
        }
        return sb.toString();
    }
}
