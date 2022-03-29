 class Solution {
public:
    string XXX(vector<string>& strs) {
        string publicstr="";
        char publicchar;
        int count=0,i=0;
        while(1){
           publicchar=strs[0][count];
           for(i=0;i<strs.size();i++){
            if(strs[i].length()<count+1)
                break;
            else{
                if(strs[i][count]!=publicchar)
                    break;
            } 
        } 
        if(i==strs.size()){
            publicstr+=publicchar;
            count++;
        }  
        else
            break;      
       
        }
        return publicstr;
        
    }
};

