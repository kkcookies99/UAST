 class Solution {
public:
    void remove_space(string& s){
        int n = s.size();
        for(int i = 0; i<n; i++){
            if(s[i]!=' '){
                s = s.substr(i, n);
                break;
            }
        }
    }
    void getNumber(string& s){
        int n = s.size();
        for(int i = 0; i<n; i++){
            if(s[i] <= '9' && s[i]>='0'){
                continue;
            }
            s = s.substr(0, i);
        }
    }
    int XXX(string s) {
        int ans = 0;
        remove_space(s);
        bool positive = true;
        bool over = false;
        if(s[0] == '-'){
            positive = false;
            s = s.substr(1, s.size());
        }else if(s[0] == '+'){
            s = s.substr(1, s.size());
        }
        getNumber(s);
        //cout<<INT_MAX<<" "<<INT_MIN<<endl;
        if(s.size() == 0) return ans;
        for(int i = 0; i<s.size(); i++)
        {
            int temp = s[i] - '0';
            if(ans > (INT_MAX-temp)/10){
                over = true;
                //cout<< " over true"<<endl;
            }
            else
            {
                ans = 10 * ans + temp;
            }
        }
        if(over == true){
            return positive == false? INT_MIN: INT_MAX;
        }

        return positive == false? -1*ans: ans;

            
    }
};

