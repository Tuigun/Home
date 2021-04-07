package com.company;

public class Main {

    // H\W
    public static void main(String[] args) {
	// write your code
        System.out.println(allowToWalk(32,40));
    }
    public static String allowToWalk(int age,double temp){
        if ((age > 20 && age < 45) && temp > -20 && temp < 30){
            return "may go for walk";
        } else if ((age > 20 && temp > 0) && temp < 28) {
            return "may go for walk";
        }else if (age < 45 && (temp > -25 && temp < 25)) {
            return "may go walk";
        }
        return   "Stay Home";
        }

    }

