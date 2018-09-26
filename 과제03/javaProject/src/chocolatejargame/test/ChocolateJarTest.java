package chocolatejargame.test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import chocolatejargame.ChocolateJar;

class ChocolateJarTest {
	@Test
	void testChocolateJar() {
		ChocolateJar jar=new ChocolateJar();
		assertEquals(13, jar.getChocolate());
		assertEquals(1, jar.getChilli());
	}
	@Test
	void testChocolateJarInt() {
		ChocolateJar jar=new ChocolateJar(11);
		assertEquals(11, jar.getChocolate());
		assertEquals(1, jar.getChilli());
	}
	@Test
	void testGetItem() {
		ChocolateJar jar=new ChocolateJar();
		assertEquals(14, jar.getItem());
	}
	@Test
	void testGetChocolate() {
		ChocolateJar jar=new ChocolateJar();
		assertEquals(13, jar.getChocolate());
	}
	@Test
	void testGetChilli() {
		ChocolateJar jar=new ChocolateJar();
		assertEquals(1, jar.getChilli());
	}
	@Test
	void testTakeItem() {
		ChocolateJar jar=new ChocolateJar();
		assertEquals(14, jar.getItem());
		jar.takeItem(3);
		assertEquals(11, jar.getItem());
		jar.takeItem(2);
		assertEquals(9, jar.getItem());
		jar.takeItem(1);
		assertEquals(8, jar.getItem());
	}
	@Test
	void testStatus() {
		ChocolateJar jar=new ChocolateJar();
		assertEquals("[бс бр бр бр бр бр бр бр бр бр бр бр бр бр]", jar.status());
		jar.takeItem(3);
		assertEquals("[бс бр бр бр бр бр бр бр бр бр бр]", jar.status());
	}
	@Test
	void testIsEmpty() {
		ChocolateJar jar=new ChocolateJar();
		jar.takeItem(3);
		jar.takeItem(3);
		jar.takeItem(3);
		jar.takeItem(3);
		jar.takeItem(2);
		assertTrue(jar.isEmpty());
	}
}
