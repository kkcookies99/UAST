 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        if(numRows==1)
            return {{1}};
        else if(numRows==2)
            return {{1},{1,1}};
        else
        {
            vector<vector<int>> result;
            result.push_back({1});
            result.push_back({1,1});
            for(int i=2;i<numRows;i++)
            {
                vector<int> temp;
                temp.push_back(1);
                for(int j=0;j<result[i-1].size()-1;j++)
                {
                    temp.push_back(result[i-1][j]+result[i-1][j+1]);
                }
                temp.push_back(1);
                result.push_back(temp); 
            }
            return result;
        }
            
    }
};

