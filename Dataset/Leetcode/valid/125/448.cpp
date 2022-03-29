 class Solution {
public:
int CheckChar(char x){
    if(x>=65&&x<=90) return 1;
    if(x>=97&&x<=122) return 2;
    if(x>=48&&x<=57) return 3;
    return 0;
}
string modify(string x){
	string result="";
	for(int i=0;i<x.length();i++){
		if(!CheckChar(x[i])) continue;
		if(CheckChar(x[i])==1) x[i]+=32;
		result+=x[i];
	}
	return result;
} 

bool XXX(string s) {
	for(int i=0;i<s.length()/2;i++) if(s[i]!=s[s.length()-1-i]) return false;
	return true;
}
};

