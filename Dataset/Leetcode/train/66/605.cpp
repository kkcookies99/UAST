class Solution {
public:
    vector<int> XXX(vector<int>& digits) {
        int count = digits.size() -1;
        int up = 0;
        while(count >= 0) {
            int tmp = digits[count];
            int total = tmp + up;
            if(count == digits.size() -1) {
                total+=1;
            }
            digits[count] = total % 10;
            if(total>=10) {
                up = 1;
            } else {
                up = 0;
            }
            count--;
        }
        if(up) {
            digits.insert(digits.begin(),1);
        }
        return digits;
    }
};

