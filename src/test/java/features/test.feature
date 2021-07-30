Feature: Categoria Comics
  Como usuario quiero leer chistes de tester para reirme y pasar un buen rato.

  Scenario: Ingresar a la catagoría comics desde la pantalla home.
    Given   El usuario se encuentra en la pagina home de imalittletester
    When    Hace clic sobre el boton The litlle tester comics
    Then    Se debe redirigir a la pantalla comics