package eCommerceProject;

import eCommerceProject.business.abstracts.UserService;
import eCommerceProject.business.concretes.UserManager;
import eCommerceProject.core.EmailValidatorManager;
import eCommerceProject.core.InputVerification;
import eCommerceProject.core.JUserVerificationServiceAdepter;
import eCommerceProject.dataAccess.concretes.UserDao;
import eCommerceProject.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		 	User user1 = new User("Dodo","Durhan", "dodoxyza@hotmail.com","111111");
	        User user2 = new User("Ergün","Çamur","erguncamur@gmail.com","333333");
	        User user3 = new User("Niyazi","Durmuş","niyazi.com","645466844");


	        UserService userService = new UserManager(new InputVerification(), new UserDao(), new EmailValidatorManager());
	        userService.register(user1);

	        System.out.println("----------------------------------");

	        userService.register(user1);

	        System.out.println("----------------------------------");

	        userService.register(user2);

	        System.out.println("----------------------------------");

	        userService.register(user3);

	        System.out.println("----------------------------------");



	        UserService userService2 = new UserManager(new JUserVerificationServiceAdepter(), new UserDao(), new EmailValidatorManager());
	        userService2.register(user3);



	        System.out.println("----------------------------------");

	        userService.login("dodoxyza@hotmail.com", "111111");

	        System.out.println("----------------------------------");

	        userService.login ("erguncamur@gmail.com", "56565655225215448");

	}

}
