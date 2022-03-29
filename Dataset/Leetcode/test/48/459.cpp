 class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        if (matrix.size()!=matrix[0].size()){
            cout<<"Input error"<<endl;
        }
        else{
            for(int count=0;count<matrix.size()/2;count++){
                //count表示从外向内的层数，对于奇数，向下取整是可以的，因为最后一个元素是单个元素；对于偶数也是可以的，因为最后是一个方框。
                //每向内一层，则行数和列数会分别减少2
                    for(int j=0;j<matrix.size()-count*2-1;j++){
                        int TempArray=matrix[j+count][matrix.size()-count-1];
                        matrix[j+count][matrix.size()-count-1]=matrix[count][count+j];
                        matrix[count][count+j]=matrix[matrix.size()-count-j-1][count];
                        matrix[matrix.size()-count-j-1][count]=matrix[matrix.size()-count-1][matrix.size()-count-1-j];
                        matrix[matrix.size()-count-1][matrix.size()-count-1-j]=TempArray;
                    }
            }  
        }
    }
};```

