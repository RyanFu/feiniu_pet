//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.06.21 at 05:21:00 PM CST 
//


package com.lvmama.elong.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnumCurrencyCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EnumCurrencyCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RMB"/>
 *     &lt;enumeration value="USD"/>
 *     &lt;enumeration value="HKD"/>
 *     &lt;enumeration value="MOP"/>
 *     &lt;enumeration value="SGD"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EnumCurrencyCode")
@XmlEnum
public enum EnumCurrencyCode {

    RMB,
    USD,
    HKD,
    MOP,
    CNY,
    SGD;

    public String value() {
        return name();
    }

    public static EnumCurrencyCode fromValue(String v) {
        return valueOf(v);
    }

}
