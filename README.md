# Jogo da Velha

Implementação clássica do Jogo da Velha (Tic-Tac-Toe), desenvolvida com foco na aplicação prática de lógica de programação, manipulação de estado, controle de fluxo e verificação de condições de vitória.

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)

## 📌 Sobre o Projeto

O propósito deste projeto é criar uma versão funcional do jogo clássico, lidando com os desafios lógicos de mapear um tabuleiro bidimensional, alternar os turnos entre os jogadores e validar o fim da partida de maneira eficiente.

O contexto dessa aplicação envolve meus estudos contínuos em desenvolvimento de software e no curso de Análise e Desenvolvimento de Sistemas na FATEC Ipiranga, permitindo explorar na prática a construção de algoritmos do zero e consolidar conhecimentos em estruturação de código.

## 🚀 Funcionalidades

- [x] Inicialização do tabuleiro 3x3.
- [x] Alternância de turnos automática entre os jogadores.
- [x] Validação de jogadas (impede que uma casa já ocupada seja sobrescrita).
- [x] Algoritmo de verificação de vitória (checagem de linhas, colunas e diagonais).
- [x] Verificação de empate (quando não há mais movimentos possíveis e nenhum vencedor).
- [ ] Sistema de placar contínuo.
- [ ] Modo de jogo contra a máquina (Bot).

## 🛠️ Tecnologias Utilizadas

| Tecnologia | Utilização |
|------------|------------|
| Java | Linguagem principal da aplicação (Java SE) |
| IntelliJ IDEA | Ambiente de Desenvolvimento Integrado (IDE) utilizado para o projeto |

## 📂 Estrutura do Projeto

```text
src/
└── Velha.java
```

## 🧠 Conceitos e Práticas Utilizadas

*   **Estruturas de Dados e Matrizes:** Representação lógica dos estados do tabuleiro de forma matricial ou lista indexada.
*   **Estruturas de Controle (If/Else, Loops):** Essenciais para varrer o tabuleiro, validar se uma jogada é permitida e verificar sistematicamente as condições de fim de jogo.
*   **Lógica Algorítmica:** O desafio central do projeto, que consistiu em criar um algoritmo que identifique padrões de vitória sem repetição desnecessária de código.
*   **Separação de Responsabilidades:** Divisão entre a regra do jogo e a camada de apresentação visual.

## 📚 O Que Eu Aprendi

### Lógica Algorítmica e Estruturas de Dados
O desenvolvimento deste projeto me permitiu entender, na prática, como mapear as regras de um jogo físico para dentro do código, melhorando meu raciocínio com controle de fluxo e índices.

### Resolução de Problemas
Durante o desenvolvimento, precisei garantir que o sistema não apenas identificasse o vencedor, mas também reconhecesse empates e blindasse o jogo contra ações inválidas do usuário, como tentar jogar em um espaço já preenchido.

## ⚙️ Como Executar o Projeto

### Pré-requisitos
- [Java JDK 11 ou superior](https://www.oracle.com/java/technologies/downloads/) instalado na máquina.
- Git

### Passo a Passo

1. **Clone o repositório:**
```bash
git clone https://github.com/gucarneiro/jogo-da-velha.git
cd jogo-da-velha/src
```

2. **Compile a classe Java:**
```bash
javac Velha.java
```

## 💻 Exemplos de Uso

```text
Exemplo de visualização da partida:
X |   |   |  
-----------
  | O |   |  
-----------
  |   | X |  
-----------
> Vez do jogador 1: 
> Escolha a linha: 
> Escolha a coluna: 

```

## 🧪 Testes

Atualmente, o projeto não conta com frameworks de testes automatizados. As validações foram realizadas de maneira manual, testando de ponta a ponta todos os cenários possíveis de vitória, derrota e empate.

*Oportunidade de melhoria:* Implementar testes unitários para a lógica de verificação de vitória.

## 💡 Decisões Técnicas

### Verificação de Vitória Otimizada
**Decisão:** Utilizar rotinas lógicas padronizadas para validar linhas, colunas e diagonais em vez de checagens manuais repetitivas.
**Motivo:** Manter a legibilidade do código e reduzir a complexidade desnecessária.
**Benefício:** O código tornou-se mais limpo, escalável e de fácil manutenção.

## 📈 Pontos Fortes

*   **Validação eficiente:** O algoritmo lida bem com cenários limítrofes, como o preenchimento da última casa resultando na vitória correta.
*   **Código direto ao ponto:** Foco total na resolução do problema de forma enxuta e funcional.

## 🔧 O Que Pode Ser Melhorado

**Problema:** Acoplamento entre a engine do jogo e a interface de exibição.
**Impacto:** Dificulta a portabilidade para outras interfaces (como Web ou Mobile).
**Possível solução:** Aplicar padrões arquiteturais para isolar completamente as regras de negócio da camada de apresentação.

## 🗺️ Próximos Passos

- [ ] Refatorar a separação entre regras de negócio e interface.
- [ ] Adicionar um contador de vitórias (placar).
- [ ] Implementar testes automatizados para a validação do jogo.
- [ ] Desenvolver um modo contra a inteligência artificial.

## 🤝 Contribuição

Contribuições são sempre bem-vindas!

1. Faça um Fork do projeto.
2. Crie uma branch para a sua feature: `git checkout -b feature/nova-feature`
3. Commit suas mudanças: `git commit -m 'feat: adiciona nova funcionalidade'`
4. Faça o push para a branch: `git push origin feature/nova-feature`
5. Abra um Pull Request.

## 📄 Licença

Este projeto ainda não possui uma licença definida.

## 👨‍💻 Autor

Desenvolvido por **Gustavo Carneiro**

- GitHub: https://github.com/gucarneiro
- LinkedIn: https://www.linkedin.com/in/gucarneiro/