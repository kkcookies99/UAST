 class Solution {
public:
    bool XXX(string s) {
        int len=s.size();
        int left=0,right=len-1;
        while(right>left){
            while(right>=0&&isValid(s[right])==false){
                --right;
            }
            while(left<len&&isValid(s[left])==false){
                ++left;
            }
            if(right<=left)break;
            if(isEqual(s[left],s[right])==false)return false;
            ++left,--right;
        }
        return true;
    }
private:
    bool isEqual(char a,char b){
        if(isdigit(a)||isdigit(b)){
            return a==b;
        }
        else{
            return a==b||(a-b)=='A'-'a'||(a-b)=='a'-'A';
        }
    }
    bool isValid(char c){
        if(c>='0'&&c<='9')return true;
        if(c>='a'&&c<='z')return true;
        if(c>='A'&&c<='Z')return true;;
        return false;
    }
};

