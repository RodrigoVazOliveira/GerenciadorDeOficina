## GERENCIADOR DE OFICINA

**DIVISÃO DE IMPLEMENTAÇÃO**

dia 17/3/2021 

1. Cadastrar cliente - Weslley - endpoint /clientes/ POST - conclúido
2. Cadastrar veículo - Rodrigo - endpoint /veiculos/ POST - concluído
3. Cadastrar funcionário - Kaio - endpoint /funcionarios/ POST -  concluído
4. Cadastrar serviço - Rodrigo - endpoint /servicoes/ POST - concluído
5. Fazer DTO de cadastro do veículo - Rodrigo - concluído
6. Pesquisar Cliente pelo CPF - Weslley - endpoint /clientes/{cpf}/ - concluído
7. incluir swagger para testes - Weslley - concluído   

dia 18/03/2021

8. Criar DTO de serviço - Rodrigo - concluído
9. Pesquisar veículo pelo chassi - Kaio - não precisa fazer endpoint - concluído
10. Fazer validação no Funcionário - Kaio - concluído
11. Fazer validação no Serviço - Rodrigo - concluído
12. Validação de Cliente - Weslley - concluído
13. pesquisar funcionário pelo CPF - Kaio - Kaio - não precisa fazer endpoint - concluído
14. Criar DTO para cadastrar veículo - Weslley - concluído
15. Validação de endereço - Weslley - concluído
16. Validar se cliente já possui cadastro (cpf ou email) - criar uma exceção personalizada - Weslley
17. Valaidar se funcionario já possui cadastro (cpf) - criar uma exceção personalizada - Kaio
18. Validar se veículo já possui cadastro pelo chassi (chassi) - criar exceção personalizada - Rodrigo

dia 19/03

19. Ajustar mensagem de exceção de cliente duplicado
20. Colocar no cliente a validação de not nullo no atributo endereço
21. Ajustar mensagem de exceção do cliente duplicado. O campo está incorreto. "campo": "Nome do produto ou e-mail"
22. retirar anotações de datas, as mesmas não funcionam.
24. retirar o @DateTimeFormat() para @JsonFormat
25. Criar exceção personalizada para chassi não localizado para busca de veículos
26. Criar GET para mostrar veículo pelo chassi.
27. Criar GET para consultar funcinário pelo CPF.
28. Criar GET para listar todos os veículos.
29. Criar GET para listar todos os funcinários
30. Criar GET para listar todos os serviços pelo chassi do carro.  
31. Criar GET para listar todos os carros.
31. Criar DELETE para deletar um veículo pelo chassi.
32. Criar DELETE para excluir cliente pelo CPF.
33. Criar DELETE para excluir um funcionário pelo CPF.
34. Criar DELETE para excluir um serviço pelo número de ordem de serviço

**definição de modelos**
----
1. Atributos de Cliente:
    *  Nome Completo 
    *  CPF
    *  e-mail
    *  telefone para contato
    *  Endenreco (será uma modelo endereço)


1.2 Atributos de endereco:
   *  rua
   *  número
   *  cidade
   *  cidade
   *  estado
   *  cep

 
2. Atributos de veículo:
    *  tipo de veículo
    *  marca do veículo
    *  modelo do veículo
    *  ano do veículo
    *  placa
    *  chassi
    *  dono do veículo (Cliente)

3. Atributos funcioário
    *  Nome Completo
    *  CPF
    *  Data de nascimento
    
4. Atributos de serviço
    * ordem de serviço
    * veículo
    * data de entrada
    * data de saída
    * tipo de serviço
    * andamento - (enum)
    * funcionário (Funcionário)
    * responsavel pelo serviço
    
---


