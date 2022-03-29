class Solution {
public:
    string XXX(string a, string b) {
int i=a.size()-1; int j=b.size()-1;
int car=0;
string ans="";int result;
while(i>=0||j>=0){
    int x=(i>=0) ?x=a[i]-'0': 0;
    int y=(j>=0) ?y=b[j]-'0':0;
    if(x+y+car==2){
        car=1;
        result=0;
       } else if(x+y+car==3){
            result=1;car=1;
        }
    else{
      result=x+y+car;
        car=0;
    }
    ans.push_back('0'+result);
    i--;j--;
}
if(car==1) ans.push_back(1+'0');
reverse(ans.begin(),ans.end());
return ans;
    }
};

