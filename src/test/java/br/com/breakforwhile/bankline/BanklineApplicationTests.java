package br.com.breakforwhile.bankline;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.security.SecureRandom;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

@SpringBootTest
class BanklineApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void test_randomPassword(){
		int count = 10;
		Random random = new SecureRandom();
		IntStream specialChars = random.ints(count, 33, 45);
		String teste = specialChars.mapToObj(data -> ((char) data)).toString();


		System.out.println(teste);
	}

}
