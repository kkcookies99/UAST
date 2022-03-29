class Solution {
public:
    vector<int> XXX(vector<int>& digits) {
        vector<int> res;
        for(int i=digits.size()-1;i>=0;i--){
            if(digits[i]==9)
                digits[i]=0;
            else{
                digits[i]+=1;
                break;
            }
        }
        if(digits[0]==0)
            res.push_back(1);
        res.insert(res.end(),digits.begin(),digits.end());
        return res;
    }
};

