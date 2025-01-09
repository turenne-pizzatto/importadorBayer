package br.inf.ideiasistemas.model.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serializable;

@Entity
@Table(name = "MOVIMENTO")
public class Movimento implements Serializable {
    @Id
    @GeneratedValue
    private Integer id;
    private String cpfCnpj;
    private String ie;
    private String nomeCliente;
    private String agrupamentoCliente;
    private String cep;
    private String uf;
    private String cidade;
    private String endereco;
    private String telefone;
    private String email;
    private String dataOperacao;
    private String codProduto;
    private int quantidade;
    private double preco;
    private String codZonaVenda;
    private String descZonaVenda;
    private String bu;
    private String classificacao;
    private String campoAdicional1;
    private String campoAdicional2;
    private String tipoDeLoja;
    private int suinos;
    private int leitoes;
    private int aves;
    private int poedeiras;
    private int frangos;
    private int camaroes;
    private int peixes;
    private int bovinos;
    private int vacas;
    private String lote;
    private int notaFiscal;
    private String dataNotaFiscal;
    private String cfop;
    private String dataRegistro;

    public Movimento() {
    }

    public Movimento(String cpfCnpj, String ie, String nomeCliente, String agrupamentoCliente, String cep, String uf, String cidade, String endereco, String telefone, String email, String dataOperacao, String codProduto, int quantidade, double preco, String codZonaVenda, String descZonaVenda, String bu, String classificacao, String campoAdicional1, String campoAdicional2, String tipoDeLoja, int suinos, int leitoes, int aves, int poedeiras, int frangos, int camaroes, int peixes, int bovinos, int vacas, String lote, int notaFiscal, String dataNotaFiscal, String cfop, String dataRegistro) {
        this.cpfCnpj = cpfCnpj;
        this.ie = ie;
        this.nomeCliente = nomeCliente;
        this.agrupamentoCliente = agrupamentoCliente;
        this.cep = cep;
        this.uf = uf;
        this.cidade = cidade;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.dataOperacao = dataOperacao;
        this.codProduto = codProduto;
        this.quantidade = quantidade;
        this.preco = preco;
        this.codZonaVenda = codZonaVenda;
        this.descZonaVenda = descZonaVenda;
        this.bu = bu;
        this.classificacao = classificacao;
        this.campoAdicional1 = campoAdicional1;
        this.campoAdicional2 = campoAdicional2;
        this.tipoDeLoja = tipoDeLoja;
        this.suinos = suinos;
        this.leitoes = leitoes;
        this.aves = aves;
        this.poedeiras = poedeiras;
        this.frangos = frangos;
        this.camaroes = camaroes;
        this.peixes = peixes;
        this.bovinos = bovinos;
        this.vacas = vacas;
        this.lote = lote;
        this.notaFiscal = notaFiscal;
        this.dataNotaFiscal = dataNotaFiscal;
        this.cfop = cfop;
        this.dataRegistro = dataRegistro;
    }

    public Movimento(Integer id, String cpfCnpj, String ie, String nomeCliente, String agrupamentoCliente, String cep, String uf, String cidade, String endereco, String telefone, String email, String dataOperacao, String codProduto, int quantidade, double preco, String codZonaVenda, String descZonaVenda, String bu, String classificacao, String campoAdicional1, String campoAdicional2, String tipoDeLoja, int suinos, int leitoes, int aves, int poedeiras, int frangos, int camaroes, int peixes, int bovinos, int vacas, String lote, int notaFiscal, String dataNotaFiscal, String cfop, String dataRegistro) {
        this.id = id;
        this.cpfCnpj = cpfCnpj;
        this.ie = ie;
        this.nomeCliente = nomeCliente;
        this.agrupamentoCliente = agrupamentoCliente;
        this.cep = cep;
        this.uf = uf;
        this.cidade = cidade;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.dataOperacao = dataOperacao;
        this.codProduto = codProduto;
        this.quantidade = quantidade;
        this.preco = preco;
        this.codZonaVenda = codZonaVenda;
        this.descZonaVenda = descZonaVenda;
        this.bu = bu;
        this.classificacao = classificacao;
        this.campoAdicional1 = campoAdicional1;
        this.campoAdicional2 = campoAdicional2;
        this.tipoDeLoja = tipoDeLoja;
        this.suinos = suinos;
        this.leitoes = leitoes;
        this.aves = aves;
        this.poedeiras = poedeiras;
        this.frangos = frangos;
        this.camaroes = camaroes;
        this.peixes = peixes;
        this.bovinos = bovinos;
        this.vacas = vacas;
        this.lote = lote;
        this.notaFiscal = notaFiscal;
        this.dataNotaFiscal = dataNotaFiscal;
        this.cfop = cfop;
        this.dataRegistro = dataRegistro;
    }

    public Integer getId() {
        return id;
    }

    public String getCodProduto() {
        return codProduto;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public int getNotaFiscal() {
        return notaFiscal;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setAgrupamentoCliente(String agrupamentoCliente) {
        this.agrupamentoCliente = agrupamentoCliente;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDataOperacao(String dataOperacao) {
        this.dataOperacao = dataOperacao;
    }

    public void setCodProduto(String codProduto) {
        this.codProduto = codProduto;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setCodZonaVenda(String codZonaVenda) {
        this.codZonaVenda = codZonaVenda;
    }

    public void setDescZonaVenda(String descZonaVenda) {
        this.descZonaVenda = descZonaVenda;
    }

    public void setBu(String bu) {
        this.bu = bu;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public void setCampoAdicional1(String campoAdicional1) {
        this.campoAdicional1 = campoAdicional1;
    }

    public void setCampoAdicional2(String campoAdicional2) {
        this.campoAdicional2 = campoAdicional2;
    }

    public void setTipoDeLoja(String tipoDeLoja) {
        this.tipoDeLoja = tipoDeLoja;
    }

    public void setSuinos(int suinos) {
        this.suinos = suinos;
    }

    public void setLeitoes(int leitoes) {
        this.leitoes = leitoes;
    }

    public void setAves(int aves) {
        this.aves = aves;
    }

    public void setPoedeiras(int poedeiras) {
        this.poedeiras = poedeiras;
    }

    public void setFrangos(int frangos) {
        this.frangos = frangos;
    }

    public void setCamaroes(int camaroes) {
        this.camaroes = camaroes;
    }

    public void setPeixes(int peixes) {
        this.peixes = peixes;
    }

    public void setBovinos(int bovinos) {
        this.bovinos = bovinos;
    }

    public void setVacas(int vacas) {
        this.vacas = vacas;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public void setNotaFiscal(int notaFiscal) {
        this.notaFiscal = notaFiscal;
    }

    public void setDataNotaFiscal(String dataNotaFiscal) {
        this.dataNotaFiscal = dataNotaFiscal;
    }

    public void setCfop(String cfop) {
        this.cfop = cfop;
    }

    public void setDataRegistro(String dataRegistro) {
        this.dataRegistro = dataRegistro;
    }
}
