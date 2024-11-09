package cond.ex;

public class ScoreEx {
    public static void main(String[] args) {
        int score = 101;
        String grade;

        if (score <1 && score>= 101) {
        }
        else if (score>=90 && score<=100) {
            grade = "A";
            System.out.println("score: " + score);
            System.out.println("학점은 "+ grade +"입니다.");
        } else if (score >= 80 && score <90) {
            grade = "B";
            System.out.println("score: " + score);
            System.out.println("학점은 " + grade+ "입니다.");
        } else if (score >=70 && score <80) {
            grade = "C";
            System.out.println("score: " + score);
            System.out.println("학점은 " + grade + "입니다");
        } else if (score >= 60 && score < 70) {
            grade = "D";
            System.out.println("score: " + score);
            System.out.println("학점은 " + grade + "입니다");
        } else if (score<60 && score >1){
            grade = "F";
            System.out.println("score: "+ score);
            System.out.println("학점은 " + grade + "입니다.");
        }else {
            System.out.println("error");
        }
    }
}
