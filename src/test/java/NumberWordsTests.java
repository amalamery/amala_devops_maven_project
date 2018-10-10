package devops.numbers;

import static org.junit.Assert.*;

import org.junit.*;

import org.junit.Test;

public class NumberWordsTests {

private NumberWords numberWords ;
	
	@Before
	public void setup() {
		numberWords = new NumberWords() ;
	}

	@Test
	public void numberOutOfRangeLow() 
	{
		Assert.assertEquals( "Success", "Number out of range", numberWords.toWords( -1) ) ;
	}
	@Test
	public void numberOutOfRangeHigh() 
	{
		Assert.assertEquals( "Success", "Number out of range", numberWords.toWords( 1000000001) ) ;
	}
	@Test
	public void numberCorrectValuelow() 
	{
		Assert.assertEquals( "Success", "One Hundred", numberWords.toWords( 100) ) ;
	}
	@Test
	public void numberCorrectValueHigh() 
	{
		Assert.assertEquals( "Success", "One Hundred Crore", numberWords.toWords( 1000000000) ) ;
	}
	@Test
	public void numberApplicationExits() 
	{
		Assert.assertEquals( "Success", "", numberWords.toWords(0) ) ;
	}

}
