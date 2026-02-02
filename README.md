### 🛡️ Desafio Oracle Next Education (ONE)
Este projeto foi desenvolvido como parte do programa Oracle Next Education em parceria com a Alura. 

 <img src="src/Assets/Badge-Conversor.png" alt="Calculadora 2d" width="150">


### Descrição
Este projeto é um conversor de moedas interativo desenvolvido em Java, projetado para rodar via linha de comando (Console). Ele consome a ExchangeRate-API para obter cotações em tempo real e permite que o usuário selecione a moeda de origem e destino, digite o valor e receba o resultado convertido instantaneamente. 
O objetivo deste projeto foi praticar o consumo de APIs REST, manipulação de JSON e manipulação de taxas de câmbio atualizadas. 
### 🚀 Funcionalidades
    Conversão em Tempo Real: Obtém as taxas de câmbio mais recentes usando a API ExchangeRate-API.
    Seleção de Moedas: Escolha entre diversas opções (ex: USD, BRL, EUR, ARS, etc.).
    Interface de Console: Entrada simples de valores para conversão.
    Tratamento de Dados: Conversão de valores com precisão (formatação de números). 

 ### 🛠️ Tecnologias Utilizadas
    Java 17+
    Biblioteca HTTP do Java (para chamadas de API)
    Gson (para parsing de JSON)
    ExchangeRate-API (serviço de câmbio) 

 ### 🏗️ Como Funciona
    O programa inicia e exibe um menu de opções.
    O usuário escolhe a "Moeda Base" (origem) e a "Moeda Alvo" (destino).
    O usuário digita o valor a ser convertido.
    O programa faz uma requisição GET para https://v6.exchangerate-api.com.
    O resultado é exibido formatado. 

 ### 📋 Pré-requisitos
    JDK 17 ou superior instalado.
    Uma chave de API gratuita da ExchangeRate-API. 

### 🔧  Como Executar
    Clone o repositório:
    bash
    git clone https://github.com
    Abra o projeto na sua IDE de preferência (IntelliJ, Eclipse, VS Code).
    Crie um arquivo para armazenar sua chave API (ou substitua diretamente no código).
    Execute a classe principal ConversorApp.java. 
 ###  💻Exemplo de Uso
 **************************************************
            1) Dólar =>> Peso argentino
            2) Peso argentino =>> Dólar          
            3) Dólar =>> Real brasileiro  
            4) Real brasileiro   =>> Dólar 
            5) Dólar =>> Peso colombiano
            6) Peso colombiano =>> Dólar
            7) Sair
            ****************************************************
            Escolha uma opcao válida

 

