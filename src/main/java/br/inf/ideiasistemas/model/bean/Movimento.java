/*
 * Copyright Error: on line 4, column 29 in Templates/Licenses/license-apache20.txt
 The string doesn't match the expected date/time format. The string to parse was: "${date?date?string(\"dd/MM/yyyy\")}". The expected format was: "dd/MM/yyyy". Henrique Bartoski .
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package br.inf.ideiasistemas.model.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 *
 * @author Henrique Bartoski
 *
 */
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

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getAgrupamentoCliente() {
        return agrupamentoCliente;
    }

    public void setAgrupamentoCliente(String agrupamentoCliente) {
        this.agrupamentoCliente = agrupamentoCliente;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDataOperacao() {
        return dataOperacao;
    }

    public void setDataOperacao(String dataOperacao) {
        this.dataOperacao = dataOperacao;
    }

    public String getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(String codProduto) {
        this.codProduto = codProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getCodZonaVenda() {
        return codZonaVenda;
    }

    public void setCodZonaVenda(String codZonaVenda) {
        this.codZonaVenda = codZonaVenda;
    }

    public String getDescZonaVenda() {
        return descZonaVenda;
    }

    public void setDescZonaVenda(String descZonaVenda) {
        this.descZonaVenda = descZonaVenda;
    }

    public String getBu() {
        return bu;
    }

    public void setBu(String bu) {
        this.bu = bu;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public String getCampoAdicional1() {
        return campoAdicional1;
    }

    public void setCampoAdicional1(String campoAdicional1) {
        this.campoAdicional1 = campoAdicional1;
    }

    public String getCampoAdicional2() {
        return campoAdicional2;
    }

    public void setCampoAdicional2(String campoAdicional2) {
        this.campoAdicional2 = campoAdicional2;
    }

    public String getTipoDeLoja() {
        return tipoDeLoja;
    }

    public void setTipoDeLoja(String tipoDeLoja) {
        this.tipoDeLoja = tipoDeLoja;
    }

    public int getSuinos() {
        return suinos;
    }

    public void setSuinos(int suinos) {
        this.suinos = suinos;
    }

    public int getLeitoes() {
        return leitoes;
    }

    public void setLeitoes(int leitoes) {
        this.leitoes = leitoes;
    }

    public int getAves() {
        return aves;
    }

    public void setAves(int aves) {
        this.aves = aves;
    }

    public int getPoedeiras() {
        return poedeiras;
    }

    public void setPoedeiras(int poedeiras) {
        this.poedeiras = poedeiras;
    }

    public int getFrangos() {
        return frangos;
    }

    public void setFrangos(int frangos) {
        this.frangos = frangos;
    }

    public int getCamaroes() {
        return camaroes;
    }

    public void setCamaroes(int camaroes) {
        this.camaroes = camaroes;
    }

    public int getPeixes() {
        return peixes;
    }

    public void setPeixes(int peixes) {
        this.peixes = peixes;
    }

    public int getBovinos() {
        return bovinos;
    }

    public void setBovinos(int bovinos) {
        this.bovinos = bovinos;
    }

    public int getVacas() {
        return vacas;
    }

    public void setVacas(int vacas) {
        this.vacas = vacas;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public int getNotaFiscal() {
        return notaFiscal;
    }

    public void setNotaFiscal(int notaFiscal) {
        this.notaFiscal = notaFiscal;
    }

    public String getDataNotaFiscal() {
        return dataNotaFiscal;
    }

    public void setDataNotaFiscal(String dataNotaFiscal) {
        this.dataNotaFiscal = dataNotaFiscal;
    }

    public String getCfop() {
        return cfop;
    }

    public void setCfop(String cfop) {
        this.cfop = cfop;
    }

    public String getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(String dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    @Override
    public String toString() {
        return "Movimento{" + "id=" + id + ", cpfCnpj=" + cpfCnpj + ", ie=" + ie + ", nomeCliente=" + nomeCliente + ", agrupamentoCliente=" + agrupamentoCliente + ", cep=" + cep + ", uf=" + uf + ", cidade=" + cidade + ", endereco=" + endereco + ", telefone=" + telefone + ", email=" + email + ", dataOperacao=" + dataOperacao + ", codProduto=" + codProduto + ", quantidade=" + quantidade + ", preco=" + preco + ", codZonaVenda=" + codZonaVenda + ", descZonaVenda=" + descZonaVenda + ", bu=" + bu + ", classificacao=" + classificacao + ", campoAdicional1=" + campoAdicional1 + ", campoAdicional2=" + campoAdicional2 + ", tipoDeLoja=" + tipoDeLoja + ", suinos=" + suinos + ", leitoes=" + leitoes + ", aves=" + aves + ", poedeiras=" + poedeiras + ", frangos=" + frangos + ", camaroes=" + camaroes + ", peixes=" + peixes + ", bovinos=" + bovinos + ", vacas=" + vacas + ", lote=" + lote + ", notaFiscal=" + notaFiscal + ", dataNotaFiscal=" + dataNotaFiscal + ", cfop=" + cfop + ", dataRegistro=" + dataRegistro + '}';
    }

}
