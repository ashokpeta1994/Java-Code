package javaproject1;

import java.util.HashMap;

public class UserMap {

	public static void main(String[] args) {
		String cred[] = getCred("Surya").split("/");
		String userName = cred[0].trim();
		String password = cred[1].trim();
		userCred(userName, password);

	}

	public static String getCred(String name) {
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("Ashok", "ashokpeta8@gmail.com/ashokpeta123");
		hm.put("Surya", "suryanarendra130@gmail.com/surya456");
		hm.put("Vimala", "vimalapeta@gmail.com/vimala789");
		hm.put("Raju", "yesubabupeta@gmail.com/yesubabu1971");
		return hm.get(name);
	}

	public static void userCred(String userName, String password) {
		System.out.println("The user credentials are " + userName + " and " + password);
	}

}
