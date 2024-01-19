class Solution {
    public String addBinary(String a, String b) {
        int i=a.length()-1;
        int j=b.length()-1;
        int sum=0;
        int carry=0;
        String res="";
        
        while(i>=0 || j>=0)
        {
            int c1=0,c2=0;
            if(i>=0)
            {
                c1=a.charAt(i)-48;
                  i=i-1;
            }
            if(j>=0)
            {
                c2=b.charAt(j)-48;
                 j=j-1;

            }
            sum=carry+c1+c2;
            if(sum>1)
            {
                carry=1;
                
               
            }
            else
            {
                carry=0;
               
            }
            if(sum==0 || sum==2)
            {
                res="0"+res;
            }
            else{
                res="1"+res;
            }
        }
        if(carry>0)
        {
            res="1"+res;
        }
       
        
        
        return res;
    }
}
