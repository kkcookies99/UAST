class Solution {
public:
    string XXX(string a, string b) {
        string s;
		/* 字符串逆置，补零 */
        reverse(a.begin() , a.end());
        reverse(b.begin() , b.end());

        while(a.size() != b.size()) {
            if(a.size() < b.size()) {
                a.push_back('0');
            } else if(a.size() > b.size()) {
                b.push_back('0');
            }
        }
		
        /* 
        	sum 结果只可能有四种情况：0，1，2，3
        	其中只有2，3会产生进位，next设为1。sum等于0，1时
        	肯定没产生进位，但是sum等于1时可能使用了上次的进位，所以把next置0
        */
        int next = 0;
        for(int i = 0; i < a.size(); ++ i) {
            int sum = next + (a[i] - '0') + (b[i] - '0');
            if(sum == 0) {
                s.push_back('0');
            } else if(sum == 1) {
                s.push_back('1');
                next = 0;
            } else if(sum == 2) {
                s.push_back('0');
                next = 1;
            } else {
                s.push_back('1');
                next = 1;
            }
        }

        /* 进位 */
        if(next > 0) {
            s.push_back('1');
        }
        reverse(s.begin() , s.end());
        return s;
    }
};

