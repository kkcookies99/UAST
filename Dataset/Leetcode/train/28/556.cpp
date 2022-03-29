 class Solution {
public:
    vector<int> next;

    void get_next(string needle){
        int forward=-1,back=0;
        next[0]=-1;
        while(back<needle.size()){
            if(forward==-1||needle[forward]==needle[back]){
                next[++back]=++forward;
            }
            else{
                forward=next[forward];
            }
        } 
    }
    
    int XXX(string haystack, string needle) {
       if(!needle.size()) return 0;
       
        vector<int> vec(needle.size()+1);
        next=vec;
        get_next(needle);
        int pt=0,pm=0;
        while(pt<haystack.size()&&pm<needle.size()){
            
            
            
            if(haystack[pt]==needle[pm]){
                pt++;pm++;

            }
            else{
                pm=next[pm];
                if(pm==-1) {pm=0;pt++;}
            }

            if(pm==needle.size()){
                return pt-pm;
            } 

        }

        return -1;
    }
};

