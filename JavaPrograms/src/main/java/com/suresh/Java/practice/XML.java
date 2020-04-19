package com.suresh.Java.practice;

import java.io.StringReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.CharacterData;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public class XML {
	public static String getCharacterDataFromElement(Element e) {
		String strOutput = "";
		Node child = e.getFirstChild();
		if (child instanceof CharacterData) {
			CharacterData cd = (CharacterData) child;
			strOutput = cd.getData();
			return strOutput;
		}
		return strOutput;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String xmlRecords = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><auditHistoryRecord><AEID>AEID_20180221_103719</AEID><eventInstanceId>770917438</eventInstanceId><eventTerm>TestEventTerm</eventTerm><eventType>Auto_JudiEvent1</eventType><metadatas><metadata><id>770917440</id><isDate>false</isDate><trialMetadataId>769257438</trialMetadataId><value>CustomMetaData1</value></metadata><metadata><id>770917442</id><isDate>false</isDate><trialMetadataId>769265459</trialMetadataId><value>Auto_udw_Judi1</value></metadata><metadata><id>770917444</id><isDate>false</isDate><trialMetadataId>769265475</trialMetadataId><value>Auto_udw_Site1</value></metadata><metadata><id>770917446</id><isDate>false</isDate><trialMetadataId>769265491</trialMetadataId><value>Auto_udw_Subject1</value></metadata><metadata><id>770917448</id><isDate>false</isDate><trialMetadataId>769265507</trialMetadataId><value>Auto_JudiEvent1</value></metadata><metadata><id>770917450</id><isDate>false</isDate><trialMetadataId>769265523</trialMetadataId><value>AEID_20180221_103719</value></metadata></metadatas><onsetDate>2018-02-21 00:00:00.0</onsetDate><site>Auto_udw_Site1</site><subject>Auto_udw_Subject1</subject><trial>Auto_udw_Judi1</trial></auditHistoryRecord>";
		try {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			InputSource is = new InputSource();
			is.setCharacterStream(new StringReader(xmlRecords));
			Document doc = db.parse(is);
			NodeList nodes = doc.getElementsByTagName("auditHistoryRecord");
			for (int i = 0; i < nodes.getLength(); i++) {
				Element element = (Element) nodes.item(i);
				String[] str = {"AEID","site","subject","eventType","eventTerm"};
				for(int j=0;j<str.length;j++) {
					NodeList name = element.getElementsByTagName(str[j]);
					Element line = (Element) name.item(0);
					String value = getCharacterDataFromElement(line);
					System.out.println(value);
				}
				
				

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	

}
