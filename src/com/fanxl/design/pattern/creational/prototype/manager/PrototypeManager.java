package com.fanxl.design.pattern.creational.prototype.manager;

import java.util.Hashtable;

/**
 * @author fanxl12
 * @description
 * @date 2019/7/4 11:34
 */
public class PrototypeManager {

    private static PrototypeManager pm = new PrototypeManager();

    private Hashtable<String, OfficialDocument> ht = new Hashtable<>();

    private PrototypeManager() {
        ht.put("sas", new SAS());
        ht.put("far", new FAR());
    }

    public OfficialDocument getOfficialDocument(String key){
        return ht.get(key).clone();
    }

    public void addOfficialDocument(String key, OfficialDocument officialDocument) {
        ht.put(key, officialDocument);
    }

    public static PrototypeManager getInstance() {
        return pm;
    }

}
