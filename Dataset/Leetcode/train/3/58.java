  public int XXX(String s) {
    int maxLength = 0;
    char[] chars = s.toCharArray();
    int leftIndex = 0;
    for (int j = 0; j < chars.length; j++) {
      for (int innerIndex = leftIndex; innerIndex < j; innerIndex++) {
        if (chars[innerIndex] == chars[j]) {
          maxLength = Math.max(maxLength, j - leftIndex);
          leftIndex = innerIndex + 1;
          break;
        }
      }
    }
    return Math.max(chars.length - leftIndex, maxLength);
  }

