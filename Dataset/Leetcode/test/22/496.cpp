 class Solution {
public:
    vector<string>vec_ret;
    vector<string> XXX(int n) {
        vector<char>temp;
        for(int i=0;i<n;i++){temp.insert(temp.begin(),'('); temp.emplace_back(')');}
        do{
            if(judge(temp)==1)  {string str(temp.begin(),temp.end()); vec_ret.emplace_back(str);}
        }while(next_permutation(temp.begin(),temp.end()));
        return  vec_ret;
    }

    bool judge(vector<char>_try){
        stack<char>s;
        int index=0;
        while(index<_try.size()){
            if(s.size()==0&&_try[index]==')')   return 0;
            else if(_try[index]=='(')    s.push(_try[index++]);
            else {s.pop(); index++;}
        }return 1;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


