class Solution {
    public String XXX(String a, String b) {
        String max = Max(a,b);
        int max_index = max.length()-1;
        String min = Min(a,b);
        int min_index = min.length()-1;
        Stack<String> stack = new Stack<>();
        String s = "0"; 
        if(a.length() == b.length()){
            max = a;
            min = b ;
        }
        while(max_index != -1){
            if(min_index <= -1){
                if(max.charAt(max_index) == '1' || s == "1"){
                    if(max.charAt(max_index) == '1' && s == "1"){
                        stack.push("0");
                        s = "1";
                    }else{
                        stack.push("1");
                        s = "0";
                    }
                }else{
                    stack.push("0");
                    s = "0";
                }
            }else{
                if(max.charAt(max_index) == '1' || min.charAt(min_index) == '1'){
                    if(max.charAt(max_index) == '1' && min.charAt(min_index) == '1'){
                        if(s == "1"){
                            stack.push("1");
                        }else{
                            
                            stack.push("0");
                        }
                        s = "1";
                    }else{
                        if(s == "1"){
                            
                            stack.push("0");
                            s = "1" ;
                        }else{
                            
                            stack.push("1");
                            s = "0" ;
                        }
                    }
                }else{
                    if(s == "1"){
                        stack.push("1");
                    }else{
                        stack.push("0");
                    }
                    s = "0" ;
                }
            }
            max_index-- ;
            min_index-- ;
        }
        if(s == "1")stack.push("1");
        StringBuilder sum = new StringBuilder();
        while(!stack.isEmpty()){
            sum.append(stack.pop());
        }
        return sum.toString();
    }
    public String Max(String a,String b){
        return a.length() == Math.max(a.length(),b.length()) ? a : b ;
    }
    public String Min(String a,String b){
        return a.length() == Math.min(b.length(),a.length()) ? a : b ;
    }
}

