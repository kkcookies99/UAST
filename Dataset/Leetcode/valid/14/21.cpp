 class Solution {
public:
    string XXX(vector<string>& strs) {
string ans={""};
int n=INT_MAX;
for(auto& str:strs){
   if(str.size()<n){
       n=str.size();
   }
}//获取字符串数组中最短字符串长度n，只需比较每个字符串的前n个字符
int count=1;
for(int i=0;i<n;i++){
   for(int j=1;j<strs.size();j++){
       if(strs[j][i]!=strs[0][i]){
           count=0;
           break;
       }
   }
   if(count){
       ans+=strs[0][i];
   }
}
return ans;   }
};

