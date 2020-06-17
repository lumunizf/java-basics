# Java

## :coffee: Exercícios do Curso de Java básico - By [Loiane Groner](http://loiane.training)


## Configurações do ambiente Java

### Pré-Requisitos

 * Java JDK 8 instalado e configurado.
 

## Configuração do ambiente para o Windows 10

### 1. Instalação do Java

- Download do instalador do [Java JDK](http://www.oracle.com/technetwork/pt/java/javase/downloads)
- Aceitar a licença clicando em "Accept License Agreement".
- Clicar no link para download referente ao seu sistema operacional (Windows x64).
- Após o download, executar a instalação (*next, next, finish*).

### 2. Configuração das variáveis de ambiente

- Adicionar *JAVA_HOME* nas variáveis de ambiente:

    * Meu Computador > Botão direito: Propriedades > Configurações avançadas do sistema;
    * Propriedades do sistema: Aba 'Avançado' > Botão "Variáveis do ambiente";
    * Na área "Variáveis do sistema", clicar no botão 'Novo...';
    * Na janela "Nova variável de sistema", preencher o campo 'Nome da variável' com *JAVA_HOME* e o campo 'Valor da variável' com o caminho do diretório onde o Java foi instalado.

- Atualizar o *PATH* das variáveis de ambiente:
    * Ainda na área "Variáveis do sistema", selecionar a variável "Path" > botão Editar.
    * Acrescentar ao final das configurações > *;%JAVA_HOME%\bin* > botão OK.

### 3. Validar a configuração das variáveis de ambiente

- Acessar o prompt de comando e digitar:

```
java -version
```

> O sistema deve apresentar a versão do Java instalada.

- Ainda no prompt de comando, digitar:

```
javac -version
```

> O sistema deve apresentar a versão do compilador Java instalada.  



### License

MIT License © [Luciana Muniz Freire](https://br.linkedin.com/in/lumunizf)