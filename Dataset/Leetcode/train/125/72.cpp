 class Solution {
public:
    bool XXX(string s) {
        if(s.size()<2) return true;
        int left = 0;
        int right = s.size()-1;
        while(left<=right){
            //左指针
            if(isdigit(s[left])||isalpha(s[left])){
                if(isalpha(s[left])){
                    s[left] = tolower(s[left]);//一律转化成小写
                }
            }else{
                left++;
                continue;
            }
            //右指针
            if(isdigit(s[right])||isalpha(s[right])){
                if(isalpha(s[right])){
                    s[right] = tolower(s[right]);
                }
            }else{
                right--;
                continue;
            }
            //判断
            if(s[left]==s[right]){
                left++;
                right--;
            }else{
                return false;
            }
        }
        return true;
    }
};

