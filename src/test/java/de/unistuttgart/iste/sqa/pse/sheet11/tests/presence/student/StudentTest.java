package de.unistuttgart.iste.sqa.pse.sheet11.tests.presence.student;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import de.unistuttgart.iste.sqa.pse.sheet11.presence.student.Student;
import java.util.Date;
import org.junit.Before;
import org.junit.Test;

/**
 * This class is for explanatory use only.
 */
public class StudentTest {
	private Student student;

	@Before
	public void setUp() {
		Date birthdate = new Date(100, 1, 1);
		student = new Student("Max Mustermann", birthdate);
	}

	@Test
	public void testCorrectValue() {
		assertEquals("Max Mustermann", student.getName());
	}

	@Test
	public void testWrongValue() {
		assertEquals("Paule", student.getName());
	}

	@Test
	public void testBoolean() {
		Date now = new Date();
		assertTrue(student.bornBefore(now));
	}

	@Test
	public void testNull() {
		student.bornBefore(null);
	}

	@Test(expected = NullPointerException.class)
	public void testNullException() {
		student.bornBefore(null);
	}
}
