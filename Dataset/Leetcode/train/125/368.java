 public boolean XXX(String s) {
        String caseS = s.toLowerCase();
        Stack<Character> cur = new Stack<>();
        Stack<Character> res = new Stack<>();
        for (Character c : caseS.toCharArray()) {
            if (Character.isLowerCase(c)) {
                cur.push(c);
            }
        }
        String curStr = Arrays.toString(cur.toArray());
        while (!cur.isEmpty()) {
            res.push(cur.pop());
        }
        String resStr = Arrays.toString(res.toArray());
        return resStr.equals(curStr);
    }

