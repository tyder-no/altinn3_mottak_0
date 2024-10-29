package no.ssb.mottak.test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import java.util.TimeZone;
import java.util.Comparator;
import java.util.Objects;
import java.net.URL;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

import org.apache.commons.io.FileUtils;
import no.ssb.mottak.Mfragment1 ;
import no.ssb.mottak.ObjectFactory ;
import no.ssb.mottak.Melding1 ;

import no.ssb.mottak.Mfragment1.InternInfo0 ;
import no.ssb.mottak.Mfragment1.Kontakt0 ;
import no.ssb.mottak.Melding1.InternInfo ;
import no.ssb.mottak.Melding1.Kontakt ;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
//import org.junit.jupiter.api.Lifecycle;

//import org.junit.jupiter.api.FixMethodOrder;

//import org.junit.runners.jupiter.api.MethodSorters;



//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class JaxbIntegrationTest {

    private ObjectFactory xmlObjectFactory;
    private Mfragment1 mfragment1 ;
    private Mfragment1.InternInfo0 mfrag1IInfo0 ;
    private Mfragment1.Kontakt0 mfrag1Kontakt0 ;
    private Melding1.InternInfo mfrag1IInfo ;
    private Melding1.Kontakt mfrag1Kontakt ;
   
    private JAXBContext context;
    private Marshaller marshaller;
    private Unmarshaller unmarshaller;


      public JaxbIntegrationTest() {
	  // inputFilesEncoding = "Cp1252";
        xmlObjectFactory = new ObjectFactory();
        mfragment1 = xmlObjectFactory.createMfragment1();
        mfrag1IInfo0 = xmlObjectFactory.createMfragment1InternInfo0() ;
        mfrag1Kontakt0 = xmlObjectFactory.createMfragment1Kontakt0() ;


        try {
            context = JAXBContext.newInstance(ObjectFactory.class);
            marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            unmarshaller = context.createUnmarshaller();
	    
        } catch (JAXBException jbe) {
            jbe.printStackTrace();
        }
    }

    @BeforeAll
    public  void before() throws JAXBException {


	//
	mfrag1IInfo0.setUndersoekelsesNr("740") ;
	mfrag1IInfo0.setDelregNr("137750125") ;
	mfrag1IInfo0.setPeriodeFritekst("januar 2025") ;
	mfrag1IInfo0.setEnhetsOrgNr("910452762") ;
	mfrag1IInfo0.setReporteeOrgNr("910452762") ;
	//
        mfrag1Kontakt0.setKontaktPersonEpost("tad@ssb.no") ;
        mfrag1Kontakt0.setKontaktPersonTelefon("90622943") ;
	//
	mfragment1.setInternInfo0(mfrag1IInfo0) ;
	mfragment1.setKontakt0(mfrag1Kontakt0) ;
        try {
	marshaller.marshal(mfragment1, new File(this.getClass().getResource("/").getPath() + "/mfragment1.xml"));
     	//System.out.println(unMarshallermfragment1.getKontakt0().getKontaktPersonEpost()) ;

       // Get the resource using the ClassLoader
        URL resourceUrl = getClass().getClassLoader().getResource("Mfragment1_001.xml");
        // Convert URL to File to get the absolute path
        File resourceFile = new File(resourceUrl.getPath());
        System.out.println("Path to Mfragment1_001.xml: " + resourceFile.getAbsolutePath());

     
        URL resourceUrl2 = getClass().getClassLoader().getResource("form_ea479ef26c49_1.xml");
        File resourceFile2 = new File(resourceUrl2.getPath());
        Melding1 unMarshallerM1 = (Melding1) unmarshaller.unmarshal(new FileReader(resourceFile2));
	
	//String mfragment1File = this.getClass().getResource("/mfragment1.xml").getFile();
        //Mfragment1 unMarshallermfragment1 = (Mfragment1) unmarshaller.unmarshal(new FileReader(mfragment1File));
        Mfragment1 unMarshallermfragment1 = (Mfragment1) unmarshaller.unmarshal(new FileReader(resourceFile));

	
	}
	catch  (Exception e) {
	    e.printStackTrace() ;
	}
        context = JAXBContext.newInstance(Mfragment1.class);
    }

    @Test
    public void marshal() throws JAXBException, IOException {
	
	//  Marshaller marshaller = context.createMarshaller();
	// marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        marshaller.marshal(mfragment1, new File(this.getClass().getResource("/").getPath() + "/mfragment1.xml"));

    }

    @Test
    public void unmarshal() throws JAXBException, IOException {
	
	//  Unmarshaller unmarshaller = context.createUnmarshaller();
        String mfragment1File = this.getClass().getResource("/mfragment1.xml").getFile();
        Mfragment1 unMarshallermfragment1 = (Mfragment1) unmarshaller.unmarshal(new FileReader(mfragment1File));
	String epost1 = mfragment1.getKontakt0().getKontaktPersonEpost() ;
	String epost2 = unMarshallermfragment1.getKontakt0().getKontaktPersonEpost() ;
	//System.out.println(unMarshallermfragment1.getKontakt().getKontaktPersonEpost()) ;
        assertTrue(Objects.equals(epost1,epost2));
	
    }

    @Test
    public void unmarshalMelding() throws JAXBException, IOException {

        URL resourceUrl2 = getClass().getClassLoader().getResource("form_ea479ef26c49_1.xml");
        File resourceFile2 = new File(resourceUrl2.getPath());
        Melding1 unMarshallerM1 = (Melding1) unmarshaller.unmarshal(new FileReader(resourceFile2));
	String epost2 = unMarshallerM1.getKontakt().getKontaktPersonEpost() ;
        assertTrue(epost2.equals("vcp@ssb.no"));
	
    }

    
}
