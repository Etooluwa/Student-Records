import java.util.ArrayList;

public class Course {
	private ArrayList<CourseWork> coursework;
	private String courseCode;
	private String instructor;
	private int mark;
	private Course prerequisite;
	
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
	public boolean passed (){    //method determines if one passes the course or not
		if (mark < 60){
			return false;
		}
		else return true;
	}
	public boolean hasPrereq (){    //this method determines whether the method has a prerequisite course
		if (this.prerequisite!= null){
			return true;
		}
		else return false;
	}
	

}
