 class Solution {
public:
    string XXX(vector<string>& strs) {
        string t = "";
        if(strs.empty()) return t;
		
		int i,j;
		for(i = 0; i < sizeof(strs[0]); i++)
		{
			for(j = 1; j < strs.size(); j++)
			{
				if(strs[0][i]!=strs[j][i])
				{
					return t;
				}
			}
			
			t+=strs[0][i];
		 }
         return "";
		  
    }
};


undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


