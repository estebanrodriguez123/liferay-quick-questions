package com.rivetlogic.quickquestions.action.util;

import com.liferay.portal.kernel.util.OrderByComparator;


public class CustomComparatorUtil {
	 
	 
	 public static OrderByComparator getUserOrderByComparator(
	   String orderByCol, String orderByType) {
	  
	  
	   boolean orderByAsc = false;

	   if (orderByType.equals("asc")) {
	   orderByAsc = true;
	   }

	   OrderByComparator orderByComparator = null;
	   
	   
	   if (orderByCol.equalsIgnoreCase("First Name")) {
	    
	    orderByComparator = new TitleComparator(orderByAsc);
	   } 
	 /*  else if (orderByCol.equalsIgnoreCase("Last Name")) {
	    
	    orderByComparator = new LastNameComparator(orderByAsc);
	   }
	   else if (orderByCol.equalsIgnoreCase("Screen Name")) {
	    
	    orderByComparator = new ScreenNameComparator(orderByAsc);
	   }
	   else if (orderByCol.equalsIgnoreCase("Job Title")) {
	    
	    orderByComparator = new JobTitleComparator(orderByAsc);
	   }*/
	   
	   return orderByComparator;
	   }


	}