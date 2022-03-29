 class Solution {
public:
    string XXX(string s) {
        if(s.size() == 1) return s;
        // cout << s.size() << endl;
        vector<string> res;
        vector<int> visit(1010);
        string a = "";
        a.push_back(s[0]);
        res.emplace_back(a), visit[1]++;
        int mx = 1;
        // string test = s.substr(0,1);
        // cout << test << endl;
        for(int i=0; i<s.size(); ++i){
            string tmp = "";
            for(int k=s.size()-1; k>i; --k){
                if(s[i] == s[k]){
                    tmp.assign(s.begin()+i, s.begin()+k+1);
                    if(tmp.size() <= mx) break;
                    // cout << tmp << endl;
                    int n = tmp.size()-1, len = tmp.size();
                    string pre = "", aft = "";
                    if(visit[len] == 0){
                        if(len <= 2) pre = tmp[0], aft = tmp[1];
                        else if(len % 2 == 0){
                            pre = tmp.substr(0, n/2+1);
                            aft = tmp.substr(n/2+1, n+1);
                            // cout << "1-> " << pre << ',' << aft <<endl;
                        }
                        else if(len % 2 == 1){
                            pre = tmp.substr(0, n/2);
                            aft = tmp.substr(n/2+1, n+1);
                            // cout << "2-> " << pre << ',' << aft <<endl;
                        }
                        reverse(pre.begin(), pre.end());
                        if(pre == aft){
                            // cout << pre << ',' << aft << endl;
                            mx = max(mx, len);
                            res.emplace_back(tmp);
                            visit[tmp.size()]++;
                        }
                    }
                }
            }
        }
        // cout << mx << endl;
        // for(auto i : res) cout << i << endl;
        for(auto i : res) if(i.size() == mx) return i;

        return "";
    }
};

