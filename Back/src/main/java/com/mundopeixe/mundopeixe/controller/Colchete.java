package com.mundopeixe.mundopeixe.controller;

public class Colchete {
    char pillha[N];
    int t=0;
    int i;


   for(int i = 0; s[i] != '\0'; ++i) {

        switch (s[i]) {
            case ')': if (t == 0) return 0;
                if (pillha[--t] != '(') return 0;
                break;
            case ']': if (t == 0) return 0;
                if (pillha[--t] != '[') return 0;
                break;
            default:  pillha[t++] = s[i];
        }
    }
   return (t == 0);
}

