 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        vector<vector<int>> vv;//相当于创建了一个二维数组，一个vector里面存着一个vector
        
        vv.resize(numRows);//为第一个vector开空间
        
        for(size_t i = 0;i < vv.size();++i)
        {
            vv[i].resize(i+1,0);//为存在vv中的vector开辟空间,并把所有值置成0
            vv[i][0] = 1;
            vv[i][vv[i].size() - 1] = 1;  
        }
        
        //重新遍历一遍vector，找到为0的位置
        for(size_t i = 0;i < vv.size();++i)
        {
            for(size_t j = 0;j < vv[i].size();++j)
            {
                if(vv[i][j] == 0)
                {
                    vv[i][j] = vv[i-1][j-1] + vv[i-1][j];
                }
            }
        }  
        return vv;  
    }
};

