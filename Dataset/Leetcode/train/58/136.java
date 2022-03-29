 public int XXX(String s) {
        if (s.isEmpty()) return 0;
        String[] divide = s.split(" ");
        if (divide.length == 0) return 0;
        return divide[divide.length-1].length();
    }

