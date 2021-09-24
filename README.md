# backend-challenge

#Instrução para execução do projeto

-- Java 8+
-- Maven

#Racional por traz da implementação do desafio

Pensando em deixar o código com baixo acoplamento, coeso, flexível, extensível e estável, 
decidi separar cada uma das validações em classes destintas, cada classe com uma única responsabilidade.

Usei interface para que cada classe que contenha as validações, implemente o método validarSenha da interface ValidacaoSenha, 
permitindo que caso suja novas validações, não seja necessário mexer nas classes existentes, 
apenas criar uma nova classe de validação que implemente a interface, mantendo o código aberto para extensão, 
fechado para modificação e diminuindo o acomplamento.

Favorecendo também a inversão de dependência, pois não é necessário conhecer cada validação, 
pois a interface fornecerá uma abstração dessas validações, tornando o código mais extensível e flexível. 

No momento da execução, ao invés de chamar cada classe de validação, 
chamei apenas a interface pedindo para que ela execute seu método, 
com isso as classes que implementam essa interface serão acionadas e as validações serão realizadas, 
devolvendo um retorno em relação a senha passada.

Optei por usar Exceções com mensagens mais claras quando a senha não atender aos criterios desejados.