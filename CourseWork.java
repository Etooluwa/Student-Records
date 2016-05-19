

public class CourseWork {
	private String name;
	private int[] date;
	private int percentage;

	public CourseWork (String n,  int p,int day, int month, int year) {
		name= n;
		percentage = p;
		date[0]= day;
		date[1]= month;
		date[2]= year;		
	}
	public String getCourseName(){
		return name;
	}
	public int getPercentage (){
		return this.percentage;
	}

	public void setDate(int day, int month, int year){
		date[0]= day;
		date[1]= month;
		date[2]= year;
		
	}
	
	
	
	

}
