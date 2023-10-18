package org.javaro.lecture;

public class Ex7_9 { // 개인별 수강과목 성적 관리 프로그램
					
	public static void main(String[] args) {
		Student stud1 = new Student("201901","홍길동",3);	
		stud1.exam[0].setExamScore("자바", 88);
		stud1.exam[1].setExamScore("C", 91);
		stud1.exam[2].setExamScore("C++", 92);
		stud1.printGPA();
	}
}

class Student{
	String studNo, name; int totSubject;
	Exam [] exam;
	public Student(String studNo, String name, int totSubject)
	{
		this.studNo = studNo; this.name = name; this.totSubject = totSubject;
		exam = new Exam[totSubject];
		for(int i = 0; i < exam.length; i++){
			exam[i] = new Exam();
		}
	}
	public void setStudNo(String studNo){
		this.studNo = studNo;
	}
	public String getName() {
		return this.name;
	}
	public int getGPA() {
		int sum = 0;
		for(int i = 0; i < exam.length; i++) 
			sum = sum + this.exam[i].getScore();
		return sum;
	}
	public void printGPA() {
		for(int i = 0; i < exam.length;i++) {
			System.out.println("과목명:"
					+this.exam[i].getSubject()+", 점수="
					+this.exam[i].getScore());
		}
		System.out.println("과목 합계 ="+this.getGPA());
		}				
	}


class Exam{
	String subject;
	int score;
	public void setExamScore(String subject, int score) {
		this.subject = subject;
		this.score = score;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getSubject() {
		return this.subject;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getScore() {
		return this.score;
	}
}