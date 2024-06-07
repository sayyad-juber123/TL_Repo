package login;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericutility.BaseClass;
import genericutility.ListenerUtility;

@Listeners(ListenerUtility.class)
public class TestScript extends BaseClass
{
	
	  @Test
	  public void execute()
	  {
		  Reporter.log("webpage launched",true);
	  }

}
