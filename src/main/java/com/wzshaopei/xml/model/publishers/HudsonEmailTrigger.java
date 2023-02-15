package com.wzshaopei.xml.model.publishers;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class HudsonEmailTrigger {

    @XmlElement(name = "email")
    private Email email;
}
