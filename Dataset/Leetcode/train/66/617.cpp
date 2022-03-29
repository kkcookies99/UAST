class Solution {
public:
    vector<int> XXX(vector<int>& digits) {
        bool badd = true;
        for(int i=digits.size()-1;i>=0;i--)
        {
            if(badd == false)
            {
                break;
            }
            digits[i] += 1;
            if(digits[i] == 10)
            {
                badd = true;
                digits[i] = 0;
            }
            else
            {
                badd = false;
                break;
            }
        }
        if(badd == true)
        {
            digits.insert(digits.begin(),1);
        }
        
        return digits;
    }
};

