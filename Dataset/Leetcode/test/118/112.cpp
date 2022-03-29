 class Solution {
public:
    vector<vector<int> > XXX(int numRows) {

    vector<vector<int> > result;
    //先初始化前两行
    vector<int> tmp;
    tmp.push_back(1);
    result.push_back(tmp);
    tmp.push_back(1);
    result.push_back(tmp);


    for(int i=2;i<numRows;i++){
        vector<int> cmp;
        for(int j=0; j<i+1; j++){
            if(j==0 || j==i+1)
                cmp.push_back(1);
            else
                cmp.push_back(result[i-1][j-1] + result[i-1][j]);     
        }
        result.push_back(cmp);
    }

    return result;
}
};

