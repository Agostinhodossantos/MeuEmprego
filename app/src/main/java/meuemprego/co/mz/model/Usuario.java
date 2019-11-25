package meuemprego.co.mz.model;

public class Usuario {
    private String uid , nome , img , proficao , descricao , tempo ,localizacao ;
    private long posicao;
    public Usuario(){}

    public String getUid() {
        return uid;
    }

    public Usuario(String uid, String nome, String img, String proficao, String descricao, String tempo, String localizacao, long posicao) {
        this.uid = uid;
        this.nome = nome;
        this.img = img;
        this.proficao = proficao;
        this.descricao = descricao;
        this.tempo = tempo;
        this.localizacao = localizacao;
        this.posicao = posicao;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getProficao() {
        return proficao;
    }

    public void setProficao(String proficao) {
        this.proficao = proficao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTempo() {
        return tempo;
    }

    public void setTempo(String tempo) {
        this.tempo = tempo;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public long getPosicao() {
        return posicao;
    }

    public void setPosicao(long posicao) {
        this.posicao = posicao;
    }
}
