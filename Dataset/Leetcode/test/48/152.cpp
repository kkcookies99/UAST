class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        int x1,x2,x3,x4,y1,y2,y3,y4;
        int len;
        int temp;
        len=matrix.size();
        for(int i=0;i<matrix.size()/2;i++){
            x1=i;y1=i;
            x2=i;y2=matrix.size()-1-i;
            x3=matrix.size()-1-i;y3=i;
            x4=matrix.size()-1-i;y4=matrix.size()-1-i;
            for(int j=0;j<len-1;j++){
                temp=matrix[x1][y1+j];
                matrix[x1][y1+j]=matrix[x3-j][y3];
                matrix[x3-j][y3]=matrix[x4][y4-j];
                matrix[x4][y4-j]=matrix[x2+j][y2];
                matrix[x2+j][y2]=temp;
            }
            len-=2;
        }
    }
};

