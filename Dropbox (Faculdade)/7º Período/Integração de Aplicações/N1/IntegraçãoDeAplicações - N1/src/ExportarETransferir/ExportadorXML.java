package ExportarETransferir;
import java.io.File;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class ExportadorXML {

    public void geraXml(){
        
        try {
            
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder;
            documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document documentoXML = documentBuilder.newDocument();
        
            Element root = documentoXML.createElement("root");
            documentoXML.appendChild(root);
            
            int i=0;
            ArrayList<String> ListaCodigoDosProdutos = new ArrayList<>();
            ListaCodigoDosProdutos.add("01");ListaCodigoDosProdutos.add("02");ListaCodigoDosProdutos.add("03");
            ListaCodigoDosProdutos.add("04");ListaCodigoDosProdutos.add("05");ListaCodigoDosProdutos.add("06");
            ListaCodigoDosProdutos.add("07");ListaCodigoDosProdutos.add("08");ListaCodigoDosProdutos.add("09");
            ListaCodigoDosProdutos.add("10");ListaCodigoDosProdutos.add("11");ListaCodigoDosProdutos.add("12");
            ListaCodigoDosProdutos.add("13");ListaCodigoDosProdutos.add("14");ListaCodigoDosProdutos.add("15");
            ListaCodigoDosProdutos.add("16");ListaCodigoDosProdutos.add("17");ListaCodigoDosProdutos.add("18");
            ListaCodigoDosProdutos.add("19");ListaCodigoDosProdutos.add("20");ListaCodigoDosProdutos.add("21");
            ListaCodigoDosProdutos.add("22");ListaCodigoDosProdutos.add("23");ListaCodigoDosProdutos.add("24");
            ListaCodigoDosProdutos.add("25");ListaCodigoDosProdutos.add("26");ListaCodigoDosProdutos.add("27");
            ListaCodigoDosProdutos.add("28");ListaCodigoDosProdutos.add("29");ListaCodigoDosProdutos.add("30");
            
            ArrayList<String> ListaDeProdutos = new ArrayList<>();
            ListaDeProdutos.add("Arroz 5Kg");ListaDeProdutos.add("Feijão 1Kg");ListaDeProdutos.add("Farinha de Trigo 1Kg");
            ListaDeProdutos.add("Extrato de Tomate 340g");ListaDeProdutos.add("Macarrão 500g");ListaDeProdutos.add("Biscoito Recheado 90g");
            ListaDeProdutos.add("Sardinha 125g");ListaDeProdutos.add("Café 500g");ListaDeProdutos.add("Salsinha Kg");
            ListaDeProdutos.add("Achocolatado em pó 800g");ListaDeProdutos.add("Gelatina 35g");ListaDeProdutos.add("Sabão em pó 1Kg");
            ListaDeProdutos.add("Sabonete 90g");ListaDeProdutos.add("Macarrão Instantaneo 90g");ListaDeProdutos.add("Adocante 100ml");
            ListaDeProdutos.add("Tomate Kg");ListaDeProdutos.add("Cenoura Kg");ListaDeProdutos.add("Pepino Kg");
            ListaDeProdutos.add("Chuchu Kg");ListaDeProdutos.add("Salgado Un");ListaDeProdutos.add("Berinjela Kg");
            ListaDeProdutos.add("Coca-Cola 2l");ListaDeProdutos.add("Creme dental 90g");ListaDeProdutos.add("Cerveja 350ml");
            ListaDeProdutos.add("Picanha Kg");ListaDeProdutos.add("Cupim Kg");ListaDeProdutos.add("Celular");
            ListaDeProdutos.add("Notebook");ListaDeProdutos.add("Televisor 29");ListaDeProdutos.add("Vodka 900ml");
            
            ArrayList<String> ListaValorDeCompra = new ArrayList<>();
            ListaValorDeCompra.add("13");ListaValorDeCompra.add("5");ListaValorDeCompra.add("2");
            ListaValorDeCompra.add("3");ListaValorDeCompra.add("1");ListaValorDeCompra.add("1");
            ListaValorDeCompra.add("3");ListaValorDeCompra.add("7");ListaValorDeCompra.add("4");
            ListaValorDeCompra.add("9");ListaValorDeCompra.add("1");ListaValorDeCompra.add("6");
            ListaValorDeCompra.add("1");ListaValorDeCompra.add("2");ListaValorDeCompra.add("2");
            ListaValorDeCompra.add("4");ListaValorDeCompra.add("3");ListaValorDeCompra.add("1");
            ListaValorDeCompra.add("2");ListaValorDeCompra.add("2");ListaValorDeCompra.add("4");
            ListaValorDeCompra.add("5");ListaValorDeCompra.add("3");ListaValorDeCompra.add("2");
            ListaValorDeCompra.add("31");ListaValorDeCompra.add("22");ListaValorDeCompra.add("799");
            ListaValorDeCompra.add("2199");ListaValorDeCompra.add("1590");ListaValorDeCompra.add("12");
            
            for(i=0; i<ListaCodigoDosProdutos.size(); i++){
            
            Element produto = documentoXML.createElement("prod");
            Attr id = documentoXML.createAttribute("id");
            id.setValue(""+(i+1));
            produto.setAttributeNode(id);
            root.appendChild(produto);
            
            Element cProd = documentoXML.createElement("cprod");
            cProd.appendChild(documentoXML.createTextNode(ListaCodigoDosProdutos.get(i)));
            produto.appendChild(cProd);
            
            Element xProd = documentoXML.createElement("xprod");
            xProd.appendChild(documentoXML.createTextNode(ListaDeProdutos.get(i)));
            produto.appendChild(xProd);
            
            Element qCom = documentoXML.createElement("qcom");
            qCom.appendChild(documentoXML.createTextNode("10"));
            produto.appendChild(qCom);
            
            Element vUnCom = documentoXML.createElement("vuncom");
            vUnCom.appendChild(documentoXML.createTextNode(ListaValorDeCompra.get(i)));
            produto.appendChild(vUnCom);
            
            Element vProd = documentoXML.createElement("vprod");            
            vProd.appendChild(documentoXML.createTextNode(Integer.toString(Integer.parseInt(ListaValorDeCompra.get(i))*100)));
            produto.appendChild(vProd);
                        
            }
            
            try {
                
                TransformerFactory transformeFactory = TransformerFactory.newInstance();
                Transformer transformer = transformeFactory.newTransformer();
                
                DOMSource documentoFone = new DOMSource(documentoXML);
                
                StreamResult documentoFinal = new StreamResult(new File("NovoXML.xml"));
                
                try {
                    
                    transformer.transform(documentoFone, documentoFinal);                    
                    
                } catch (TransformerException ex) {
                    Logger.getLogger(ExportadorXML.class.getName()).log(Level.SEVERE, null, ex);
                }
                                               
            } catch (TransformerConfigurationException ex) {
                Logger.getLogger(ExportadorXML.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(ExportadorXML.class.getName()).log(Level.SEVERE, null, ex);
        }                
        
    }
    
}
