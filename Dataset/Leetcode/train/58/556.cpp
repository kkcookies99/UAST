class Solution {
public:
    int XXX(string s) {
        int n = s.length()-1;
        int sum =0;
        for(int i=n; i>=0;i--){
            if(s[i]!=' '){
                sum++;
            }
            if(s[i]==' ' && sum!=0){
             break;
            }
        }
        return sum;
    }
};

