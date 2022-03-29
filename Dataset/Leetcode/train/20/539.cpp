 class Solution {
public:
    bool XXX(string s) {
        std::unordered_map<char,int> my_map={
            {')','('},
            {'}','{'},
            {']','['},
        };
        int my_size = s.size();
        bool result = true;
        stack<char> my_stack;
        cout<<"my_size: "<<my_size<<endl;
        if(my_size%2!=0){
            return false;
        }
        else{
            for(int i=0;i<=s.size()-1;i=i+1){
                if(my_map.count(s[i])){
                    if(my_stack.empty()||my_stack.top()!=my_map[s[i]]){
                        return false;
                    }
                    my_stack.pop();
                }else{
                    my_stack.push(s[i]);
                }
            }
            return my_stack.empty();
        }
    }
};

