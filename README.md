## GERENCIADOR DE OFICINA

**DIVISÃO DE IMPLEMENTAÇÃO**

dia 17/3/2021 

1. Cadastrar cliente - Weslley - endpoint /clientes/ POST - conclúido
2. Cadastrar veículo - Rodrigo - endpoint /veiculos/ POST - concluído
3. Cadastrar funcionário - Kaio - endpoint /funcionarios/ POST -  
4. Cadastrar serviço - Weslley - endpoint /servicoes/ POST
5. Fazer DTO de cadastro do veículo - Rodrigo - concluído
6. Pesquisar Cliente pelo CPF - Weslley - endpoint /clientes/{cpf}/ - concluído

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


