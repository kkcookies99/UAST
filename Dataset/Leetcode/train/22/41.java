     public List<String> XXX(int n) {
        char[] chars = new char[]{'(',')'};
        List<String> res = new ArrayList<String>();
        int length = (int) Math.pow(chars.length,n*2-2);

        for( int i = 0; i < length; i++){
            StringBuffer temp = new StringBuffer();
            temp.append('(');
            int pre = length;
            for( int j = 0;j < 2*n-2;j++){
                pre /= chars.length;
                temp.append(chars[i % (length / pre) /
                 (length / (pre * chars.length))]);
            }
            temp.append(')');
            if(isValid(temp.toString()) && !res.contains(temp.toString())){
                res.add(temp.toString());
            }
        }
        return res;
    }
    public boolean isValid(String s) {
        Stack<Character> chars = new Stack<>();
        char[] str = s.toCharArray();
        for (int i = 0; i < str.length; i++) {
            if(chars.empty()){
                chars.push(Character.valueOf(str[i]));
            }else{
                Character c = chars.pop();
                if(c.equals('(') && str[i] == ')' ||
                        c.equals('{') && str[i] == '}' ||
                        c.equals('[') && str[i] == ']'){
                }else{
                    chars.push(c);
                    chars.push(Character.valueOf(str[i]));
                }
            }
        }
        return chars.empty();
    }

