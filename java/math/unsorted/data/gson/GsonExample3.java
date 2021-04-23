//package ex1;

import com.google.gson.Gson;

public class GsonExample3 {

	public static void main(String[] args) {

		// compact print
		Gson gson = new Gson();

		String[] lang = { "Java", "Node", "Kotlin", "JavaScript" };
		String json = gson.toJson(lang);

		System.out.println(json);

	}

}
