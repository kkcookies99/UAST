class Solution {
public:
    string XXX(string a, string b) {
        int jin =0;
        string ans ="";
        if(a.size()<b.size()){
            string t = a;
            a = b;
            b = t;
        }
        int j = a.size() - 1;
        for(int i = b.size() - 1; i >= 0; --i, --j){
            int t = jin + a[j] - '0' + b[i] - '0';
            if(t == 3){
                ans = "1" + ans;
                jin = 1;
            }
            else if(t == 2){
                ans = "0" + ans;
                jin = 1;
            }
            else{
                ans = to_string(t) + ans;
                jin = 0;            
            }
        }
        while(j >= 0){
            int t = jin + a[j] - '0';
            if(t == 2){
                ans = "0" + ans;
                jin = 1;
            }
            else{
                ans = to_string(t) + ans;
                jin = 0;
            }
            j--;
        }
        if(jin == 1){
            ans = "1" + ans;
        }
        return ans;
    }
};

