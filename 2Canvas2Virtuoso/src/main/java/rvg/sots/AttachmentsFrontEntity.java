package rvg.sots;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

/**
 * Created by charmingc0d3r on 23.11.16..
 */
@XmlRootElement
public class AttachmentsFrontEntity extends AttachmentsEntity {
    private ArrayList<String> competencies = new ArrayList<String>();
    private String attachmentType;

    public ArrayList<String> getCompetencies() {
        return competencies;
    }

    public void setCompetencies(ArrayList<String> competencies) {
        this.competencies = competencies;
    }

    public String getAttachmentType() {
        return attachmentType;
    }

    public void setAttachmentType(String attachmentType) {
        this.attachmentType = attachmentType;
    }

    public void addCompetency(String competency) {
        competencies.add(competency);
    }
}
