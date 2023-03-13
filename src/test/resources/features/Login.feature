#language:pt
  Funcionalidade: Pagina de Busca
    Cenario: Busca exibida com sucesso
      Dado esteja na pagina inicial: "https://blogdoagi.com.br/
      Quando clicar na busca no canto superior esquerdo
      Entao validar que foi exibido o campo da pesquisa com sucesso
    Cenario: Busca com Erro
      Dado esteja na pagina inicial: "https://blogdoagi.com.br/
      Quando clicar na busca no canto superior esquerdo
      Entao validar que não foi exibido o campo da pesquisa