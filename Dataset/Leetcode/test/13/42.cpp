class Solution {
public:
    int XXX(string s) {
        vector<int> tmp;
        for (const auto& c: s) {
            switch(c) {
                case 'M':
                    tmp.push_back(1000);
                    break;
                case 'D':
                    tmp.push_back(500);
                    break;
                case 'C':
                    tmp.push_back(100);
                    break;
                case 'L':
                    tmp.push_back(50);
                    break;
                case 'X':
                    tmp.push_back(10);
                    break;
                case 'V':
                    tmp.push_back(5);
                    break;
                case 'I':
                    tmp.push_back(1);
                    break;
                default:
                    break;
            }
        }
        int res = 0;
        int lens = tmp.size();
        tmp.push_back(0);
        for(int i = 0; i < lens; ++i) {
            if(tmp[i] >= tmp[i+1])
                res += tmp[i];
            else
                res -= tmp[i];
        }
        return res;
    }
};

