//package jsm.utility.temp;

import java.io.OutputStreamWriter;
import java.io.OutputStream;
import java.io.IOException;

//jron: fix this bug, and set for multiple unicode icons

public class Utf16 {
	public static void main(String[] args) {
		// outputs unicode / graphics characters
		// TODO: Kotlin handles this fine, but Java...
		// haven't figured out how to paste characters directly into the string yet
		try {
			OutputStreamWriter osw = new OutputStreamWriter(System.out, "UTF-16");
			osw.write("utf-16 == \u8966\u25a3\u06de\u02a5\u0414\u0416\u0489\u23f0\u2728\u26f5");
			osw.flush();
			osw.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}