 var XXX = function(s) {
    const stack = [];
        for(let i = 0; i < s.length; i++) {
            let c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{'){
                stack.push(c);
            } else {
              if(stack.length === 0)
                  return false;

              let topChar = stack.pop();
              
              if ( c == ')' && topChar != '(')
                  return false;
              if (c == ']' && topChar != '[')
                  return false;
              if (c == '}' && topChar != '{')
                  return false;
            }
        }
        return !stack.length;
};

