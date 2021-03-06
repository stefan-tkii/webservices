package webproject.filmreview.Models;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class SeasonID implements Serializable
{
    private static final long serialVersionUID = 1L;
    
    private String Id;

    public SeasonID() {
    }

    public SeasonID(String Id) {
        this.Id = Id;
    }

    public String getId() {
        return this.Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

}