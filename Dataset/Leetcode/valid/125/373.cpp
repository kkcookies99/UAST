 class Solution {
public:
    bool XXX(string s) {
        string temp = "";
        for(int i = 0; i < s.length(); i++){
            if(s[i] >= 'a' && s[i] <= 'z'){
                temp += s[i] - 32;
            }
            else if(s[i] >= 'A' && s[i] <= 'Z')
                temp += s[i];
            else if(s[i] >= '0' && s[i] <= '9'){
                temp += s[i];
            }
            else{continue;}
        }
        int left = 0, right = temp.length() - 1;
        //cout << temp << endl;
        while(left < right){
            if(temp[left] != temp[right])
                return false;
            left++; right--;
        }
        return true;
    }
};

