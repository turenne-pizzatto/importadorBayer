package br.inf.ideiasistemas.control;

import br.inf.ideiasistemas.model.bean.Movimento;
import br.inf.ideiasistemas.model.dao.DAO;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Parser {
    public static void main(String[] args) throws FileNotFoundException, ParseException, IOException {
//        System.out.println("RODANDO");
//        args = new String[1];
//        args[0] = "C:\\Users\\ideia\\Desktop\\teste/";
        System.out.println("Rodando");
        System.out.println("Rodando");
        DAO<Movimento> dao = new DAO<>(Movimento.class);
        System.out.println(args[0] + "Processar");
        File[] filesInDirectory = getFilesInDirectory(args[0] + "Processar");
        for (File file : filesInDirectory) {
            Scanner scanner = null;
            FileReader fileReader = new FileReader(file.toString());
            scanner = new Scanner(fileReader).useDelimiter("\\n");
//            System.out.println(file.getAbsoluteFile());
            while (scanner.hasNext()) {
//                try {
                Movimento m = new Movimento();
                String[] l = scanner.next().split(";", - 1);
//                int a = 0;
//                for (String string : l) {
//                    System.out.println(a + " - " + string);
//                    a++;
//                }
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
                if (!l[i].equals("")) {
                    m.setQuantidade(Integer.parseInt(l[i++]));
//                    System.out.println(i);
//                    System.out.println(l[i]);

                } else {
                    i++;
                }
                if (!l[i].equals("")) {
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
                if (!l[i].equals("")) {
                    m.setSuinos(Integer.parseInt(l[i++]));
                } else {
                    i++;
                }
                if (!l[i].equals("")) {
                    m.setLeitoes(Integer.parseInt(l[i++]));
                } else {
                    i++;
                }
                if (!l[i].equals("")) {
                    m.setAves(Integer.parseInt(l[i++]));
                } else {
                    i++;
                }
                if (!l[i].equals("")) {
                    m.setPoedeiras(Integer.parseInt(l[i++]));
                } else {
                    i++;
                }
                if (!l[i].equals("")) {
                    m.setFrangos(Integer.parseInt(l[i++]));
                } else {
                    i++;
                }
                if (!l[i].equals("")) {
                    m.setCamaroes(Integer.parseInt(l[i++]));
                } else {
                    i++;
                }
                if (!l[i].equals("")) {
                    m.setPeixes(Integer.parseInt(l[i++]));
                } else {
                    i++;
                }
                if (!l[i].equals("")) {
                    m.setBovinos(Integer.parseInt(l[i++]));
                } else {
                    i++;
                }
                if (!l[i].equals("")) {
                    m.setVacas(Integer.parseInt(l[i++]));
                } else {
                    i++;
                }
                m.setLote(l[i++]);
                if (!l[i].equals("")) {
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
        filesInDirectory = null;
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
        File arquivos[] = file.listFiles();
        return arquivos;
    }
}
