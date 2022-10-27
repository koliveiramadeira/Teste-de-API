package Steps;

import Metodos.Metodos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {

	Metodos m = new Metodos();
	String cep = "35162-459";
	
	@Given("que o usuario insira um cep valido {string}")
	public void que_o_usuario_insira_um_cep_valido(String cep) {
	    m.getCepValido(cep);
	}

	@When("o servico e consultado")
	public void o_servico_e_consultado() {
	    m.consultaCep(cep);
	}

	@Then("e retornado informacoes de endereco")
	public void e_retornado_informacoes_de_endereco() {
	    m.validacao();
	}
}
