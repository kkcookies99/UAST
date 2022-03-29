 public boolean XXX(String s) {
    while(s.contains("()") || s.contains("[]") || s.contains("{}")) {
        s = s.replaceAll("\\(\\)","");
        s = s.replaceAll("\\[\\]","");
        s = s.replaceAll("\\{\\}","");
    }
    return s.length() == 0;
}
