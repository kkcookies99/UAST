 public int XXX(String haystack, String needle) {
    if("".equals(needle) || needle == null)
        return 0;
    
    char[] arr1 = haystack.toCharArray();
    char[] arr2 = needle.toCharArray();
    
    int j = 0;
    
    for(int i = 0; i < arr1.length; i++) {
        if(arr2[j] != arr1[i]) {
            i = i - j;
            j = 0;
        } else {
            j++;
            if(j >= arr2.length)
                return i - j + 1;
        }
    }
    return -1;
}
