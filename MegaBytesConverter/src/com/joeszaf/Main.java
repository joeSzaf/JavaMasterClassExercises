package com.joeszaf;

public class Main {

    public static void main(String[] args) {
	    printMegaBytesAndKiloBytes(2500);
	    printMegaBytesAndKiloBytes(-1024);
	    printMegaBytesAndKiloBytes(5000);
	    printMegaBytesAndKiloBytes(0);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        String output;
        if (kiloBytes < 0) {
            output = "Invalid Value";
        } else {
            int megaBytes = kiloBytes / 1024;
            int remainingKiloBytes = kiloBytes % 1024;
            output = String.format("%d KB = %d MB and %d KB", kiloBytes, megaBytes, remainingKiloBytes);
        }
        System.out.println(output);
    }
}
