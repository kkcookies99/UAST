 class Solution {
public:
    string XXX(int n) {
        if(n==1) return "1";

        string prev=XXX(n-1), result="";
        int count = 1;
        for(int i=0; i<prev.length(); i++){
            if(prev[i] == prev[i+1]) count++;
            else{
                result.push_back(count+'0');
                result.push_back(prev[i]);
                count = 1;
            }
        }
    return result;
    }
};

