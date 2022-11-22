package apiCalculadora.apiCalculadora;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import ApiCalculadoraApplication.ApiCalculadoraApplication;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@WebMvcTest(ApiCalculadoraApplication.class)
class ApiCalculadoraApplicationTests {

	//private ApiCalculadoraApplication calculator = new ApiCalculadoraApplication();
	@Autowired
	private MockMvc mvc;

	public String request(String url) throws Exception {
		try {
			RequestBuilder request = MockMvcRequestBuilders.get(url);
			MvcResult response = mvc.perform(request).andReturn();
			return  response.getResponse().getContentAsString();
		}catch (Exception e){
			throw e;
		}
	}


	@Test
	public void sumaTest() {
		try{
			assertEquals("3",request("/sumar?a=1&b=2"));
		}catch (Exception e){System.out.println("--ERROR: "+e);}
	}

	@Test
	public void sumaTestFail() {
		try{
			assertEquals("4",request("/sumar?a=1&b=2"));
		}catch (Exception e){System.out.println("--ERROR: "+e);}
	}


	@Test
	public void restarTest() {
		try{
			assertEquals("-1",request("/restar?a=1&b=2"));
		}catch (Exception e){System.out.println("--ERROR: "+e);}
	}

	@Test
	public void restarTestFail() {
		try{
			assertEquals("3",request("/restar?a=1&b=2"));
		}catch (Exception e){System.out.println("--ERROR: "+e);}
	}

	@Test
	public void multiplicarTest() {
		try{
			assertEquals("2",request("/multiplicar?a=1&b=2"));
		}catch (Exception e){System.out.println("--ERROR: "+e);}
	}

	@Test
	public void multiplicarTestFail() {
		try{
			assertEquals("3",request("/multiplicar?a=1&b=2"));
		}catch (Exception e){System.out.println("--ERROR: "+e);}
	}

	@Test
	public void dividirTest() {
		try{
			assertEquals("2",request("/dividir?a=4&b=2"));
		}catch (Exception e){System.out.println("--ERROR: "+e);}
	}

	@Test
	public void dividirTestFail() {
		try{
			assertEquals("3",request("/dividir?a=1&b=2"));
		}catch (Exception e){System.out.println("--ERROR: "+e);}
	}
	@Test
	public void dividirException() {
		Assertions.assertThrows(ArithmeticException.class,()->{
			try{
				request("/dividir?a=0&b=0");
			}catch (Exception e){throw new ArithmeticException();}
		});

	}
	 
}
