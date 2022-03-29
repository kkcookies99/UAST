class Solution {
public:
     void dfs(vector<vector<int>>& matrix,int i,int max_i,int size){//max_i是该层最大序号.i表示该层第一个序号  
         if(i>=matrix.size()/2){return;} 
           for(int j=0;j<size-1;++j){  
               int tmp1=matrix[i+j][max_i];
                  int tmp2=matrix[max_i][max_i-j];
                     int tmp3=matrix[max_i-j][i]; 
               matrix[i+j][max_i]=matrix[i][i+j]; 
               matrix[max_i][max_i-j]=tmp1; 
               matrix[max_i-j][i]=tmp2;
               matrix[i][i+j]=tmp3;
             
           }
           dfs(matrix,i+1,max_i-1,size-2);
          
     } 
    void XXX(vector<vector<int>>& matrix) {
        dfs(matrix,0,matrix.size()-1,matrix.size());
    }
};

