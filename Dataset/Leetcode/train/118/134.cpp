 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        int turn = 0;               // 行
        vector<int> temp;           // 临时变量
        vector<vector<int>> result; // 结果

        while (turn < numRows) {
            temp.push_back(1);  // 每行首元素1

            for (int i=1; i<turn; i++) {
                temp.push_back(result[turn-1][i-1] + result[turn-1][i]);    // 根据规律push元素
            }

            if (turn > 0)
                temp.push_back(1);  // 第二行后，行尾元素1

            result.push_back(temp); // 每行结果push进result
            temp.clear();           // 临时变量清零
            turn++;                 // 下一行
        }

        return result;
    }
};

