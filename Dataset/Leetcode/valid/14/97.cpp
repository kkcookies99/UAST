 class Solution {
public:
    string XXX(vector<string>& strs) {
        // if str size less than 1
        // just return the first element,
        // notice that the problem says strs.size()>=1
        if(strs.size()<=1){
            return strs[0];
        }

        // create result using the first element
        string result = strs[0];

        // iterate through the strs
        for(int i=1;i<strs.size();i++){
            // if the element has size 0,
            // then return ""
            if(strs[i].size()==0){
                result = "";
                break;
            }

            bool equalFlag = false;
            int prefixLen = 0;

            // check the same prefix one by one
            for(;prefixLen<min(strs[i].size(), result.size());prefixLen++){
                if(strs[i][prefixLen]==result[prefixLen]){
                    equalFlag = true;
                }
                else{
                    break;
                }

            }

            // if they do have same prefix, then update result
            if(equalFlag){
                result = result.substr(0, prefixLen);
            }
            // otherwise, return ""
            else{
                result = "";
                break;
            }
        }

        return result;
    }
};

