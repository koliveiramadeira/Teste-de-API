
@tag
Feature: Buscar servico correio 

  @tag1
  Scenario: consulta cep valido
  Given que o usuario insira um cep valido "35162-459"
  When o servico e consultado
  Then e retornado informacoes de endereco 
  

 
