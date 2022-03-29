 class Solution {
public:
    string XXX(vector<string>& strs) {
       if(strs.size()<1) return "";
        

     //进行对比
        string result = strs.at(0);
        string temp = strs.at(0);
        for(int i =1;i<strs.size();i++)
        {
            int index = 0;
            while((index < temp.length() && index<strs.at(i).length()) && (strs.at(i)[index] == temp[index])){
                index++;
            }
            temp=strs.at(i).substr(0,index);
            result = result.size()<temp.size()? result:temp;
        }
        return result;
    }
};

