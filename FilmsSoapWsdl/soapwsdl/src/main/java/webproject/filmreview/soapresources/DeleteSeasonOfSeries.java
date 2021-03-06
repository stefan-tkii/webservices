
package webproject.filmreview.soapresources;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeleteSeasonOfSeries complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeleteSeasonOfSeries">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SeriesID" type="{http://SoapResources.filmreview.webproject/}seriesID" minOccurs="0"/>
 *         &lt;element name="SeasonID" type="{http://SoapResources.filmreview.webproject/}seasonID" minOccurs="0"/>
 *         &lt;element name="TokenPojo" type="{http://SoapResources.filmreview.webproject/}tokenPojo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteSeasonOfSeries", propOrder = {
    "seriesID",
    "seasonID",
    "tokenPojo"
})
public class DeleteSeasonOfSeries {

    @XmlElement(name = "SeriesID")
    protected SeriesID seriesID;
    @XmlElement(name = "SeasonID")
    protected SeasonID seasonID;
    @XmlElement(name = "TokenPojo")
    protected TokenPojo tokenPojo;

    /**
     * Gets the value of the seriesID property.
     * 
     * @return
     *     possible object is
     *     {@link SeriesID }
     *     
     */
    public SeriesID getSeriesID() {
        return seriesID;
    }

    /**
     * Sets the value of the seriesID property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeriesID }
     *     
     */
    public void setSeriesID(SeriesID value) {
        this.seriesID = value;
    }

    /**
     * Gets the value of the seasonID property.
     * 
     * @return
     *     possible object is
     *     {@link SeasonID }
     *     
     */
    public SeasonID getSeasonID() {
        return seasonID;
    }

    /**
     * Sets the value of the seasonID property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeasonID }
     *     
     */
    public void setSeasonID(SeasonID value) {
        this.seasonID = value;
    }

    /**
     * Gets the value of the tokenPojo property.
     * 
     * @return
     *     possible object is
     *     {@link TokenPojo }
     *     
     */
    public TokenPojo getTokenPojo() {
        return tokenPojo;
    }

    /**
     * Sets the value of the tokenPojo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TokenPojo }
     *     
     */
    public void setTokenPojo(TokenPojo value) {
        this.tokenPojo = value;
    }

}
