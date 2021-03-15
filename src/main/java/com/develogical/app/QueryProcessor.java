package com.develogical.app;

public class QueryProcessor {
    public String process(String query) {
        if (query.toLowerCase().contains("oxxford")) {
            return "Oxford is the county town and only city of Oxfordshire, England." +
                    " In 2017, its population was recorded at 152,450. It is 56 miles (90 km) northwest of London," +
                    " 64 miles (103 km) southeast of Birmingham, and 61 miles (98 km) northeast of Bristol.\n" +
                    "\n" +
                    "The city is home to the University of Oxford, the oldest university in the English-speaking world," +
                    " and has buildings in every style of English architecture from late Anglo-Saxon. " +
                    "Oxford's industries include motor manufacturing, education, publishing, " +
                    "information technology and science.";
        }
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        return "";
    }
}
