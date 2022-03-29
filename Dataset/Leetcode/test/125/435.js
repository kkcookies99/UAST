 var XXX = function(s) {
  // 去掉非数字、字母符号，转成小写
  s = s.replace(/[^0-9a-zA-Z]/g, '').toLowerCase()
  // 翻转字符串，再作对比
  return s === s.split('').reverse().join('')
};

