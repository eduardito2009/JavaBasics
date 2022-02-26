package com.syntax.class12;

public class StudentGrade {
	
	char getGrade(int score) {
		if(score>90) {
			return'A';
		}else if(score >80) {
			return'B';
		}else if (score>70) {
			return 'C';
		}else if ( score>50) {
			return'D';
		}else {
			return'F';
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         StudentGrade student=new StudentGrade();
         char score=student.getGrade(45);
         System.out.println(score);
	}

}
