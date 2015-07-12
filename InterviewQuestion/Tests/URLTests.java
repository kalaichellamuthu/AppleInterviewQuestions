

import static org.junit.Assert.*;

import org.junit.Test;

	public class URLTests{
		@Test
		//Positve  and neagative Scenario
	    public static void main(String[] args)  {
	    String validurl="false";
	    String query= "term=kalai&key2=value2&key3=value3";
			String[] params = query.split("&");
		    
		    for (String param : params)
		    {
		        String key = param.split("=")[0];
		        String value = param.split("=")[1];
		        //System.out.println(key + "  ,  " + value);
		        if (key.equals("term"))
		        {
		        	validurl = "true";
		        	if (value.equals("kalai"))
		        	{
		        		System.out.println("It is a valid url");
		        	}
		        	else 
		        	{
		        		System.out.println("It is a Invalid url");

		        	}
		        	
		        }
		        
		        
		    }
		
		}
	}

		
		
		
		
		
		
		
		
		
		

