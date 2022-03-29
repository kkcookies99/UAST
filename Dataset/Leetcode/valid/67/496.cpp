class Solution {
public:
    string XXX(string a, string b) {
        int t = 0;
        // a is longer than b
        if (b.size() > a.size())
            swap(a,b);

        int j = b.size()-1;
        for (int i = a.size()-1; i >= 0; i--) {
            int aa = (a[i] == '1')? 1:0;
            int bb = (j >= 0 && b[j] == '1') ? 1:0;
            
            int curr = (aa+bb+t)%2;
            t = (aa+bb+t)/2;
           
            a[i] = curr == 1?'1':'0';

            if (j < 0 && t == 0) return a;

            j--;
        }

        
        string ans;
        if (t > 0) ans.push_back('1');
        ans = ans+a;

        return ans;
    }
};

