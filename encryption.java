import java.util.*;
class HelloWorld 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String s="";
        String s1="";
        
        s=sc.nextLine();
        int l=s.length();
        int ind=0;
        int i=0;
        for(i=1;ind<l;i++)
        {
            s1=s1+s.charAt(ind);
            ind=ind+i;
        }
        System.out.println(s1);
    }
}
