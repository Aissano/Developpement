package testservice;

import java.util.ArrayList;

public class MessageBDD {
	static ArrayList<MessageBean> maListe = new ArrayList<MessageBean>();

	// TODO Auto-generated method stub
	public static ArrayList<MessageBean> getMessages() {
		return maListe;

	}

	public static void addMessages(MessageBean message) {
		maListe.add(message);
		System.out.println(message.getUser() + " : " + message.getMessage());
	}
}