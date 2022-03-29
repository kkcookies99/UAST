 class Solution {
public:
    bool XXX(string s) {
        if(s.size()<2)return true;

        auto left=0;
        auto right=s.size()-1;
        transform(s.begin(),s.end(),s.begin(),::tolower);

        while(left<right){
            if (((s[left]>='0' && s[left]<='9') || (s[left]>='a' && s[left]<='z'))){
                if (((s[right]>='0' && s[right]<='9') || (s[right]>='a' && s[right]<='z'))){
                    if(tolower(s[right])!=tolower(s[left])){

                        return false;
                    }
                    else{
                        left++;
                        right--;
                    }
                }
                else{right--;}
            }
            else{left++;}
        }
        return true;

    }
};

