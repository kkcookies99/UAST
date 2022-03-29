 class Solution {
public:
    string XXX(int n) {
        if(n==1) return "1";

        string privious = XXX(n-1);
        string result = "";
        int count = 1;
        for(int i=0; i<privious.size(); ++i){
            if(privious[i] == privious[i+1]){
                count++;
            }else{
                result += to_string(count) + privious[i];
                count = 1;
            }
        }
        return result;
    }
};

