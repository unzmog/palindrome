package palindrome;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class PalindromeControllerTest {

	private PalindromeServiceImpl service;

	@Before
	public void setup(){
		service = new PalindromeServiceImpl();
	}
	
	@Test
	public void checkEmptry(){
		assertThat(service.check("")).isEqualTo(true);
	}
	
	@Test
	public void checkSingle(){
		assertThat(service.check("a")).isEqualTo(true);
	}
	
	@Test
	public void checkGood(){
		assertThat(service.check("aba")).isEqualTo(true);
	}
	
	@Test
	public void checkGoodOdd(){
		assertThat(service.check("ab7ba")).isEqualTo(true);
	}
	
	@Test
	public void checkBad(){
		assertThat(service.check("abc")).isEqualTo(false);
	}
	
	@Test
	public void checkGoodDirty(){
		assertThat(service.check("!a@#b^&a*")).isEqualTo(true);
	}
	
	@Test
	public void checkWithNumbers(){
		assertThat(service.check("12321")).isEqualTo(true);
	}
	
}
