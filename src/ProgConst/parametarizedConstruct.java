package ProgConst;
import java.io.*;


public class parametarizedConstruct 
{ 
	 int Sid; 
	  String Sname; 
	  parametarizedConstruct(String Sname, int Sid){
		  this.Sname = Sname;
		  this.Sid=Sid;
	  }

    public static void main (String[] args) 
    { 
    	parametarizedConstruct m = new parametarizedConstruct("sonu",001); 
        System.out.println(m.Sname); 
        System.out.println(m.Sid); 
    } 
}
