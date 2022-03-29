class Solution {
public:
    void XXX(vector<vector<int>>& matrix) {
        int temp=0,n=matrix.size()-1;
        int times = matrix.size()/2;//需要旋转的圈数2、3层只转最外边一层，4、5转最外边两圈；
        int cur_times = 0;
        while(cur_times<times)
        {
            int t = matrix.size()-cur_times-1;
            for(int i =cur_times;i<t;i++)
            {

                temp=matrix[cur_times][i];
                matrix[cur_times][i]=matrix[matrix.size()-i-1][cur_times];
                matrix[matrix.size()-i-1][cur_times]=matrix[matrix.size()-cur_times-1][matrix.size()-i-1];
                matrix[matrix.size()-cur_times-1][matrix.size()-i-1]=matrix[i][matrix.size()-cur_times-1];
                matrix[i][matrix.size()-cur_times-1]=temp;
            }
            cur_times++;
        } 
    }
};

