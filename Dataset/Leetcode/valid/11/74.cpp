class Solution {
public:
    int XXX(vector<int>& height) {
        int ret = 0;
        vector<int>::iterator b = height.begin();
        vector<int>::iterator e = height.end();
        while (b != e) {
            if ((e-b)*min(*b, *e) >= ret) {
                ret = (e-b)*min(*b, *e);
            } 
            if (*b <= *e) {
                ++b;
            } else {
                --e;
            }
        }

        return ret;
    }
};

