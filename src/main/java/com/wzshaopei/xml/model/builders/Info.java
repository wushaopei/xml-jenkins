package com.wzshaopei.xml.model.builders;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
public class Info {
    private String propertiesFilePath = "${WORKSPACE}/env.conf";
}
