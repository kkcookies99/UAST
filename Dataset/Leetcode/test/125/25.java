  public boolean XXX(String s) {
      
      /**
      // 直接reverse()翻转
       StringBuilder str=new StringBuilder(s.length());
       for(char s2:s.toCharArray()){
           if ((s2 >= '0' && s2 <= '9') || (s2 >= 'A' && s2 <= 'Z')|| (s2 >= 'a' && s2 <= 'z')) 
                    str.append(s2);
      }
       return str.toString().equalsIgnoreCase(str.reverse().toString()); */

 
      /** 出栈
       Stack<Character> stack=new Stack<>();
       StringBuilder str=new StringBuilder(s.length());

       for(char s2:s.toLowerCase().toCharArray()){
           if ((s2 >= '0' && s2 <= '9') || (s2 >= 'a' && s2 <= 'z')) {
                    str.append(s2);
                    stack.push(s2);
                }
        }
         for(char s2: str.toString().toCharArray()){
           if (s2!=stack.pop())
                return false;            
       }
        return true; */

       
         
         //双指针
        String s1=s.toLowerCase();
        int i=0,j=s1.length()-1; 
        char []s2=s1.toCharArray();
         while(i<j){
              if ((s2[i] >= '0' && s2[i] <= '9') || (s2[i] >= 'a' && s2[i] <= 'z')){
                  if((s2[j] >= '0' && s2[j] <= '9') || (s2[j] >= 'a' && s2[j] <= 'z')){
                      if(s2[i]==s2[j]){
                          i++;
                          j--;
                      }else
                         return false;
                  }else
                         j--;
              }else  i++;
         }   
          return  true;              
        
    }
