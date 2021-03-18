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


