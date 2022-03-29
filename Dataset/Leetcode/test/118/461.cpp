 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {

        vector<vector<int>> arr;
        if (numRows == 0) {
            return arr;
        }
        //第一行 递归吗？
        vector<int> row;
        row.push_back(1);
        arr.push_back(row);
        //    杨辉三角
        for (int i = 0; i < numRows - 1; i ++) {
            vector<int> dest = getRowArr(arr[i]);
            arr.push_back(dest);
        }
        return arr;
    }
    
    vector<int> getRowArr(vector<int> row) {
        vector<int> dest;
        //通过当前行，推算下一行的数据
        for (int i = 0; i < row.size() + 1; i ++) {
            if (i == 0) {
                dest.push_back(1);
            } else if(i == row.size()) {
                dest.push_back(1);
            } else {
                dest.push_back(row[i - 1] + row[i]);
            }
        }
        return dest;
    }
};

