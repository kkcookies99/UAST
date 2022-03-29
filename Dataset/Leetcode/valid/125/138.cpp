 class Solution {
public:
    bool XXX(string s) {
        int left=0,right=s.size()-1;
        while(left<right){
            while(left<right&&!isalnum(s[left]))left++;
            while(left<right&&!isalnum(s[right]))right--;
            if(toupper(s[left++])!=toupper(s[right--]))return false;
        }
        return true;
    }
};

