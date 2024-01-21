
public class hashCode {

	static int max_sale_prize = 100;    
    int sale;   
    // Constructor   
    hashCode()   
    {   
        sale = max_sale_prize;   
        max_sale_prize++;   
    }   
    public int hashCode()   
    {   
        return max_sale_prize;   
    }   
    
    public void a()
    {
    	System.out.println(max_sale_prize);
    }
    // Driver code   
    public static void main(String args[])   
    {   
    	hashCode obj = new hashCode();   
        // Below two statements are equivalent   
        System.out.println("HashCode : "+obj); 
        
    }   

}
