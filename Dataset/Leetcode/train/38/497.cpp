 class Solution {
public:
    string XXX(int n) {
        string preStr = "1";      
        for(int i=0;i<n-1;i++){
            string curStr;
            int left = 0,right = 0;
            while(right < preStr.size()){
                while(right<preStr.size() && preStr[left]==preStr[right]){
                    right++;
                }
                curStr += to_string(right-left);
                curStr += preStr[left];
                left = right;
            }
            preStr = curStr;
        }
        return preStr;
    }
};

