
package br.com.oobj.cxf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de consomeXML complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="consomeXML">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nfeEmXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consomeXML", propOrder = {
    "nfeEmXML"
})
public class ConsomeXML {

    protected String nfeEmXML;

    /**
     * Obtém o valor da propriedade nfeEmXML.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNfeEmXML() {
        return nfeEmXML;
    }

    /**
     * Define o valor da propriedade nfeEmXML.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNfeEmXML(String value) {
        this.nfeEmXML = value;
    }

}
