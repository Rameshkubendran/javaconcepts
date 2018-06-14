package collection;

import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.Vector;
 
public class Duplicate
{
	public static void main(String args[])
	{
		String [] sValue = new String[]{"a","b","c","d","","","e","a"};
		int[] ints = {5,2,7,2,4,7,8,2,3};
 
		if(checkDuplicated_int(ints))
			System.out.println("Check Normal : Value duplicated! \n");
		if(checkDuplicated_withSet(sValue))
		System.out.println("Check Set : Value duplicated! \n");
 
	}
	/*//check duplicated value
	private static boolean checkDuplicated_withNormal(String[] sValueTemp)
	{
		for (int i = 0; i < sValueTemp.length; i++) {
			String sValueToCheck = sValueTemp[i];
			if(sValueToCheck==null || sValueToCheck.equals(""))continue; //empty ignore
			for (int j = 0; j < sValueTemp.length; j++) {
					if(i==j)continue; //same line ignore
					String sValueToCompare = sValueTemp[j];
					if (sValueToCheck.equals(sValueToCompare)){
						System.out.println("Duplicate val "+sValueTemp[j]);
							return true;
					}
					else
					{
						System.out.println("NON Duplicate val "+sValueTemp[j]);
					}
					
			}
 
		}
		return false;
 
	}*/
	
	private static boolean checkDuplicated_int(int[] ints)
	{
		for (int i = 0; i < ints.length; i++) {
			int sValueToCheck = ints[i];
			//if(sValueToCheck==null || sValueToCheck.equals(""))continue; //empty ignore
			for (int j = 0; j < ints.length; j++) {
					if(i==j)continue; //same line ignore
					int sValueToCompare = ints[j];
					if (sValueToCheck==(sValueToCompare)){
						System.out.println("Duplicate val "+ints[j]);
							return true;
					}
					else
					{
						System.out.println("NON Duplicate val "+ints[j]);
					}
					
			}
 
		}
		return false;
 
	}
 
	//check duplicated value
	private static boolean checkDuplicated_withSet(String[] sValueTemp)
	{
		Set<String> sValueSet = new HashSet<String>();
		for(String tempValueSet : sValueTemp)
		{
			if (sValueSet.contains(tempValueSet))
				return true;
			else
				if(!tempValueSet.equals(""))
					sValueSet.add(tempValueSet);
		}
		return false;
	}
	
}