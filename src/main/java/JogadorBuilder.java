public class JogadorBuilder {
    private Jogador jogador;

    public JogadorBuilder(){
        jogador = new Jogador();
    }

    public Jogador build(){
        if (jogador.getId() == 0){
            throw new IllegalArgumentException("Id inválido");
        }
        if (jogador.getNome().equals("")){
            throw new IllegalArgumentException("Nome inválido");
        }
        if (jogador.getClasse().equals((""))) {
            throw new IllegalArgumentException("Classe inválida");
        }
        if (jogador.getClasse().equals(("mestre"))) {
            throw new IllegalArgumentException("Jogador é mestre");
        }
        return jogador;
    }

    public JogadorBuilder setId(int id){
        jogador.setId(id);
        return this;
    }
    public JogadorBuilder setNome(String nome){
        jogador.setNome(nome);
        return this;
    }
    public JogadorBuilder setClasse(String classe){
        jogador.setClasse(classe);
        return this;
    }
    public JogadorBuilder setEspecializacao(String especializacao){
        jogador.setEspecializacao(especializacao);
        return this;
    }
    public JogadorBuilder setNivel(String nivel){
        jogador.setNivel(nivel);
        return this;
    }
    public JogadorBuilder setEnderecoLogradouro(String enderecoLogradouro){
        jogador.setEnderecoLogradouro(enderecoLogradouro);
        return this;
    }
    public JogadorBuilder setEnderecoNumero(int enderecoNumero){
        jogador.setEnderecoNumero(enderecoNumero);
        return this;
    }
    public JogadorBuilder setEnderecoComplemento(String enderecoComplemento){
        jogador.setEnderecoComplemento(enderecoComplemento);
        return this;
    }
    public JogadorBuilder setEnderecoBairro(String enderecoBairro){
        jogador.setEnderecoBairro(enderecoBairro);
        return this;
    }
    public JogadorBuilder setEnderecoCidade(String enderecoCidade){
        jogador.setEnderecoCidade(enderecoCidade);
        return this;
    }
    public JogadorBuilder setEnderecoUF(String enderecoUF){
        jogador.setEnderecoUF(enderecoUF);
        return this;
    }
    public JogadorBuilder setCep(String cep){
        jogador.setCep(cep);
        return this;
    }
    public JogadorBuilder setTelefone(String telefone){
        jogador.setTelefone(telefone);
        return this;
    }
    public JogadorBuilder setEmail(String email){
        jogador.setEmail(email);
        return this;
    }
}
