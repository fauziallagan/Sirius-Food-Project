package com.fauziallagan.javaLearningProject;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Kurs {
        public static Object KursConvert() {
            DecimalFormat kursIndo = (DecimalFormat) DecimalFormat.getCurrencyInstance();
            DecimalFormatSymbols formatRP = new DecimalFormatSymbols();
            formatRP.setCurrencySymbol("Rp. ");
            formatRP.setMonetaryDecimalSeparator(',');
            formatRP.setGroupingSeparator('.');
            kursIndo.setDecimalFormatSymbols(formatRP);
            return kursIndo;
        }
    }

