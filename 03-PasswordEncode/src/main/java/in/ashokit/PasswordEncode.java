package in.ashokit;

import java.util.Base64;
import java.util.Base64.Encoder;

public class PasswordEncode {
	public PasswordEncode() {
		System.out.println("PasswordEncode :: constructor ");
	}
	public String pasEncoded(String paswd) {
		Encoder e = Base64.getEncoder();
		byte[] encodedpas = e.encode(paswd.getBytes());
		return new String(encodedpas);
	}

}
