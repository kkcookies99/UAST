class Solution {
public:
    string XXX(int n) {
        string tmp = "1", now = "1";
        int count;
        for (int i=2; i<=n; i++){
            now = "";
            count = 1;
            for (int j=1; j<tmp.length(); j++){
                if (tmp[j] == tmp[j-1]){
                    count++;
                }
                else{
                    now += to_string(count);
                    now += tmp[j-1];
                    count = 1;
                }
            }
            now += to_string(count);
            now += tmp[tmp.length()-1];
            tmp = now;
        }
        return now;
    }
};

