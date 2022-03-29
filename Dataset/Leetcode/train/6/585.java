 class Solution {
    public String XXX(String s, int numRows) {
    if(s.length()<=numRows){
        return s;
    }
    //先计算有几个大 V 
    if(numRows==1)return s;
    int  v = s.length()/(2*numRows-2);
    //肯定还有个尾巴
    int v_over = s.length()%(2*numRows-2);
    //一个大 V 有几个列 1+numrows -2
    int v_column = numRows-1;
    //row 就不用计算因为肯定是在 0-numrows 之间循环
    //现在计算一下需要申请多少资源
    int v_over_column=0;
    if(v_over==0) v_over_column=0;
    if(v_over<=numRows) v_over_column=1;
    else v_over_column = 1+v_over-numRows;
// 没有初始化的情况下  出现了乱码的情况下 试下 初始化有没有改正（自己胡乱猜测的） 反正加了初始化运行出结果了e但是结果居然是错的
    char[][] c = new char[numRows][v_column*v+v_over_column];
    for(int m=0;m<numRows;m++){
        for(int n=0 ;n < v* v_column+v_over_column;n++){
            c[m][n]='-';
        }

    }
    //好了资源申请完毕开始重头戏；
    int count = 0 ,row = 0,column = 0,count_char=0;
    
    //还有种情况就是 可能 s.length() 可能连一个大V的数量都不够；真是坑爹的玩意
    
    int over_v =0;
    if(v_over ==0 ) over_v=0;
    else over_v=1;
    for( int i=0 ; i<v+over_v; i++){
        count =0;row=0;
        for( int j=0; j< 2*numRows-2; j++){
            if(row==numRows) row--;
           
            if(count < numRows){
               column = i*v_column;
                c[row][column]= s.charAt(count_char) ;
                
                ++count;
                ++row;
            }else{
                --row;
                column = i*v_column+(j -numRows+1) ;
                c[row][column]= s.charAt(count_char) ;
                 
            }
            if(count_char+1 == s.length()) break ;
            ++count_char;
            
        }
    }
    
    
    String result="";
    for(int m=0;m<numRows;m++){
        for(int n=0 ;n< v* v_column+v_over_column;n++){
           if(c[m][n]!='-') {
               result= result+String.valueOf(c[m][n]);
           }
        }

    }
     return result;
    }
}

