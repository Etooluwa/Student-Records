import java.util.ArrayList;

public class Course {
	private ArrayList<CourseWork> coursework;
	private String courseCode;
	private String instructor;
	private int mark;
	private Course prerequisite;
	private Course nextCourse;
	private int gradePoint;
	
	public ArrayList<CourseWork> getCWork (){
		return coursework;
	}
	public String getCourseCode (){
		return courseCode;
	}
	public String getInstructor (){
		return instructor;
	}
	public int getMark (){
		return mark;
	}
    
	public void setMark(int theMark){
		mark= theMark;
	}
	public void setProf(String theProf){
		this.instructor = theProf;
	}
	public void setCode(String theCode){
		this.courseCode = theCode;
	}
	public void setNextCourse(Course theCourse){
		nextCourse = theCourse;
	}
	public void setPreReq(Course theCourse){
		this.prerequisite = theCourse;
	}
	
	public boolean passed (){    //method determines if one passes the course or not
		if (mark < 60){
			return false;
		}
		else return true;
	}
	public boolean hasPrereq (){    //this method determines whether the course has a prerequisite course
		if (this.prerequisite!= null){
			return true;
		}
		else return false;
	}
	public boolean isPrereq (){    //this method determines whether the course is a prerequisite course
		if (this.nextCourse!= null){
			return true;
		}
		else return false;
	}
	
	public String theGrade (){
		if (mark >89 && mark <101){
			return "A+";
		}
		else if (mark <90 && mark > 84){
			return "A";
		}
		else if (mark <85 && mark > 79){
			return "A-";
		}
		else if (mark <80 && mark > 76){
			return "B+";
		}
		else if (mark <77 && mark > 72){
			return "B";
		}
		else if (mark <73 && mark > 69){
			return "B-";
		}
		else if (mark <70 && mark > 66){
			return "C+";
		}
		else if (mark <67 && mark > 62){
			return "C";
		}
		else if (mark <63 && mark > 59){
			return "C-";
		}
		else if (mark <60 && mark > 56){
			return "D+";
		}
		else if (mark <57 && mark > 52){
			return "D";
		}
		else if (mark <53 && mark > 49){
			return "D-";
		}
		else 
			return "F";
		
	}
	public int theCGPA (){
		if (this.theGrade().equals("A+")){
			return 12;
		}
		else if (this.theGrade().equals("A")){
			return 11;
		}
		else if (this.theGrade().equals("A-")){
			return 10;
		}
		else if (this.theGrade().equals("B+")){
			return 9;
		}
		else if (this.theGrade().equals("B")){
			return 8;
		}
		else if (this.theGrade().equals("B-")){
			return 7;
		}
		else if (this.theGrade().equals("C+")){
			return 6;
		}
		else if (this.theGrade().equals("C")){
			return 5;
		}
		else if (this.theGrade().equals("C-")){
			return 4;
		}
		else if (this.theGrade().equals("D+")){
			return 3;
		}
		else if (this.theGrade().equals("D")){
			return 2;
		}
		else if (this.theGrade().equals("D-")){
			return 1;
		}
		else 
			return 0;
		
	}
	
	

}
