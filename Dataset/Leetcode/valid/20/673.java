 public boolean XXX(String s) {
        char[] arr = s.toCharArray();
        char x;
        Stack stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == '{' || arr[i] == '[' || arr[i] == '('){
                stack.push(arr[i]);
            }else {
                try {
                    x = (char)stack.pop();
                }catch (Exception e){
                    return false;
                }
                if (arr[i] == x + 1 || arr[i] == x + 2)
                    continue;
                else
                    return false;
            }
        }
        return stack.isEmpty();
    }

