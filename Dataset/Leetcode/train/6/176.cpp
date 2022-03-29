 class Solution {
public:
    string XXX(string s, int numRows) {
        if(numRows == 1) return s;
        string res;
        //观察发现，规律就是以“|/”的形式重复，就是N没有右边的斜杠
        //重复的周期数呢，就是“|”和“/”加起来，竖线就是numRows，斜线就是numRows - 2，加起来就是2n - 2
        int loop = 2 * numRows - 2;
        //画板的总列数就是（周期个数）乘上（每周期有多少列）
        //观察可知，每个“|/”周期有numRows - 1列，个数就是（字符串大小/周期 + 1，两数相乘就是总列数
        size_t column = (s.size() / loop + 1) * ( numRows - 1 );
        vector<vector<char>> grid(numRows, vector<char>(column, '0'));
        //处理字符串的每个元素
        for(int i = 0; i < s.size(); i++){
            //找出当前索引，在周期中的位置，即在 “|/” 哪个地方。
            int p = i % loop;
            //算行
            //如果在|上，那就是p，在/上，就有些麻烦，因为是从下往上涨，所以要反向计算，建议用几个例子试试就清楚了。
            int rowPos = p < numRows ? p : ( numRows - 1 - (p % numRows + 1) );
            //算列
            //列要更麻烦些，先算出是在第几个周期的列数上，思路和算画板总列数是一样的
            int colPos = (i / loop) * (numRows - 1);
            //再算出具体的位置，如果是在|上，那啥也不用加，在/上就要计算了，这个求模就行，很简单。
            colPos += p < numRows ? 0 : p % numRows + 1;
            //然后行列都有了，转化成功
            grid[rowPos][colPos] = s[i];
        }
        //遍历矩阵
        for( size_t i = 0; i < numRows; i++ ){
            for( size_t j = 0; j < column; j++ ){
                if(grid[i][j] != '0') res.push_back(grid[i][j]);
            }
        }

        return res;
    }
};

