#Auto generated Octane revision tag
@TID1035REV0.4.0
Feature: Ofertas - Quer pagar quanto

	Scenario Outline: Verifica navigation links no Portal de Ofertas
		Given "<user>" esta no portal de ofertas
		When  clica no link "<link>"  
		Then pagina mostrada com status "<status>"

	Examples:
		| user						 | link					 | status		|
		| admin					     | produtos			     | OK			|
		| Homer				         | servicos				 | OK			|
        | Homer				         | conta			     | NOK			|
