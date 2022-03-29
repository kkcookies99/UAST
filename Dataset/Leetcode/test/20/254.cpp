 class Solution {
public:
    bool XXX(string s) {
        stack<char> stack;
        unordered_map<char, char> map;
        map[')'] = '(', map[']'] = '[', map['}'] = '{';
        for (char i : s){
            if (stack.size() == 0 || stack.top() != map[i])
                stack.push(i);
            else
                stack.pop();
        }
        return stack.size() == 0 ? true : false;
    }
};

