package com.fanxl.design.pattern.creational.prototype.manager;

/**
 * @author fanxl12
 * @description
 * @date 2019/7/4 11:39
 */
public class PmTest {

    public static void main(String[] args) {
        PrototypeManager pm = PrototypeManager.getInstance();
        OfficialDocument doc1, doc2, doc3, doc4;
        doc1 = pm.getOfficialDocument("far");
        doc2 = pm.getOfficialDocument("far");
        doc1.display();
        doc2.display();
        System.out.println(doc1 == doc2);

        doc3 = pm.getOfficialDocument("sas");
        doc4 = pm.getOfficialDocument("sas");
        doc3.display();
        doc4.display();
        System.out.println(doc3 == doc4);
    }

}
