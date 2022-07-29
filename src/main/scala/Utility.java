package com.interview;

public class Utility {
    public static final String printArray(Object[] obj) {
        if(obj == null)
            return null;

        StringBuffer buf = new StringBuffer();
        for(int i=0; i < obj.length; i++) {
            if(obj[i] != null) {
                buf.append(obj[i].toString());
            } else {
                buf.append("null");
            }

            if(i < obj.length - 1) {
                buf.append(", ");
            }
        }

        return buf.toString();
    }
}
