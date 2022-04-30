package TestCode;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Controller.DeleteCustomer;
import Controller.FindAccountName;

public class FindAccountTest {
	FindAccountName S;
	DeleteCustomer D;
	
	@Before
	public void setUp() throws Exception {
		S = new FindAccountName();
		D = new DeleteCustomer();
	}

	@Test
	public void testdelRec() {
		D.delRec();
		assertEquals(null, S.showRec(1));

	}

}
