#Author: nathaliadeodatoc@gmail.com


Feature: Pesquisar CEP no site correios
Eu como usuario quero acessar o site e buscar CEP
  

  Scenario: Busca de um CEP existente
    Given que eu esteja no "https://www.correios.com.br"
    When Busco um CEP existente
    Then aparece o resultado com o endereço
  
Scenario: Busca de um CEP com letras
    Given que eu esteja no site "https://www.correios.com.br"
    When  busco um CEP contendo letras 
    Then então não aparece nenhum resultado
