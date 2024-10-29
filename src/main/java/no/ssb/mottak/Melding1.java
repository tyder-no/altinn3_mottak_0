package no.ssb.mottak ;


import java.io.Serializable;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for melding1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="melding1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InternInfo"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="raNummer" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="skjemaVersjon" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="undersoekelsesNr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="undersoekelsesInfoUrl" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="visOppgaveByrde" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="visBrukeropplevelse" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="delregNr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="periodeFritekst" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="periodeFomDato" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="periodeTomDato" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="periodeType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="periodeNummer" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="periodeAAr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="periodeDato" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="enhetsIdent" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="enhetsType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="enhetsOrgNr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="enhetsNavn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="enhetsGateadresse" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="enhetsPostnr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="enhetsPoststed" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="enhetsAvdeling" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="reporteeOrgNr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Kontakt"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="kontaktPersonNavn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="kontaktPersonEpost" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="kontaktPersonTelefon" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="kontaktInfoBekreftet" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="kontaktInfoKommentar" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SkjemaTekster"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="skjemaNavnNB" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="skjemaNavnNN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="skjemaNavnEN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Hjelpefelter"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="skjemaNavn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="dataFormatProvider" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="dataFormatId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="dataFormatVersion" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "melding1", propOrder = {
    "internInfo",
    "kontakt",
    "skjemaTekster",
    "hjelpefelter"
})
@XmlRootElement(name = "melding1")
public class Melding1
    implements Serializable
{

    private final static long serialVersionUID = -1L;
    @XmlElement(name = "InternInfo", required = true)
    protected Melding1 .InternInfo internInfo;
    @XmlElement(name = "Kontakt", required = true)
    protected Melding1 .Kontakt kontakt;
    @XmlElement(name = "SkjemaTekster", required = true)
    protected Melding1 .SkjemaTekster skjemaTekster;
    @XmlElement(name = "Hjelpefelter", required = true)
    protected Melding1 .Hjelpefelter hjelpefelter;
    @XmlAttribute(name = "dataFormatProvider")
    protected String dataFormatProvider;
    @XmlAttribute(name = "dataFormatId")
    protected String dataFormatId;
    @XmlAttribute(name = "dataFormatVersion")
    protected String dataFormatVersion;

    /**
     * Gets the value of the internInfo property.
     * 
     * @return
     *     possible object is
     *     {@link Melding1 .InternInfo }
     *     
     */
    public Melding1 .InternInfo getInternInfo() {
        return internInfo;
    }

    /**
     * Sets the value of the internInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Melding1 .InternInfo }
     *     
     */
    public void setInternInfo(Melding1 .InternInfo value) {
        this.internInfo = value;
    }

    /**
     * Gets the value of the kontakt property.
     * 
     * @return
     *     possible object is
     *     {@link Melding1 .Kontakt }
     *     
     */
    public Melding1 .Kontakt getKontakt() {
        return kontakt;
    }

    /**
     * Sets the value of the kontakt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Melding1 .Kontakt }
     *     
     */
    public void setKontakt(Melding1 .Kontakt value) {
        this.kontakt = value;
    }

    /**
     * Gets the value of the skjemaTekster property.
     * 
     * @return
     *     possible object is
     *     {@link Melding1 .SkjemaTekster }
     *     
     */
    public Melding1 .SkjemaTekster getSkjemaTekster() {
        return skjemaTekster;
    }

    /**
     * Sets the value of the skjemaTekster property.
     * 
     * @param value
     *     allowed object is
     *     {@link Melding1 .SkjemaTekster }
     *     
     */
    public void setSkjemaTekster(Melding1 .SkjemaTekster value) {
        this.skjemaTekster = value;
    }

    /**
     * Gets the value of the hjelpefelter property.
     * 
     * @return
     *     possible object is
     *     {@link Melding1 .Hjelpefelter }
     *     
     */
    public Melding1 .Hjelpefelter getHjelpefelter() {
        return hjelpefelter;
    }

    /**
     * Sets the value of the hjelpefelter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Melding1 .Hjelpefelter }
     *     
     */
    public void setHjelpefelter(Melding1 .Hjelpefelter value) {
        this.hjelpefelter = value;
    }

    /**
     * Gets the value of the dataFormatProvider property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataFormatProvider() {
        return dataFormatProvider;
    }

    /**
     * Sets the value of the dataFormatProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataFormatProvider(String value) {
        this.dataFormatProvider = value;
    }

    /**
     * Gets the value of the dataFormatId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataFormatId() {
        return dataFormatId;
    }

    /**
     * Sets the value of the dataFormatId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataFormatId(String value) {
        this.dataFormatId = value;
    }

    /**
     * Gets the value of the dataFormatVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataFormatVersion() {
        return dataFormatVersion;
    }

    /**
     * Sets the value of the dataFormatVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataFormatVersion(String value) {
        this.dataFormatVersion = value;
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
     *         &lt;element name="skjemaNavn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "skjemaNavn"
    })
    public static class Hjelpefelter
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(required = true)
        protected String skjemaNavn;

        /**
         * Gets the value of the skjemaNavn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSkjemaNavn() {
            return skjemaNavn;
        }

        /**
         * Sets the value of the skjemaNavn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSkjemaNavn(String value) {
            this.skjemaNavn = value;
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
     *         &lt;element name="raNummer" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="skjemaVersjon" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="undersoekelsesNr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="undersoekelsesInfoUrl" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="visOppgaveByrde" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="visBrukeropplevelse" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="delregNr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="periodeFritekst" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="periodeFomDato" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="periodeTomDato" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="periodeType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="periodeNummer" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="periodeAAr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="periodeDato" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="enhetsIdent" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="enhetsType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="enhetsOrgNr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="enhetsNavn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="enhetsGateadresse" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="enhetsPostnr" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="enhetsPoststed" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="enhetsAvdeling" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "raNummer",
        "skjemaVersjon",
        "undersoekelsesNr",
        "undersoekelsesInfoUrl",
        "visOppgaveByrde",
        "visBrukeropplevelse",
        "delregNr",
        "periodeFritekst",
        "periodeFomDato",
        "periodeTomDato",
        "periodeType",
        "periodeNummer",
        "periodeAAr",
        "periodeDato",
        "enhetsIdent",
        "enhetsType",
        "enhetsOrgNr",
        "enhetsNavn",
        "enhetsGateadresse",
        "enhetsPostnr",
        "enhetsPoststed",
        "enhetsAvdeling",
        "reporteeOrgNr"
    })
    public static class InternInfo
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(required = true)
        protected String raNummer;
        @XmlElement(required = true)
        protected String skjemaVersjon;
        @XmlElement(required = true)
        protected String undersoekelsesNr;
        @XmlElement(required = true)
        protected String undersoekelsesInfoUrl;
        @XmlElement(required = true)
        protected String visOppgaveByrde;
        @XmlElement(required = true)
        protected String visBrukeropplevelse;
        @XmlElement(required = true)
        protected String delregNr;
        @XmlElement(required = true)
        protected String periodeFritekst;
        @XmlElement(required = true)
        protected String periodeFomDato;
        @XmlElement(required = true)
        protected String periodeTomDato;
        @XmlElement(required = true)
        protected String periodeType;
        @XmlElement(required = true)
        protected String periodeNummer;
        @XmlElement(required = true)
        protected String periodeAAr;
        @XmlElement(required = true)
        protected String periodeDato;
        @XmlElement(required = true)
        protected String enhetsIdent;
        @XmlElement(required = true)
        protected String enhetsType;
        @XmlElement(required = true)
        protected String enhetsOrgNr;
        @XmlElement(required = true)
        protected String enhetsNavn;
        @XmlElement(required = true)
        protected String enhetsGateadresse;
        @XmlElement(required = true)
        protected String enhetsPostnr;
        @XmlElement(required = true)
        protected String enhetsPoststed;
        @XmlElement(required = true)
        protected String enhetsAvdeling;
        @XmlElement(required = true)
        protected String reporteeOrgNr;

        /**
         * Gets the value of the raNummer property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRaNummer() {
            return raNummer;
        }

        /**
         * Sets the value of the raNummer property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRaNummer(String value) {
            this.raNummer = value;
        }

        /**
         * Gets the value of the skjemaVersjon property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSkjemaVersjon() {
            return skjemaVersjon;
        }

        /**
         * Sets the value of the skjemaVersjon property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSkjemaVersjon(String value) {
            this.skjemaVersjon = value;
        }

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
         * Gets the value of the undersoekelsesInfoUrl property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUndersoekelsesInfoUrl() {
            return undersoekelsesInfoUrl;
        }

        /**
         * Sets the value of the undersoekelsesInfoUrl property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUndersoekelsesInfoUrl(String value) {
            this.undersoekelsesInfoUrl = value;
        }

        /**
         * Gets the value of the visOppgaveByrde property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVisOppgaveByrde() {
            return visOppgaveByrde;
        }

        /**
         * Sets the value of the visOppgaveByrde property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVisOppgaveByrde(String value) {
            this.visOppgaveByrde = value;
        }

        /**
         * Gets the value of the visBrukeropplevelse property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVisBrukeropplevelse() {
            return visBrukeropplevelse;
        }

        /**
         * Sets the value of the visBrukeropplevelse property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVisBrukeropplevelse(String value) {
            this.visBrukeropplevelse = value;
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
         * Gets the value of the periodeFomDato property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPeriodeFomDato() {
            return periodeFomDato;
        }

        /**
         * Sets the value of the periodeFomDato property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPeriodeFomDato(String value) {
            this.periodeFomDato = value;
        }

        /**
         * Gets the value of the periodeTomDato property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPeriodeTomDato() {
            return periodeTomDato;
        }

        /**
         * Sets the value of the periodeTomDato property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPeriodeTomDato(String value) {
            this.periodeTomDato = value;
        }

        /**
         * Gets the value of the periodeType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPeriodeType() {
            return periodeType;
        }

        /**
         * Sets the value of the periodeType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPeriodeType(String value) {
            this.periodeType = value;
        }

        /**
         * Gets the value of the periodeNummer property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPeriodeNummer() {
            return periodeNummer;
        }

        /**
         * Sets the value of the periodeNummer property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPeriodeNummer(String value) {
            this.periodeNummer = value;
        }

        /**
         * Gets the value of the periodeAAr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPeriodeAAr() {
            return periodeAAr;
        }

        /**
         * Sets the value of the periodeAAr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPeriodeAAr(String value) {
            this.periodeAAr = value;
        }

        /**
         * Gets the value of the periodeDato property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPeriodeDato() {
            return periodeDato;
        }

        /**
         * Sets the value of the periodeDato property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPeriodeDato(String value) {
            this.periodeDato = value;
        }

        /**
         * Gets the value of the enhetsIdent property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEnhetsIdent() {
            return enhetsIdent;
        }

        /**
         * Sets the value of the enhetsIdent property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEnhetsIdent(String value) {
            this.enhetsIdent = value;
        }

        /**
         * Gets the value of the enhetsType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEnhetsType() {
            return enhetsType;
        }

        /**
         * Sets the value of the enhetsType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEnhetsType(String value) {
            this.enhetsType = value;
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
         * Gets the value of the enhetsNavn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEnhetsNavn() {
            return enhetsNavn;
        }

        /**
         * Sets the value of the enhetsNavn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEnhetsNavn(String value) {
            this.enhetsNavn = value;
        }

        /**
         * Gets the value of the enhetsGateadresse property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEnhetsGateadresse() {
            return enhetsGateadresse;
        }

        /**
         * Sets the value of the enhetsGateadresse property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEnhetsGateadresse(String value) {
            this.enhetsGateadresse = value;
        }

        /**
         * Gets the value of the enhetsPostnr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEnhetsPostnr() {
            return enhetsPostnr;
        }

        /**
         * Sets the value of the enhetsPostnr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEnhetsPostnr(String value) {
            this.enhetsPostnr = value;
        }

        /**
         * Gets the value of the enhetsPoststed property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEnhetsPoststed() {
            return enhetsPoststed;
        }

        /**
         * Sets the value of the enhetsPoststed property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEnhetsPoststed(String value) {
            this.enhetsPoststed = value;
        }

        /**
         * Gets the value of the enhetsAvdeling property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEnhetsAvdeling() {
            return enhetsAvdeling;
        }

        /**
         * Sets the value of the enhetsAvdeling property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEnhetsAvdeling(String value) {
            this.enhetsAvdeling = value;
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
     *         &lt;element name="kontaktPersonNavn" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="kontaktPersonEpost" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="kontaktPersonTelefon" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="kontaktInfoBekreftet" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="kontaktInfoKommentar" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "kontaktPersonNavn",
        "kontaktPersonEpost",
        "kontaktPersonTelefon",
        "kontaktInfoBekreftet",
        "kontaktInfoKommentar"
    })
    public static class Kontakt
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(required = true)
        protected String kontaktPersonNavn;
        @XmlElement(required = true)
        protected String kontaktPersonEpost;
        @XmlElement(required = true)
        protected String kontaktPersonTelefon;
        @XmlElement(required = true)
        protected String kontaktInfoBekreftet;
        @XmlElement(required = true)
        protected String kontaktInfoKommentar;

        /**
         * Gets the value of the kontaktPersonNavn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKontaktPersonNavn() {
            return kontaktPersonNavn;
        }

        /**
         * Sets the value of the kontaktPersonNavn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKontaktPersonNavn(String value) {
            this.kontaktPersonNavn = value;
        }

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

        /**
         * Gets the value of the kontaktInfoBekreftet property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKontaktInfoBekreftet() {
            return kontaktInfoBekreftet;
        }

        /**
         * Sets the value of the kontaktInfoBekreftet property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKontaktInfoBekreftet(String value) {
            this.kontaktInfoBekreftet = value;
        }

        /**
         * Gets the value of the kontaktInfoKommentar property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKontaktInfoKommentar() {
            return kontaktInfoKommentar;
        }

        /**
         * Sets the value of the kontaktInfoKommentar property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKontaktInfoKommentar(String value) {
            this.kontaktInfoKommentar = value;
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
     *         &lt;element name="skjemaNavnNB" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="skjemaNavnNN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="skjemaNavnEN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "skjemaNavnNB",
        "skjemaNavnNN",
        "skjemaNavnEN"
    })
    public static class SkjemaTekster
        implements Serializable
    {

        private final static long serialVersionUID = -1L;
        @XmlElement(required = true)
        protected String skjemaNavnNB;
        @XmlElement(required = true)
        protected String skjemaNavnNN;
        @XmlElement(required = true)
        protected String skjemaNavnEN;

        /**
         * Gets the value of the skjemaNavnNB property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSkjemaNavnNB() {
            return skjemaNavnNB;
        }

        /**
         * Sets the value of the skjemaNavnNB property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSkjemaNavnNB(String value) {
            this.skjemaNavnNB = value;
        }

        /**
         * Gets the value of the skjemaNavnNN property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSkjemaNavnNN() {
            return skjemaNavnNN;
        }

        /**
         * Sets the value of the skjemaNavnNN property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSkjemaNavnNN(String value) {
            this.skjemaNavnNN = value;
        }

        /**
         * Gets the value of the skjemaNavnEN property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSkjemaNavnEN() {
            return skjemaNavnEN;
        }

        /**
         * Sets the value of the skjemaNavnEN property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSkjemaNavnEN(String value) {
            this.skjemaNavnEN = value;
        }

    }

}
