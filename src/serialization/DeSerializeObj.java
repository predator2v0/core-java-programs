package serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerializeObj {
	public static void main(String[] args) {
		try {
			String path = "C:/Users/admin/codePractice/java_repo/core_java_from_scratch_studytonight/serial.txt";
			FileInputStream fis = new FileInputStream(path);
			ObjectInputStream ois = new ObjectInputStream(fis);
			SerialObject sos = (SerialObject) ois.readObject(); // reads the byte stream from file and convert it into
																// object.
			sos.showInfo();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
