 class Solution {
private:
    struct Tnode{
        int value,lnum;
        string s;
        Tnode(int _value,int _lnum,string _s)
        {
            value=_value;
            lnum=_lnum;
            s=_s;
        }
    };
public:
    vector<string> XXX(int n) {
        vector<string> ans;
        queue<Tnode> q;
        if(n==0) return ans;
        if(n==1) 
        {
            ans.push_back("()");
            return ans;
        }
        Tnode node(1,1,"(");
        q.push(node);
        int level=1;
        while(!q.empty()&&level<n*2)
        {
            int size=q.size();
            Tnode node=q.front();
            q.pop();
            if(node.lnum<n)
            {//左括号
                Tnode tmp(node.value+1,node.lnum+1,node.s+"(");
                q.push(tmp);
            }
            if(node.value>0) 
            {//右括号
                Tnode tmp(node.value-1,node.lnum,node.s+")");
                q.push(tmp);
            }
            if(node.lnum==n&&node.value==0)
            {//一种情况组合完毕
                ans.push_back(node.s);
            }
            if((--size)==0){
                size=q.size();
                level++;
            }
        }
        return ans;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }

