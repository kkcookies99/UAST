 class Solution {
public:
    string XXX(int n) {
        string q = "1";
        for(int i = 1;i < n;++i){
            string a = "";
            int count = 0;
            int temp;
            for(int j = 0; j < q.length();){
                temp = q[j];
                count = 0;
                while(q[j] == temp && q[j] != '\0'){
                    ++count;
                    ++j;
                }
                a += ('0'+count);
                a += temp;
            }
            q = a;
            if(i == n-1) return q;
        }
        return "1";
    }
};

