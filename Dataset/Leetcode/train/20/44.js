 var XXX = function(s) {
  var Json = {
            ')': '(',
            ']': '[',
            '}': '{'
        }
    var stack = [];
    for (var i = 0; i < s.length; i++) {
        var c = s.charAt(i);
        if (c in Json) {
            var template = stack.length != 0 ? stack.pop() : '#';
            if (template !== Json[c]) {
                return false;
            }

        } else {
            stack.push(c);
        }
    }
   return stack.length == 0;
};

