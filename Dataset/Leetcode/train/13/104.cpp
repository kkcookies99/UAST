class Solution {
public:
    int XXX(string s) {
        int result = 0;
        if (s.empty()) {
            return result;
        }   

        int size = s.size();
        for (int i = 0; i < size; i++) {
            switch (s[i])
	        {
                case 'M' : 
                    result += 1000;
                    break;
                case 'D' : 
                    result += 500;
                    break;
                case 'C' : 
                    if (s[i + 1] == 'D') {
                        result += 400;
                        i++;
                        break;
                    }

                    if (s[i + 1] == 'M') {
                        result += 900;
                        i++;
                        break;
                    }

                    result += 100;
                    break;

                case 'L' : 
                    result += 50;
                    break;
            
                case 'X' : 
                    if (s[i + 1] == 'L') {
                        result += 40;
                        i++;
                        break;
                    }

                    if (s[i + 1] == 'C') {
                        result += 90;
                        i++;
                        break;
                    }

                    result += 10;
                    break;
            
                case 'V' : 
                    result += 5;
                    break;
            
                case 'I' : 
                    if (s[i + 1] == 'V') {
                        result += 4;
                        i++;
                        break;
                    }

                    if (s[i + 1] == 'X') {
                        result += 9;
                        i++;
                        break;
                    }

                    result += 1;
                    break;
                    
	            default:
		            break;
	        }  	
        }

        return result;
    }
};

