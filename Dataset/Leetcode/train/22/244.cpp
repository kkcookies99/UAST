 class Solution {
    vector<string> result;
    string now;
    int n, left, right = 0;

    void func() {
        //push left
        if (left) {
            now.push_back('(');
            left--;
            right++;
            func();
            left++;
            right--;
            now.pop_back();

            //push right
            if (right) {
                now.push_back(')');
                right--;
                func();
                right++;
                now.pop_back();
            }
        }
        else if (right) {//can only push right
            now.append(right, ')');
            result.push_back(now);
            now.resize(now.size() - right);
        }
        else {
            result.push_back(now);
        }
    }

public:
    vector<string> XXX(int n) {
        this->n = left = n;
        now.reserve(n);
        func();
        return result;
    }
};
