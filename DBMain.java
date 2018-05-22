package ru.virtus.pro;

public class DBMain {

	public static void main(String[] args) {
		DBWorker db = new DBWorker();
		User user = db.getUserById(4);
		//System.out.println(user);
		System.out.println(db.getAccess("Admin", "1234"));
		User someone = new User();
		someone.setName("Jack");
		someone.setLogin("Apple");
		someone.setPassword("MacBook");
		db.insertDB(someone);
		System.out.println(user);
		
		something changed
		

	}

}
