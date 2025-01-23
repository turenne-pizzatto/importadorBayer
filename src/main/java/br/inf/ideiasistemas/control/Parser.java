/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inf.ideiasistemas.control;

import br.inf.ideiasistemas.model.bean.Movimento;
import br.inf.ideiasistemas.model.dao.DAO;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * java -jar /home/ideia/ImportadorBayer/ImportadorBayer.jar
 * /home/ideia/ImportaBayer/ java -jar
 * /home/ideia/ImportadorBayer/ImportadorBayer.jar /home/ideia/ImportarBayer/
 *
 * @author ideia
 */
public class Parser {

    public static void main(String[] args) throws IOException  {
        if(args.length == 0) {
            args = new String[1];
            args[0] = "C:/Temp/home/ideia/ImportaBayer/";
        }
        DAO<Movimento> dao = new DAO<>(Movimento.class);
        System.out.println(args[0] + "Processar");
        File[] filesInDirectory = getFilesInDirectory(args[0] + "Processar");
        for (File file : filesInDirectory) {
            Scanner scanner;
            FileReader fileReader = new FileReader(file.toString());
            scanner = new Scanner(fileReader).useDelimiter("\\n");
            while (scanner.hasNext()) {
                Movimento m = new Movimento();
                String[] l = scanner.next().split(";", - 1);
                int i = 1;

                m.setCpfCnpj(l[i++]);
                m.setIe(l[i++]);
                m.setNomeCliente(l[i++]);
                m.setAgrupamentoCliente(l[i++]);
                m.setCep(l[i++]);
                m.setUf(l[i++]);
                m.setCidade(l[i++]);
                m.setEndereco(l[i++]);
                m.setTelefone(l[i++]);
                m.setEmail(l[i++]);
                m.setDataOperacao(l[i++]);
                m.setCodProduto(l[i++]);
                if (!l[i].isEmpty()) {
                    m.setQuantidade(Integer.parseInt(l[i++]));

                } else {
                    i++;
                }
                if (!l[i].isEmpty()) {
                    m.setPreco(Double.parseDouble(l[i++].replace(",", ".")));
                } else {
                    i++;
                }
                m.setCodZonaVenda(l[i++]);
                m.setDescZonaVenda(l[i++]);
                m.setBu(l[i++]);
                m.setClassificacao(l[i++]);
                m.setCampoAdicional1(l[i++]);
                m.setCampoAdicional2(l[i++]);
                m.setTipoDeLoja(l[i++]);
                if (!l[i].isEmpty()) {
                    m.setSuinos(Integer.parseInt(l[i++]));
                } else {
                    i++;
                }
                if (!l[i].isEmpty()) {
                    m.setLeitoes(Integer.parseInt(l[i++]));
                } else {
                    i++;
                }
                if (!l[i].isEmpty()) {
                    m.setAves(Integer.parseInt(l[i++]));
                } else {
                    i++;
                }
                if (!l[i].isEmpty()) {
                    m.setPoedeiras(Integer.parseInt(l[i++]));
                } else {
                    i++;
                }
                if (!l[i].isEmpty()) {
                    m.setFrangos(Integer.parseInt(l[i++]));
                } else {
                    i++;
                }
                if (!l[i].isEmpty()) {
                    m.setCamaroes(Integer.parseInt(l[i++]));
                } else {
                    i++;
                }
                if (!l[i].isEmpty()) {
                    m.setPeixes(Integer.parseInt(l[i++]));
                } else {
                    i++;
                }
                if (!l[i].isEmpty()) {
                    m.setBovinos(Integer.parseInt(l[i++]));
                } else {
                    i++;
                }
                if (!l[i].isEmpty()) {
                    m.setVacas(Integer.parseInt(l[i++]));
                } else {
                    i++;
                }
                m.setLote(l[i++]);
                if (!l[i].isEmpty()) {
                    m.setNotaFiscal(Integer.parseInt(l[i++]));
                } else {
                    i++;
                }
                m.setDataNotaFiscal(l[i++]);
                m.setCfop(l[i]);

                SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
                m.setDataRegistro(dt.format(new Date()));

                Movimento movEncontrado = dao.HQlQuery("Select x from Movimento x where notaFiscal = '" + m.getNotaFiscal() + "' and codProduto = '" + m.getCodProduto() + "' and classificacao = '"+m.getClassificacao()+"'");
                if (movEncontrado != null) {
                    m.setId(movEncontrado.getId());
                }
                dao.atualiza(m);
            }

            try {
                fileReader.close();
                scanner.close();
                System.out.println("MOVENDO");
                copia(file, new File(args[0] + "Processado/" + file.getName()));
                file.delete();

            } catch (IOException ex) {
                Logger.getLogger(Parser.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
//        filesInDirectory = null;
        System.exit(0);
    }

    public static void copia(File fonte, File destino) throws IOException {
        InputStream in = new FileInputStream(fonte);
        OutputStream out = new FileOutputStream(destino);
        byte[] buf = new byte[1024];
        int len;
        while ((len = in.read(buf)) > 0) {
            out.write(buf, 0, len);
        }
        in.close();
        out.close();
    }

    public static File[] getFilesInDirectory(String dir) {
        File file = new File(dir);
        return file.listFiles();
    }
}
