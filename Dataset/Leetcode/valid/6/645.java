 class Solution {
    public String XXX(String s, int numRows) {
         if(numRows==1) return s;
         int count=0;
         int downstart=0, downend=numRows-1;
         char[][] arr =new char[numRows][s.length()];
    
         for(int i=0;i<s.length();){                        
            int v=0;
            while(v<numRows && i<s.length()){
                 arr[v][count]=s.charAt(i);
                 i++;
                 v++;
            }          
            int k=1;
            while( k<=numRows-2 && i<s.length()){                
                count++;
                arr[numRows-1-k][count]=s.charAt(i);            
                k++;
                i++;
            }
            count++;

                      
            downstart=downstart+(numRows+numRows-2);
            downend=downend+(numRows+numRows-2);             

         }   
         StringBuffer sb=new StringBuffer("");
         for(int i=0;i<numRows;i++){             
             for(int j=0;j<s.length();j++){                 
                 if((int)arr[i][j]!=0){                 
                     sb.append(String.valueOf(arr[i][j]));
                 }             
             }
         }
        
         return sb.toString();

    }
}

