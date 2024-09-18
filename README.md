# Códigos de Programação Distribuída em Java - Aulas

Este repositório contém uma coleção de códigos-fonte em Java desenvolvidos para o aprendizado na implementação de sistemas distribuídos. Os códigos são usados como exemplos e exercícios durante as aulas, cobrindo conceitos e tópicos relacionados à programação distribuída, tópico da disciplina Programação IV do curso de Sistemas de Informação da Universidade Estadual de Goiás (UEG) - Unidade Universitária de Posse.

## Estrutura das Pastas

Abaixo está a organização das pastas e uma breve descrição de cada uma:

```plaintext
/
├── RMI/
│   ├── HelloService.java       # Interface com os métodos implementados no serviço  
│   ├── HelloServiceImpl.java   # Implementação dos métodos definidos na interface
│   ├── RMIClient.java          # Consome os serviços definidos no cliente
│   ├── RMIServer.java          # Cria um servidor para disponibilizar os serviços e receber requisições de clientes 
│   └── pom.xml                 # Arquivo XML com as dependências e configurações do MAVEN
├── RPC/
│   ├── HelloClient.java        # Implementação dos métodos stub no cliente
│   ├── HelloService.java       # Interface com os métodos implementados no serviço
│   ├── HelloServiceImpl.java   # Implementação dos métodos definidos na interface
│   ├── SoapServer.java         # Implementação dos métodos stub no servidor
│   └── pom.xml                 # Arquivo XML com as dependências e configurações do MAVEN
├── Socket/
│   ├── ClienteBaisco.java      # Implementação de um cliente básico utilizando socket
│   ├── ServidorBasico.java     # Implementação de um servidor básico utilizando socket
│   ├── SendFile.java           # Implementação de um cliente para enviar um arquivo para um servidor utilizando socket
│   ├── ReceiveFile.java        # Implementação de um servidor para receber e processar um arquivo enviando de um cliente utilizando socket
│   ├── ServerTime.java         # Implementação de um servidor de data e hora utilizando socket
│   └── ClientTime.java         # Implementação de um cliente que busca a data e hora de um servidor utilizando socket


