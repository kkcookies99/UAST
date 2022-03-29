 class Solution {
public:
    string XXX(int n) {
        vector<string> res(n+1);
        res[0]="",res[1]="1",res[2]="11",res[3]="21",res[4]="1211",res[5]="111221";
        for(int i=6;i<=n;i++){
            string temp;
            int count=1;
            for(int j=0;j<res[i-1].size();j++){
                if(j==res[i-1].size()-1){
                    temp.push_back('0'+count);
                    temp.push_back(res[i-1][j]);
                }
                else if(res[i-1][j]==res[i-1][j+1])count++;
                else{
                    temp.push_back('0'+count);
                    temp.push_back(res[i-1][j]);
                    count=1;
                }
            }
            res[i]=temp;
        }
        return res[n];
    }
};

