    public boolean XXX(int x) {
        StringBuffer tmp = new StringBuffer(String.valueOf(x));
        String str1 = tmp.toString();
        String str2 = tmp.reverse().toString();
        return str1.equals(str2);
}

