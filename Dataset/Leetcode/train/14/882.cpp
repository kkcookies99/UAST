 class Solution {
public:
    string XXX(vector<string>& strs) {
		int minlen = 999999;
		for(int i = 0; i < strs.size(); i++) {
			if(strs.at(i).length() < minlen) minlen = strs.at(i).length();
		}

		if(strs.size() == 0) return "";

		string res;

		for(int i = 0; i < minlen; i++) {
			char c = strs.at(0)[i];
			bool flag = true;
			for(int j = 0; j < strs.size(); j++) {
				if(strs.at(j)[i] != c) flag = false;
			}
			if(flag) res += c;
            else return res;
		}

		return res;
    }
};

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


