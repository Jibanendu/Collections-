package com.custom.collection;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;

public class CustomArrayList {


	private static String[] str; 
	private static int DefaultSize = 2;
	CustomArrayList()
	{
		 this.str = new String[DefaultSize];
	}
	
	private static int customLength(String[] str)
	{
		String cleanedArray[] = Arrays.stream(str).filter(Objects::nonNull).toArray(String[]::new);
		return cleanedArray.length; 
	}

	private static String[] customArrayString(String[] str)
	{
		String cleanedArray[] = Arrays.stream(str).filter(Objects::nonNull).toArray(String[]::new);
		return cleanedArray; 
	}

        
	private static String findElement(String[] strArr, String value)
	{
		List<String> resultArr = Arrays.stream(strArr).filter(x->value.equals(x)).collect(Collectors.toList());
		return resultArr.toString();
	}
	
	private static void CustomAdd(CustomArrayList c, String string) {
        int lastElementValue=0;
        try
        {
	    for(int i=0;i<=str.length;i++) {
	    	if(c.str[i]==null)
	    	{
	    		lastElementValue = i;
	    		c.str[lastElementValue]=string;
	    		System.out.println("Elements added");
	    		break;
	    	}
	    }
        }
        catch(Exception e )
        {
        	DefaultSize = DefaultSize*3/2+1;
        	int arraySize = c.str.length;
        	String temp[] = new String[DefaultSize];
        	
        	System.out.println(temp.length);
        	
        	for(int i=0;i<c.str.length;i++)
        	{
        		temp[i]= c.str[i];
        	}
        	if(arraySize<DefaultSize)
        	{
        		for(int i=0;i<temp.length;i++)
        		{
        		if(temp[i]==null)
      	    	{
     	    		lastElementValue = i;
      	    		temp[lastElementValue]=string;
      	    		System.out.println("Elements added");
      	    		c.str=temp;
      	    		break;
      	    	}
        		}
        	}
        	
        }
	    
	    
		
	}

      public static String [] removeElement(String[] strArr, int deletedIndex)
	{
		
		for(int i=deletedIndex;i<strArr.length;i++)
		{
			int j = i+1;
			if(j<strArr.length)
			{
			strArr[i] = strArr[i+1];
			}
		}
		return strArr; 
	}
	
	
	public static void main(String[] args) {
		
		CustomArrayList c = new CustomArrayList();
		int arrLength = c.str.length;
		
		CustomAdd(c,"dummy");
		CustomAdd(c,"dummy1");
		CustomAdd(c,"dummy2");
		CustomAdd(c,"dummy3");
		CustomAdd(c,"dummy4");
		CustomAdd(c,"dummy5");
		CustomAdd(c,"dummy6");
		CustomAdd(c,"dummy7");
		
		
		System.out.println(arrLength);
		System.out.println(c.str.length);
		System.out.println(customLength(c.str));
		System.out.println(Arrays.toString(customArrayString(c.str)));
                
                removeElement(c.str,3);
		System.out.println(Arrays.toString(customArrayString(c.str)));

                System.out.println(findElement(c.str,"dummy"));
	
	}



}
