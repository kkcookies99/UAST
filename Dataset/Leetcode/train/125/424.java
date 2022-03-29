 class Solution {
    public boolean XXX(String s) {
        int sum=s.length();
        if(sum==0){
            return true;
        }
        //筛出字母和数字;
        int count=0;
        char[] arry=new char[sum];
        for(int i=0;i<sum;i++){
             char ch=s.charAt(i);
             if(ch>=48 && ch<=57){ //数字;
                 arry[count++]=ch;
              }
              if((ch>=65 && ch<=90) ||(ch>=97 && ch<=122)){ //字母;
                 arry[count++]=ch;
              }
        }

        for(int i=0;i<count/2;i++){
            char start=arry[i];
            char end=arry[count-1-i];
            if(start!=end){
            if( (start>=65 && start<=90)&& (end>=97 && end<=122) && (start+32==end) ){

          
            }else if((start>=97&& start<=122)&&(end>=65 && end<=90)&&(start-32==end)){
         
            }else{
                return false;
            }

            }
        }
        return true;
    }
}

