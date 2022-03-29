class Solution {
public:
    string XXX(int n) {
        string result = "1";
        string newResult = "";
        for(int i=1;i<n;i++){
            // cout << result << endl;
            newResult = "";
            char cur = result[0];
            int cnt = 0;
            for(int j=0;j<result.size();j++){
                if(result[j]==cur){
                    cnt++;
                }
                else{
                    newResult += to_string(cnt)+cur;
                    cur = result[j];
                    cnt = 1;
                }
            }
            newResult += to_string(cnt)+cur;
            result = newResult;
        }

        return result;
    }
};

