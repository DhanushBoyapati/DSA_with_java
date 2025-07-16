class Main{
    public static void main(String[] arg)
    {
        String s="1001";
        String s1="0101";
        
        StringBuilder str=new StringBuilder();
        
        int i=s.length()-1;
        int j=s.length()-1;
        int carry=0;
        
        while(i>=0||j>=0||carry==1)
        {
            int sum=carry;
            
            if(i>=0)
            {
                 sum=sum+s.charAt(i)-'0';
                i--;
            }
            if(j>=0)
            {
                 sum=sum+s1.charAt(j)-'0';
                j--;
            }
            str.append(sum%2);
            carry=sum/2;
            
            
        }
        
        String k=str.reverse().toString();
        System.out.print(k);
        
        
    }
}
