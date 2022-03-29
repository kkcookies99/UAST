 public int XXX(String haystack, String needle) {

        char[] source = haystack.toCharArray();
        char[] target = needle.toCharArray();
        int targetOffset = 0;
        int sourceOffset = 0;
        int fromIndex =0;
        int sourceCount = source.length;
        int targetCount = target.length;

        if (fromIndex >= sourceCount) {
            return (targetCount == 0 ? sourceCount : -1);
        }
        if (fromIndex < 0) {
            fromIndex = 0;
        }
        if (targetCount == 0) {
            return fromIndex;
        }

        char first = target[targetOffset];
        int max = sourceOffset + (sourceCount - targetCount);
        for (int i = sourceOffset + fromIndex; i <= max; i++) {
            if (source[i] != first) {
                while (++i <= max && source[i] != first) ;
            }

            if (i <= max) {
                int j = i + 1;
                int end = j + targetCount - 1;
                for (int k = targetOffset + 1; j < end && source[j]
                        == target[k]; j++, k++)
                    ;

                if (j == end) {
                    return i - sourceOffset;
                }
            }
        }
        return -1;

    }

