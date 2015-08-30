package com.dyesofindignation.pack;

import static com.dyesofindignation.namegenerator.Namegen.namegen;

/**
 * Created by Lord Ratte on 2015/06/27.
 */
public class Session {
    public String query(String sIn) {
        switch (sIn) {
            case "name":
                return namegen(this.getClass());
            default:
                return null;
        }
    }
}
