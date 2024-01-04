class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list=new ArrayList<Integer>();  
  
        int n=matrix.length;
        int c=0;
        int m=matrix[0].length;
        int rowstart=0;
        int colstart=0;
        int rowend=n-1;
        int colend=m-1;
        while(rowstart<=rowend  && colstart<=colend)
       {
           if(c<m*n)
           {

                for(int i=colstart;i<=colend;i++)
                {
                    list.add(matrix[rowstart][i]);
                    c++;
                }
                rowstart++;

           }
        if(c<m*n)
        {
           for(int i=rowstart;i<=rowend;i++)
           {
               list.add(matrix[i][colend]);
                c++;
           }
            colend--;
        }
        if(c<m*n)
        {
              for(int  i=colend;i>=colstart;i--)
           {
               list.add(matrix[rowend][i]);
                c++;
           }
           rowend--;
        }
        if(c<m*n)
        {
           for(int i=rowend;i>=rowstart;i--){
               list.add(matrix[i][colstart]);
               c++;

           }


           colstart++;
        }


       }
       return list;
    }
}
