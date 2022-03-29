 class Solution {
public:
    vector<vector<int>> XXX(int numRows) {
        vector<vector<int>> gen(numRows);
        for(int i=0;i<numRows;i++){
            if(i==0) gen[i]={1};
            else{
                gen[i].push_back(1);
                for(int j=1;j<i;j++){
                    gen[i].push_back(gen[i-1][j-1]+gen[i-1][j]);
                }
                gen[i].push_back(1);
            }

        }
        return gen;
        
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


