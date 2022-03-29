 class Solution {
    public int XXX(String str) {
        if(str == "" || str == null || str.trim().isEmpty()){
            return 0;
        }
        str = str.trim();
        if(str.charAt(0)>= '0' && str.charAt(0) <= '9' || str.charAt(0) == '-' || str.charAt(0) == '+'){
            StringBuffer s = new StringBuffer();
            for(int i = 0; i < str.length(); i++){
                if(i == 0){
                    if(str.charAt(0) == '0'){
                        if(str.charAt(1) == '-' || str.charAt(1) == '+'){
                            return 0;
                        }
                        continue;
                    }
                    if(str.charAt(0) == '-' || str.charAt(0) == '+'){
                        s.append(str.charAt(0));
                        if(str.length() > 1 && (str.charAt(1) == '-' || str.charAt(1) == '+')){
                            return 0;
                        }
                    }
                }
                if(i == 1){
                    if(str.charAt(1) == '.'){
                        s.append(str.charAt(1));
                    }
                }
                if((str.charAt(i) >= '0' && str.charAt(i) <= '9')){
                    s.append(str.charAt(i));
                }
                if(i < str.length()-1){
                    if(str.charAt(i+1) < '0' || str.charAt(i+1) > '9'){
                        if(str.charAt(i+1) == ' '){
                            break;
                        }else{
                            break;
                        }
                    }
                }
            }
            if(s.length() == 1){
                if(s.charAt(0) == '-' || s.charAt(0) == '+'){
                return 0;
            }
            }
            if(!s.toString().isEmpty()){
                double num = Double.valueOf(s.toString());
                return (int)num;
            }
            return 0;
        }else{
            return 0;
        }
    }
}

