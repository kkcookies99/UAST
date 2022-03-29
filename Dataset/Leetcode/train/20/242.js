 var XXX = function(s) {
  do {
    var len = s.length;
    s = s.replace("()", "").replace("[]", "").replace("{}", "");
  } while(s.length !== len)
  return s.length === 0;
};

