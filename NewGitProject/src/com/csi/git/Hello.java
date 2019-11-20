package com.csi.git;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hello {
public String findDuplicate (String input)throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		
		Field valueField= String.class.getDeclaredField("value");
		valueField.setAccessible(true);
		char[] chars= (char[]) valueField.get(input);
		List<Character> duplicateCharater= new ArrayList<Character>();
		for(int i= 0; i < chars.length; i++){
			char achar=chars[i];
			for(int j=i+1; j < chars.length; j++){
				char anotherChar=chars[j];
				if(achar==anotherChar){
					if(duplicateCharater.contains(achar)){
						duplicateCharater.add(achar);
					}
				}
				System.out.println("Working good");
				
			}
		}
		
		char[] charArray= new char[duplicateCharater.size()];
		for(int i=0; i < duplicateCharater.size(); i++){
			charArray[i]=duplicateCharater.get(i);
			
		}
		return new String(charArray);
	
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Working properly");
	}
	}


