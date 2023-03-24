package testes;

import elementos.ElementosWeb;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Metodos;

public class Steps {

	Metodos metodos = new Metodos();
	ElementosWeb elementos = new ElementosWeb();

	@Given("que eu esteja no {string}")
	public void que_eu_esteja_no(String appUrl) {
		metodos.abrirNavegador(appUrl, "acessando o Site.");

	}

	@When("Busco um CEP existente")
	public void busco_um_cep_existente() {
		metodos.escrever("26087-022", elementos.getPesquisar());
		metodos.submit(elementos.getPesquisar());

	}

	@Then("aparece o resultado com o endereço")
	public void aparece_o_resultado_com_o_endereço() {

		metodos.fecharNavegador();

	}

	@Given("que eu esteja no site {string}")
	public void que_eu_esteja_no_site(String appUrl) {
		metodos.abrirNavegador(appUrl, "acessando o Site.");
	}

	@When("busco um CEP contendo letras")
	public void busco_um_cep_contendo_letras() {
		metodos.escrever("abcdefgh", elementos.getPesquisar());
		metodos.submit(elementos.getPesquisar());

	}

	@Then("então não aparece nenhum resultado")
	public void então_não_aparece_nenhum_resultado() {
		metodos.fecharNavegador();

	}
}
