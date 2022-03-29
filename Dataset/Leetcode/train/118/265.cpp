 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        std::vector<vector<int>> result;
        for(int i = 0; i < numRows; ++i) {
            // 处理第 1 行数据
            if(i == 0){
                std::vector<int> a{1};
                result.push_back(a);
            }
            // 处理第 2 行数据
            else if(i == 1){
                std::vector<int> b{1,1};
                result.push_back(b);
            }
            // 从第 3 行开始，每行都以 "1" 结尾，中间的数字是上一行相邻两数之和
            else{
                std::vector<int> tmp;
                // 首部加 1 
                tmp.push_back(1);
                // 将上一行的数据两两相加添加到临时容器`tmp`中
                for(int j = 0; j < result[i-1].size() - 1; ++j){
                    tmp.push_back(result[i-1][j] + result[i-1][j + 1]);
                }
                // 尾部加 1
                tmp.push_back(1);
                // 添加结果
                result.push_back(tmp);
            }
        }
        return result;
    }
};

