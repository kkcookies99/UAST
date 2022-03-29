 var XXX = function(strs) {
  if (!strs || strs.length == 0) return "";
  var len = strs.length;
  var res = strs[0];

  for (var i = 1; i < len; i++) {
    while (strs[i].indexOf(res) != 0) {
      res = res.substr(0, res.length - 1);
    }
  }
  return res;
};

