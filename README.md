## GERENCIADOR DE OFICINA

**DIVISÃO DE IMPLEMENTAÇÃO**

dia 17/3/2021 

1. Cadastrar cliente - Weslley - endpoint /clientes/ POST - conclúido
2. Cadastrar veículo - Rodrigo - endpoint /veiculos/ POST - concluído
3. Cadastrar funcionário - Kaio - endpoint /funcionarios/ POST -  
4. Cadastrar serviço - Rodrigo - endpoint /servicoes/ POST - concluído
5. Fazer DTO de cadastro do veículo - Rodrigo - concluído
6. Pesquisar Cliente pelo CPF - Weslley - endpoint /clientes/{cpf}/ - concluído
7. incluir swagger para testes - Weslley - concluído  
8. Criar DTO de serviço - Rodrigo 
9. Pesquisar veículo pelo chassi - Kaio 
10. Fazer validação no Funcionário - Kaio
11. Fazer validação no Serviço - Rodrigo
12. Validação de Cliente - Weslley



**definição de modelos**
----
1. Atributos de Cliente:
    *  Nome Completo 
    *  CPF ou CNPJ
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


