 var XXX = function(haystack, needle) {
  if (!needle) return 0;
  if (haystack.length < needle.length) return -1;
  let startIndex = -1,
      i = 0,
      j = 0;
  while (i < haystack.length && j < needle.length) {
    if (haystack[i] === needle[j]) {
      startIndex = startIndex > -1 ? startIndex : i;
      j++;
    } else {
      i = startIndex > -1 ? startIndex : i;
      startIndex = -1;
      j = 0;
    }
    i++;
  }
  return j === needle.length ? startIndex : -1;
};

