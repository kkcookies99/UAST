 public boolean XXX(String s) {

    Stack bracket = new Stack();
    for(int i=0;i<s.length();i++){
        char temp = s.charAt(i);
        if(temp=='('){
            bracket.push(temp);
        }else if(temp=='['){
            bracket.push(temp);
        }else if(temp=='{'){
            bracket.push(temp);
        }else if(temp==')'){
            if(bracket.isEmpty()){
                return false;
            }else{
                if(bracket.pop().equals('(')){
                     
                }else{
                    return false;
                }
            }

        }else if(temp==']'){
           if(bracket.isEmpty()){
                return false;
            }else{
                if(bracket.pop().equals('[')){
                      
                }else{
                    return false;
                }
            }

        }else if(temp=='}'){
            if(bracket.isEmpty()){
                return false;
            }else{
                if(bracket.pop().equals('{')){
                                         
                }else{
                    return false;
                }
            }
        }

    }
    if(bracket.isEmpty()){
        return true;
    }else{
        return false;
    }

}

