package com.sougou;

import java.util.HashSet;
import java.util.Set;

public class test3 {
    public long getPasswordCount (String password) {
        if (password.length()==1)return 9;
        Set<String> set = new HashSet<>();
        for (int i = 0; i <10 ; i++) {
            set.add(i+"");
        }
        for (int i = 0;i < password.length()-1;i++){
            Set<String> t = new HashSet<>();
            int k = password.charAt(i+1) - '0';
            for (String s :set){
                int c = s.charAt(i) - '0';
                t.add(s+(k+c)/2);
                if ((k+c)%2==1)t.add(s+((k+c)/2+1));
            }
            set = t;
        }
        if (set.contains(password))return set.size()-1;
        else return set.size();
    }
}
