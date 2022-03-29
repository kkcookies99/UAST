 var XXX = function(s) {
        let maxLen = 0;
        let start = 0, end = 0;
        for (; end < s.length; end++) {
            let indexOf = s.substring(start, end).indexOf(s.charAt(end));
            if (indexOf != -1) {
                maxLen = Math.max(maxLen, end - start);
                start += indexOf + 1;
            }
        }
        return Math.max(maxLen, end - start);
};

