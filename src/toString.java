
public class toString {
	static int max_num = 100;    
    int num;   
    // Constructor   
    toString()   
    {   
        num = max_num;   
        max_num++;   
    }   
    
    // Driver code   
    public static void main(String args[])   
    {   
    	toString s = new toString();    
        System.out.println(s.toString());   
    }  
}
