package com.wzshaopei.xml.root;
import com.wzshaopei.xml.model.Actions;
import com.wzshaopei.xml.model.Properties;
import com.wzshaopei.xml.model.builders.Builders;
import com.wzshaopei.xml.model.publishers.Publishers;
import com.wzshaopei.xml.model.scm.ProjectScm;
import com.wzshaopei.xml.model.triggers.Triggers;
import lombok.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * root element for ant  gradle and so on
 */
@Data
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Project {

    @XmlElement(name = "actions")
    private Actions actions;
    private String  description = "";
    private boolean keepDependencies;

    @XmlElement(name = "properties")
    private Properties properties;

    @XmlElement(name = "scm")
    private ProjectScm scm;

    private boolean canRoam = true;

    private boolean disabled;

    private boolean blockBuildWhenDownstreamBuilding;

    private boolean blockBuildWhenUpstreamBuilding;

    @XmlElement(name = "triggers")
    private Triggers triggers;

    private boolean concurrentBuild;

    @XmlElement(name = "builders")
    private Builders builders;

    @XmlElement(name = "publishers")
    private Publishers publishers;
}
