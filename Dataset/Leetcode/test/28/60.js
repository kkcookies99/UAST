 var XXX = function(haystack, needle) {
  if(!needle){
    return 0;
  }

  const len = needle.length;

  let pointer = 0;
  while(pointer <= haystack.length - len){
    substr = haystack.substr(pointer, len);
    if(substr == needle){
      return pointer;
    }

    pointer++;
  }

  return -1;
};

