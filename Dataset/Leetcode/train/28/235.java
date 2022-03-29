 public int XXX(String haystack, String needle) {
    if (needle==null||needle.length()==0){
        return 0;
    }

    if (needle.length()>haystack.length()){
        return -1;
    }
    for (int i = 0; i < haystack.length(); i++) {
        if ((haystack.length() - i)<needle.length()){
            break;
        }

        if (needle.equals(haystack.substring(i,i+needle.length()))) {
                return i;
        }
    }
    return -1;
}
