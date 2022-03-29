 class Solution {
public:
    bool XXX(string s) {
        if (s.length() <= 1)
            return true;

        transform(s.begin(),s.end(),s.begin(),::tolower);
        int i = 0, j = s.length()-1;
        while( i<j ){
            while( (s[i] < 'a'|| s[i] > 'z') && (s[i] < '0'|| s[i] > '9')){
                i++;
                if(i>j)
                    return true;
            }
            while( (s[j] < 'a'|| s[j] > 'z') && (s[j] < '0'|| s[j] > '9') )
                j--;
            if (s[i]!=s[j])
                return false;
            else{
                i++;
                j--;
            }

        }
        return  true;
    }
};

