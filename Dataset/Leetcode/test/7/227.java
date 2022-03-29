class Solution {    
public:                                                                                            
    int XXX(int x) {                                                                           
        std::string str = std::to_string(x);    
        std::XXX(str.begin(), str.end());    
        int result;       
                          
        try {             
            result = str[str.size() - 1] == '-' ?    
                - std::stoi(str) : std::stoi(str);    
        } catch (std::out_of_range &) {    
            return 0;     
        }                 
        return result;    
    }                     
};

