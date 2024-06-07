package genericutility;

import java.time.LocalDateTime;

public class JavaUtility 
{
	public String getSystemTime() 
	{
		return LocalDateTime.now().toString().replace(":", "-");
	}
	

}

//     public void random()
//     {
//        return math.random();
//
//      
//
//

