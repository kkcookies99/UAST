class Solution {
public:
    void maSwap(vector<vector<int>>& matrix,int l,int r){//交换函数
        for(int i=0;i<r-l;i++){
            int temp=matrix[l][l+i];
            matrix[l][l+i]=matrix[r-i][l];
            matrix[r-i][l]=matrix[r][r-i];
            matrix[r][r-i]=matrix[l+i][r];
            matrix[l+i][r]=temp;
        }
    }
    void XXX(vector<vector<int>>& matrix) {//我就几个额外变量，为什么内存消耗那么大？？？？？？？？？
        int l=0,r=matrix.size()-1;
        while(l<r)maSwap(matrix,l++,r--);
        return;
    }
};

