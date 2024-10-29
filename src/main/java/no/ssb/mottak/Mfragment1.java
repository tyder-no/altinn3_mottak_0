package no.ssb.mottak ;

import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mfragment1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="mfragment1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Interninfo0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="undersoekelsesNr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="delregNr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="periodeFritekst" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="enhetsOrgNr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="reporteeOrgNr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Kontakt0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="kontaktPersonEpost" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="kontaktPersonTelefon" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mfragment1", propOrder = {
    "internInfo0",
    "kontakt0"
})
@XmlRootElement(name = "mfragment1")
public class Mfragment1
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "InternInfo0", required = true)
    protected Mfragment1 .InternInfo0 internInfo0;
    @XmlElement(name = "Kontakt0", required = true)
    protected Mfragment1 .Kontakt0 kontakt0;

    /**
     * Gets the value of the internInfo0 property.
     * 
     * @return
     *     possible object is
     *     {@link Mfragment1 .InternInfo0 }
     *     
     */
    public Mfragment1 .InternInfo0 getInternInfo0() {
        return internInfo0;
    }

    /**
     * Sets the value of the internInfo0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Mfragment1 .InternInfo0 }
     *     
     */
    public void setInternInfo0(Mfragment1 .InternInfo0 value) {
        this.internInfo0 = value;
    }

    /**
     * Gets the value of the kontakt0 property.
     * 
     * @return
     *     possible object is
     *     {@link Mfragment1 .Kontakt0 }
     *     
     */
    public Mfragment1 .Kontakt0 getKontakt0() {
        return kontakt0;
    }

    /**
     * Sets the value of the kontakt0 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Mfragment1 .Kontakt0 }
     *     
     */
    public void setKontakt0(Mfragment1 .Kontakt0 value) {
        this.kontakt0 = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="undersoekelsesNr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="delregNr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="periodeFritekst" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="enhetsOrgNr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="reporteeOrgNr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "undersoekelsesNr",
        "delregNr",
        "periodeFritekst",
        "enhetsOrgNr",
        "reporteeOrgNr"
    })
    public static class InternInfo0
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(required = true)
        protected String undersoekelsesNr;
        @XmlElement(required = true)
        protected String delregNr;
        @XmlElement(required = true)
        protected String periodeFritekst;
        @XmlElement(required = true)
        protected String enhetsOrgNr;
        @XmlElement(required = true)
        protected String reporteeOrgNr;

        /**
         * Gets the value of the undersoekelsesNr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUndersoekelsesNr() {
            return undersoekelsesNr;
        }

        /**
         * Sets the value of the undersoekelsesNr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUndersoekelsesNr(String value) {
            this.undersoekelsesNr = value;
        }

        /**
         * Gets the value of the delregNr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDelregNr() {
            return delregNr;
        }

        /**
         * Sets the value of the delregNr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDelregNr(String value) {
            this.delregNr = value;
        }

        /**
         * Gets the value of the periodeFritekst property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPeriodeFritekst() {
            return periodeFritekst;
        }

        /**
         * Sets the value of the periodeFritekst property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPeriodeFritekst(String value) {
            this.periodeFritekst = value;
        }

        /**
         * Gets the value of the enhetsOrgNr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEnhetsOrgNr() {
            return enhetsOrgNr;
        }

        /**
         * Sets the value of the enhetsOrgNr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEnhetsOrgNr(String value) {
            this.enhetsOrgNr = value;
        }

        /**
         * Gets the value of the reporteeOrgNr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReporteeOrgNr() {
            return reporteeOrgNr;
        }

        /**
         * Sets the value of the reporteeOrgNr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReporteeOrgNr(String value) {
            this.reporteeOrgNr = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="kontaktPersonEpost" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="kontaktPersonTelefon" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "kontaktPersonEpost",
        "kontaktPersonTelefon"
    })
    public static class Kontakt0
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(required = true)
        protected String kontaktPersonEpost;
        @XmlElement(required = true)
        protected String kontaktPersonTelefon;

        /**
         * Gets the value of the kontaktPersonEpost property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKontaktPersonEpost() {
            return kontaktPersonEpost;
        }

        /**
         * Sets the value of the kontaktPersonEpost property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKontaktPersonEpost(String value) {
            this.kontaktPersonEpost = value;
        }

        /**
         * Gets the value of the kontaktPersonTelefon property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKontaktPersonTelefon() {
            return kontaktPersonTelefon;
        }

        /**
         * Sets the value of the kontaktPersonTelefon property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKontaktPersonTelefon(String value) {
            this.kontaktPersonTelefon = value;
        }

    }

}
