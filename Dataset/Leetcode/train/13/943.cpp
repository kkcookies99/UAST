 class Solution {
public:
    int XXX(string s) {
        map<char, int> code{{'I',1},{'V',5},{'X',10},{'L',50},
                            {'C',100},{'D',500},{'M',1000}};
        int sum = 0;
        if (s.size()==1)
            return code[s[0]];
        while (true){
            if (s.size()==1){
                sum += code[s[0]];
                break;
            }
            else{
                if (code[s[0]]<code[s[1]])
                    sum -= code[s[0]];
                else
                    sum +=code[s[0]];
            }
            s.erase(s.begin());
        }
        return sum;
    }
};

