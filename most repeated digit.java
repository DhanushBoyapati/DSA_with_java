import java.util.Scanner;

public class Main {
    
  public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the digits");
    String s=sc.nextLine();
    String[] parts=s.split(" ");
    int freq[]=new int[10];
    for(String part:parts)
    {
        for(char ch:part.toCharArray())
        {
            if(Character.isDigit(ch))
            {
                freq[ch-'0']++;
            }
        }
    }
    
    
    int max=0;
    int ind=-1;
    
    for(int i=9;i>=0;i--)
    {
        if(freq[i]>max)
        {
            max=freq[i];
            ind=i;
        }
        
    }
    
    
    System.out.print("the most repeted value is: "+ind);
    
     }
}


// Input:
// Enter the digits (space-separated): 123 455 343 98

// Output:
// The most repeated digit is: 4
