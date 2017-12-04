package mypackage;

public class Static {
	int id;  
    String name;  
      
    public Static(int i,String n){  
    id = i;  
    name = n;  
    }  
    void display(){System.out.println(id+" "+name);}  
   
    public static void main(String args[]){  
    	Static s1 = new Static(111,"Karan");  
    	Static s2 = new Static(222,"Aryan");  
    s1.display();  
    s2.display();  
   }  
}  
