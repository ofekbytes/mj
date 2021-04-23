package ex1;

import com.google.gson.Gson;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class GsonExample2 {

	public static void main(String[] args) {

		Gson gson = new Gson();

		try (Reader reader = new FileReader("./staff.json")) {

			// Convert JSON File to Java Object
			Staff staff = gson.fromJson(reader, Staff.class);

			// print staff
			staff.printAll();
			
			// System.out.println("staff :: " + staff);
			// System.out.println(staff.getAge() + "\n" + staff.getSkills());

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
