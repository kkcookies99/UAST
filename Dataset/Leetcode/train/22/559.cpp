 class Solution {
public:

    vector<string> ans;
    void fun1(int left, int right, string str){
        if(right == 0){
            ans.push_back(str);
            return;
        }
        if(left > 0)        fun1(left - 1, right, str+"(");
        if(right > left)    fun1(left, right - 1, str+")");
    }

    vector<string> XXX(int n) {
        fun1(n, n, "");
        return ans;
    }

};

