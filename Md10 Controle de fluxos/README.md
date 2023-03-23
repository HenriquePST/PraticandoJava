Controle de fluxos

O controle de fluxo é efetuado por condicionais que modificam o
percurso do programa. Em java existem alguns controles:
➔if
➔else
➔else if
➔for
➔while
➔do while
➔switch
➔break
➔continue

➔ if, else e else if

São tomadas de decisões que definem o que é verdadeiro e o que é
falso.
IF significa que a instrução é verdadeira e else que é false.
Se (if) for tal coisa, faça isso, caso contrário (else), faça aquela outra
coisa.

➔ for

O loop for é mais fixo, permite executar o conjunto de sentenças por
um número determinado de vezes. O princípio do loop for é ser um
contador. Exemplo:

➔break
➔continue

São dois comandos de controle que são usados juntos com os
controles de fluxos for e while.

O comando break faz com que um loop pare em uma determinada
execução.
O comando continue é diferente do comando break, ele não para a
execução e sim continua.

➔while

É um fluxo de controle que executa uma comparação, caso esta
comparação seja verdadeira o fluxo entra no loop. Está comparação
é feita em primeiro lugar, caso o resultado seja verdadeiro ele
executa o código dentro do loop.

➔ Diferenças for e while

A principal diferença entre o controle de fluxo for e o while é que o for
você sabe quando a sua execução vai parar, pois você atribui uma
variável de controle. Já no while ele continuará executando o código
até que uma condição (Você não sabe quando isso irá ocorrer) seja
atingida.

➔do while

O loop do while é igual ao loop while, só que ao invés de verificar a
condição em primeiro lugar ele executa o código dentro do loop
e depois verifica a condição.

➔switch

O switch verifica uma variável e age de acordo com os seus casos.
Exemplo.
SWITCH (variável) {
CASE valor :
Código a ser executado caso o valor de case seja o
mesmo da variável de switch.
break;
CASE valor:
Outro código;
break;