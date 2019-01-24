package programs;

public class College {


	    String CollegeName;

	    public College(){
	        this.CollegeName = "xxxx";
	    }

	    public College(String CollegeName){
	        this.CollegeName = CollegeName;
	    }

	    public void getName(){
	        System.out.println(this.CollegeName);
	    }

	    public static void main(String[] args) {
	    	College FObj = new College();
	    	College SObj = new College("yyyy");

	        FObj.getName();
	        SObj.getName();
	    }
	





}
