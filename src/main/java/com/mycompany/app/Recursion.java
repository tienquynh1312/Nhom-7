package com.mycompany.app;

public class Recursion {
        public int factorial(int n) {
            if (n <= 1){
                return 1;
            } else {
                return n * factorial(n - 1);
            }
        }

    }

