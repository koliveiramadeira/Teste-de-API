package Metodos;

import java.util.List;

import io.cucumber.java.bs.I.Is;
import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import org.hamcrest.CoreMatchers;
import org.hamcrest.Matcher;

import static org.hamcrest.Matchers.is;
public class Metodos {

	private String url;
	private Response response;
	
	public void setUrl(String url) {
		this.url = url;
	}
	public void getCepValido(String cep) {
		
		response = RestAssured.request(Method.GET,"https://viacep.com.br/ws/"+cep+"/json/");
		System.out.println(response.getBody().asString());
			
		}
	public void consultaCep(String cep) {
	
	RestAssured.given().when().get("https://viacep.com.br/ws/"+cep+"/json/");
	System.out.println("retorno do status code : " + response.statusCode());
	
	}

	public void validacao() {
		response.then()
		.statusCode(200)
		.body("cep", is ("35162-459"))
		.body("logradouro",is("Rua Manoel Vicente Araújo"))
		.body("complemento",is(""))
		.body("bairro",is ("Limoeiro"))
		.body("localidade",is ("Ipatinga"))
		.body("uf",is ("MG"))
		.body("ibge",is("3131307"));

	}
	private void body(String string, Matcher<String> matcher) {
		
		
	}
}
