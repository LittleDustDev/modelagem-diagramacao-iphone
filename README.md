# Componente iPhone - Modelagem UML e Implementação Java

## Sobre o Projeto
Este projeto visa modelar e diagramar um componente iPhone, focando nas funcionalidades de Reprodutor Musical, Aparelho Telefônico e Navegador na Internet. Com base no lançamento do iPhone de 2007, este repositório contém tanto a diagramação UML quanto a implementação das classes e interfaces em Java.

## Funcionalidades
- **Reprodutor Musical**: Permite tocar, pausar e selecionar músicas.
- **Aparelho Telefônico**: Oferece funcionalidades para ligar, atender chamadas e acessar o correio de voz.
- **Navegador na Internet**: Possibilita exibir páginas da web, adicionar novas abas e atualizar páginas existentes.

## Contato
[![LinkedIn](https://img.shields.io/badge/linkedin-%230077B5.svg?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/marcos-rafael-r-dos-santos-105790257)




## DIAGRAMA UML (Mermaid)

```mermaid
classDiagram
    class ReprodutorMusical{
      +String musica
      +tocar() void
      +pausar() void
      +selecionarMusica(String musica) void
    }
    class AparelhoTelefonico{
      +Int numero
      +ligar(Int numero) void
      +atender() void
      +iniciarCorreioVoz() void
    }
    class NavegadorInternet{
      +String url
      +exibirPagina(String url) void
      +adicionarNovaAba() void
      +atualizarPagina() void
    }
    class iPod{
    }
    class Celular{
    }
    class Browser{
    }
    iPhone --|> ReprodutorMusical
    iPhone --|> AparelhoTelefonico
    iPhone --|> NavegadorInternet
    iPod --|> ReprodutorMusical
    Celular --|> AparelhoTelefonico
    Browser --|> NavegadorInternet
    ```