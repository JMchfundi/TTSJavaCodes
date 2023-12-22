package co.ke.tucode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import co.ke.tucode.payloads.ReverseStringPayload;
import co.ke.tucode.payloads.TTSPyramidPayload;

@SpringBootApplication
public class TtsJavaCodesApplication {

	public static void main(String[] args) {
		// System.out.println("Hello Spring You Have Been Hacked");
		// SpringApplication.run(TtsJavaCodesApplication.class, args);
		TTSPyramidPayload.printpattern1Pyramid(5);
		System.out.println(ReverseStringPayload.reverseWithIterativeMethod("Jafari"));
	}

}
