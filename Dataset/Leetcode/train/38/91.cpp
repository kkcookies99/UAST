class Solution {
public:
    string XXX(int n) {
        string strs[2];
        strs[0] = "1";
        int index = 1;
        for(int i=2;i<=n;i++){
            //index = (index+1)%2;
            strs[(i+1)%2] = "";
            for(int j = 0;j<strs[i%2].length();j++){
                char c = strs[i%2][j];
                int count = 1;
                while(strs[i%2][++j]&&c==strs[i%2][j]){
                    count++;
                }
                j--;
                strs[(i+1)%2].push_back(count+'0');
                strs[(i+1)%2].push_back(c);
            }
        }
        return strs[(n+1)%2];
    }
};

