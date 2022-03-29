 class Solution {
public:
    bool XXX(string s) {
        if(s.size()<=1)
            return true;
        string str;
        for(auto c:s)
            if(isalnum(c))
                str += tolower(c);
        int left(0),right(str.length()-1);
        while(left < right){
            if(str[left]!=str[right])
                return false;
            left++;
            right--;
        }
        return true;
    }
};

