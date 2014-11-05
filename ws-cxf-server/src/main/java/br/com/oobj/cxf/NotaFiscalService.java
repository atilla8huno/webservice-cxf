package br.com.oobj.cxf;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

@WebService(targetNamespace = "http://cxf.oobj.com.br/", 
			portName = "NotaFiscalServicePort", 
			serviceName = "NotaFiscalService",
			wsdlLocation = "WEB-INF/wsdl/notafiscalservice.wsdl")
public class NotaFiscalService {

	@WebMethod(operationName = "consomeXML", action = "urn:ConsomeXML")
	public String consomeXML(@WebParam(name = "nfeEmXML") String nfeEmXML) {
		NotaFiscal nfe = fromXML(nfeEmXML);
		nfe = tratarNFe(nfe);
		
//		return Response.status(200).entity(toXML(nfe)).build();
		return toXML(nfe);
	}
	
    @WebMethod(operationName = "imprimirNotaDaEmpresa", action = "urn:ImprimirNotaDaEmpresa")
	public String imprimirNotaDaEmpresa(@WebParam(name = "empresa") String empresa) {
    	System.out.println(empresa);
        return toXML(NotaFiscal.create(empresa));
    }

	/**
	 * Processa a nota fiscal e altera o status
	 * 
	 * @param nfe
	 * @return NotaFiscal
	 */
	private NotaFiscal tratarNFe(NotaFiscal nfe) {
		contarAte(150000);
		nfe.setStatus("AUTORIZADO");
		
		return nfe;
	}

	/**
	 * Conta de 0 até o valor recebido
	 * @param valor
	 */
	private void contarAte(int valor) {
		System.out.println("Contando até "+valor+" para fingir um processamento");
		for (int i=0; i<valor; i++) {
		}
		System.out.println("Fim da contagem");
	}
	
	/**
	 * Obtém o objeto NotaFiscal através de um XML em String
	 * 
	 * @param xml
	 * @return NotaFiscal
	 */
	private NotaFiscal fromXML(String xml) {
		XStream xstream = getXStream();
		return (NotaFiscal) xstream.fromXML(xml);
	}
	
	/**
	 * Converte o objeto NotaFiscal em um XML para devolver no WS
	 * 
	 * @param nfe
	 * @return String (xml)
	 */
	private String toXML(NotaFiscal nfe) {
		XStream xstream = getXStream();
		return xstream.toXML(nfe);
	}
	
	/**
	 * Cria uma instância do XStream, faz com que a instância leia as anotações automaticamente e o retorna 
	 * 
	 * @return XStream
	 */
	private XStream getXStream() {
		XStream xstream = new XStream(new DomDriver());
		//xstream.autodetectAnnotations(Boolean.TRUE);
		return xstream;
	}
}
