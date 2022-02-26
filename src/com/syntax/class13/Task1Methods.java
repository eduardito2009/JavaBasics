package com.syntax.class13;

public class Task1Methods {
	
		private Object animalName;
		String getproperAnimalByExpert(String expertName) {
			if("Teyfur".equalsIgnoreCase(expertName)&&"Horse".equalsIgnoreCase((String) animalName)) {
				return"camel";
			}else if("Horse".equals(animalName)) {
				return"Horse";
			}else {
				return "I don't Know";
			}
					
		}
		public static void main(String[] args) {
			Task1Methods obj= new Task1Methods();
			System.out.println(obj.getproperAnimalByExpert("Teyfur"));
		}
	
	


}