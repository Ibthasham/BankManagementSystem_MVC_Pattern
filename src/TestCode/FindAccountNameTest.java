package TestCode;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Controller.FindAccountName;

public class FindAccountNameTest {
 FindAccountName Fam;
 
 @Before
 public void setUp() throws Exception {
  Fam = new FindAccountName();
 }

 @Test
 public void testFindAccountName() {
  assertEquals("Successful", Fam.txtClear());
 }
 
}
