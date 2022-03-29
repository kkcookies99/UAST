 class Solution {
public:
    bool XXX(string s) {
//双指针
string ss="";
int i=0;
for(;i<s.size();i++){
    char c=s[i];
    if(((c>='a'&&c<='z')||(c>='A'&&c<='Z')||(c>='0'&&c<='9')))
       ss+=c;
    else {
       continue;
    }
}

int left=0;
int right=ss.size()-1;
while(left<=right){
    if(ss[left]<='Z'&&ss[left]>='A')ss[left]=ss[left]-'A'+'a';
    if(ss[right]<='Z'&&ss[right]>='A')ss[right]=ss[right]-'A'+'a';
    if(ss[left]!=ss[right]){
          return false;
    }
     left++;
     right--;
     }
     return true;
    }
};

