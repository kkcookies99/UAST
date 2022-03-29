class Solution {
private:
    string _XXX(string re, int n){
        if(n == 0) return re;
        string current;
        char key = re[0];
        int count = 1;
        int i = 1;
        for(int i = 1; i < re.size(); i++){
            if(key == re[i]) count++;
            else{
                current += to_string(count) + key;
                key = re[i];
                count = 1;
            }
        }
        current += to_string(count) + key;
        return _XXX(current,n-1);
    }
public:
    string XXX(int n) {
        string re = "1";
        if(n == 1) return re;
        return _XXX(re,n-1);
    }
};

