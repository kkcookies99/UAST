 char *XXX(char *s)
{
   int str_len = strlen(s);
   char *ret;
   int len;

   int cs, ce, curr;
   int max_l = 1;
   int r;
   int start = 0;
   int error = 0;

   for (len = str_len; len > 1; --len)
   {
      if (len % 2)
      {
         cs = (len - 1) / 2;
         ce = str_len - 1 - (len - 1) / 2;
         for (curr = cs; curr <= ce; ++curr)
         {
            error = 0;
            for (r = 1; r <= len / 2; ++r)
            {
               if (s[curr - r] != s[curr + r])
               {
                  error = 1;
                  break;
               }
            }
            if (!error)
            {
               max_l = len;
               start = curr - len/2;
               goto end;
            }
         }
      }
      else
      {
         cs = len / 2 - 1;
         ce = str_len - len / 2 - 1;
         for (curr = cs; curr <= ce; ++curr)
         {
            error = 0;
            for (r = 1; r <= len / 2; ++r)
            {
               if (s[curr + 1 - r] != s[curr + r])
               {
                  error = 1;
                  break;
               }
            }
            if (!error)
            {
               max_l = len;
               start = curr - len/2 + 1;
               goto end;
            }
         }
      }
   }

end:
   ret = malloc(sizeof(char) * (max_l + 1));
   ret[max_l] = '\0';
   strncpy(ret, s + start, max_l);
   return ret;
}

