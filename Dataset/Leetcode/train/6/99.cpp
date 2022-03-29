 class Solution {
public:
    string XXX(string s, int numRows) {
        int i,mid;   // i 第几行的开始，mid表示中间插入的
        int steer;  // 步长
        string ans = "";
        steer = 2*numRows - 2;
        steer = steer<=0 ? 1 : steer;
        // cout << "steer: " << steer << endl;

        for (i = 0; i < numRows; i++) {
            mid=steer-i;
            // cout << "mid: " << mid << endl;
            if (mid == i || mid == steer) {
                for(int k=0; i + k < s.size(); k=k+steer) {
                    // cout << s[i+k] << endl;
                    // cout << i << ": " << k << endl;
                    ans.push_back(s[i+k]);
                }
            }
            else{
                for(int k=0; i + k < s.size(); k=k+steer) {
                    ans.push_back(s[i+k]);
                    if(mid + k < s.size()){  
                        ans.push_back(s[mid+k]);
                    }
                }
            }
            
        }
        return ans;
    }
};


