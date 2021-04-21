package com.company;

public class CodeBlock {
//    public static void main(String[] args) {
//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;
//        if (score < 5000 && score > 1000) {
//            System.out.println("your score was less than 5000 but graeter than 100");
//        } else if (score < 1000) ;
//        System.out.println("your score was less than 1000");
//    } else {
//        System.out.println("got here ");
//if (gameOver == true);
//int finalScore = score + (levelCompleted * bonus);
//        System.out.println("your final score was " + finalScore);

//        score = 1000;
//        levelCompleted=8;
//        bonus = 2000;
//        if (gameOver){
//            int finalScore = score + (levelCompleted * bonus);
//            System.out.println("your final score was " + finalScore);
//        }
//}
        public static void calculateScore () {

            boolean gameOver = true;
            int score = 800;
            int levelCompleted = 5;
            int bonus = 100;

            if (gameOver) {
                int finalScore = score + (levelCompleted * bonus);
                finalScore += 1000;
                System.out.println("your final score was " + finalScore);
            }
        }
    }
